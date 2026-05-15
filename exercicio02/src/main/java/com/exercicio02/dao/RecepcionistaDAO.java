package com.exercicio02.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.exercicio02.models.Recepcionista;

public class RecepcionistaDAO {
    private ConexaoMariaDB conexao = new ConexaoMariaDB();

    public RecepcionistaDAO() {
        String sql = "create table if not exists recepcionista (\n" +
                "    id INT PRIMARY KEY,\n" +
                "    cpf VARCHAR(11) NOT NULL,\n" +
                "    nome VARCHAR(100) NOT NULL,\n" +
                "    telefone VARCHAR(11) NOT NULL,\n" +
                "    senha VARCHAR(20) NOT NULL\n" +
                ")";
        try {
            if (this.conexao.conectar()) {
                Statement stmt = this.conexao.criarStatement();
                stmt.execute(sql);
                System.out.println("Tabela de recepcionista criada");
            }
        } catch(SQLException err){
            System.err.println(err.getMessage());
        }finally {
            conexao.desconectar();
        }
    }

    public int inserir(Recepcionista recepcionista) {
        conexao.conectar();
        String sql = "insert into recepcionista(cpf, nome, senha, telefone) " +
                "values (?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setString(1, recepcionista.getCpf());
            stmt.setString(2, recepcionista.getNome());
            stmt.setString(3, recepcionista.getSenha());
            stmt.setString(4, recepcionista.getTelefone());
            return stmt.executeUpdate();
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        }
        finally {
            conexao.desconectar();
        }
    }

    public Recepcionista consultar(String cpf) {
        conexao.conectar();
        String sql = "select * from recepcionista where cpf=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        try {
            stmt.setString(1, cpf);
            ResultSet retorno = stmt.executeQuery();
            if (retorno.isClosed() == false) {
                return new Recepcionista(
                    retorno.getString("nome"),
                    retorno.getString("cpf"),
                    retorno.getString("telefone"),
                    retorno.getString("senha")
                );
            } else {
                return null;
            }
        } catch (Exception err) {
            System.err.println(err.getMessage());
            return null;
        }
    }
}
