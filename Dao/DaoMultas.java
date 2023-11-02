/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Multas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class DaoMultas {
    

     public void cadastrar(Multas multas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO multas (placa,descricao,valor) values ('" + multas.getPlaca()+ "','" + multas.getDescricao()+ "',"
                    + "'"+ multas.getValor() +"')";

            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
            
      
            
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Multas multas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE multas set placa='" + multas.getPlaca() +"'"
                   + ", descricao ='"+ multas.getDescricao() +"'"
                   + ", valor='"+ multas.getValor()+"'"
                   +" where idmulta = '"+ multas.getIdmulta()+ "'"
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
     
   public void excluir(Multas multas) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM multas WHERE idmulta = '" + multas.getIdmulta() + "'";
                    
            
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
    public ArrayList buscar(String placa) {
        //Criando a lista
        ArrayList<Multas> array = new ArrayList<Multas>();
        Multas multas;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM multas WHERE placa='" + placa + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                multas = new Multas();
                
                multas.setIdmulta(resultadoBusca.getString("idmulta"));
                multas.setPlaca(resultadoBusca.getString("placa"));
                multas.setDescricao(resultadoBusca.getString("descricao"));
                multas.setValor(resultadoBusca.getString("valor"));
                
                //Adicionado a tarefa na lista
                array.add(multas);
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
