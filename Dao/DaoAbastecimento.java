/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Abastecimento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class DaoAbastecimento {
    

     public void cadastrar(Abastecimento abastecimento) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO abastecimento (tipo,placa,quantidade,valor,motorista,data,km) values ('" + abastecimento.getTipo()+ "','" + abastecimento.getPlaca()+ "',"
                    + "'"+ abastecimento.getQuantidade()+ "','" + abastecimento.getValor()+ "','" + abastecimento.getMotorista() + "','" + abastecimento.getData() + "','" + abastecimento.getKm()+"')";


            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
            
      
            
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Abastecimento abastecimento) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE abastecimento set tipo='" + abastecimento.getTipo() +"'"
                   + ", placa ='"+ abastecimento.getPlaca()+"'"
                   + ", quantidade='"+ abastecimento.getQuantidade()+"'"
                   + ", valor='"+ abastecimento.getValor() +"'"
                   + ", motorista='"+ abastecimento.getMotorista()+"'"
                   + ", km ='"+ abastecimento.getKm()+"'"
                   + ", data ='"+ abastecimento.getData()+ "'"
                   +" where idabastecimento = '"+ abastecimento.getIdabastecimento()+ "'"
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
     
   public void excluir(Abastecimento abastecimento) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM abastecimento WHERE idabastecimento = '" + abastecimento.getIdabastecimento() + "'";
                    
            
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
        ArrayList<Abastecimento> array = new ArrayList<Abastecimento>();
        Abastecimento abastecimento;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM abastecimento WHERE placa='" + placa + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                abastecimento = new Abastecimento();
                
                abastecimento.setIdabastecimento(resultadoBusca.getString("idabastecimento"));
                abastecimento.setTipo(resultadoBusca.getString("tipo"));
                abastecimento.setPlaca(resultadoBusca.getString("placa"));
                abastecimento.setQuantidade(resultadoBusca.getString("quantidade"));
                abastecimento.setValor(resultadoBusca.getString("valor"));
                abastecimento.setMotorista(resultadoBusca.getString("motorista"));
                abastecimento.setKm(resultadoBusca.getString("km"));
                abastecimento.setData(resultadoBusca.getString("data"));
               
                
                //Adicionado a tarefa na lista
                array.add(abastecimento);
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
