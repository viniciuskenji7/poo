package com.exercicio02.dao;


import com.exercicio02.models.Medico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {
    private ConexaoMariaDB conexao = new ConexaoMariaDB();

    public MedicoDAO() {
        String sql = "create table if not exists medico (\n" +
                "    id INT PRIMARY KEY,\n" +
                "    crm VARCHAR(7) NOT NULL,\n" +
                "    nome VARCHAR(100) NOT NULL,\n" +
                "    especialidade VARCHAR(100) NOT NULL,\n" +
                "    telefone VARCHAR(11) NOT NULL,\n" +
                "    senha VARCHAR(20) NOT NULL\n" +
                ")";
        try {
            if (this.conexao.conectar()) {
                Statement stmt = this.conexao.criarStatement();
                stmt.execute(sql);
                System.out.println("Tabela de médico criada");
            }
        } catch(SQLException err){
            System.err.println(err.getMessage());
        }finally {
            conexao.desconectar();
        }
    }

    public int inserir(Medico medico) {
        conexao.conectar();
        String sql = "insert into medico(crm, nome, senha, telefone, especialidade) " +
                "values (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setString(1, medico.getCrm());
            stmt.setString(2, medico.getNome());
            stmt.setString(3, medico.getSenha());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getEspecialidade());
            return stmt.executeUpdate();
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        }
        finally {
            conexao.desconectar();
        }
    }

    public Medico consultar(String crm) {
        conexao.conectar();
        String sql = "select * from cliente where codigo=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        try {
            stmt.setString(1, crm);
            ResultSet retorno = stmt.executeQuery();
            if (retorno.isClosed() == false) {
                return new Medico(
                    retorno.getString("crm"),
                    retorno.getString("especialidade"),
                    retorno.getString("nome"),
                    retorno.getString("senha"),
                    retorno.getString("telefone")
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
