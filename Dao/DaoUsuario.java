/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class DaoUsuario {
    
    
  public void cadastrar(Usuario usuario) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO usuario (login,nome,senha,status,perfil) values (" 
            
                    + "'" + usuario.getLogin()
                    + "','" + usuario.getNome()
                    + "','" + usuario.getSenha()
                    + "','" + usuario.getStatus()
                    + "','" + usuario.getPerfil()
                    + "')";


            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Usuario usuario) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE usuario set login='" 
                   + usuario.getLogin() +"'"
                   + ", nome='"+ usuario.getNome()+"'"
                   + ", senha='"+ usuario.getSenha()+"'"
                   + ", perfil='"+ usuario.getPerfil() +"'"
                   + ", status='"+ usuario.getStatus()+"'"
                   +" where codigo = '"+ usuario.getCodigo() + "'"
                    ;
                    
            JOptionPane.showMessageDialog(null, sql);
            
            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da alteração.");
            JOptionPane.showMessageDialog(null, e);
        } finally {
            conexao.fecharConexao();
        }
    }
     
   public void excluir(Usuario usuario) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM usuario WHERE login = '" + usuario.getLogin()+ "'";
                    
            
            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null, sql);
            
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da exclusão.");
            JOptionPane.showMessageDialog(null, e);
        } finally {
            conexao.fecharConexao();
        }
    }
    
    //Método para buscar as tarefas de determinada data 
    public ArrayList buscar(String login) {
        //Criando a lista
        ArrayList<Usuario> array = new ArrayList<Usuario>();
        Usuario usuario;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM usuario WHERE login='" + login + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                usuario = new Usuario();
                
                usuario.setCodigo(resultadoBusca.getString("codigo"));
                usuario.setLogin(resultadoBusca.getString("login"));
                usuario.setNome(resultadoBusca.getString("nome"));
                usuario.setSenha(resultadoBusca.getString("senha"));
                usuario.setPerfil(resultadoBusca.getString("perfil"));
                usuario.setStatus(resultadoBusca.getString("status"));

                
                //Adicionado a tarefa na lista
                array.add(usuario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da consulta.");
        } finally {
            conexao.fecharConexao();
        }
        
        //Retornando a lista
        return array;
    } 
    
    
public int login(Usuario usuario) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        ResultSet resultSet;
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "select * FROM usuario WHERE login = '" + usuario.getLogin()+ "' and senha = '" + usuario.getSenha()+"';";
                    
            
            statement = conexao.getCon().createStatement();
            //statement.executeQuery(sql);
            resultSet = statement.executeQuery(sql);
            
             int count = 0;
                while (resultSet.next()) {
                count++;
                
            }  
            
            if (count > 0) {
               // JOptionPane.showMessageDialog(null, "LOGIN OK!" );
                //JOptionPane.showMessageDialog(null, sql);
            return 1;
            } else {
                return 0;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NO LOGIN");
            JOptionPane.showMessageDialog(null, e);
            
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }    
        
    
}
