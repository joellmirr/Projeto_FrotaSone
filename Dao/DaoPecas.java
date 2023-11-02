/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Pecas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class DaoPecas {
    
     public void cadastrar(Pecas pecas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO pecas (nome,quantidade,descricao) values ('" + pecas.getNome() + "','" + pecas.getQuantidade() + "',"
                    + "'"+ pecas.getDescricao() +"')";


            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Pecas pecas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE pecas set nome='" + pecas.getNome() +"'"
                   + ", quantidade='"+ pecas.getQuantidade() +"'"
                   + ", descricao='"+ pecas.getDescricao() +"'"
                   +" where idpeca = '"+ pecas.getIdpeca() + "'"
                    ;
                    
            //JOptionPane.showMessageDialog(null, sql);
            
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
     
   public void excluir(Pecas pecas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM pecas WHERE idpeca = '" + pecas.getIdpeca()+  "'";
                    
            
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
    public ArrayList buscar(String nome) {
        //Criando a lista
        ArrayList<Pecas> array = new ArrayList<Pecas>();
        Pecas pecas;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM pecas WHERE nome like '%" + nome + "%';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
           // JOptionPane.showMessageDialog(null, sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                pecas = new Pecas();
                
                pecas.setIdpeca(resultadoBusca.getString("idpeca"));
                pecas.setNome(resultadoBusca.getString("nome"));
                pecas.setQuantidade(resultadoBusca.getString("quantidade"));
                pecas.setDescricao(resultadoBusca.getString("descricao"));
                
                //Adicionado a tarefa na lista
                array.add(pecas);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da consulta.");
        } finally {
            conexao.fecharConexao();
        }
        
        //Retornando a lista
        return array;
    }  
        
    
}
