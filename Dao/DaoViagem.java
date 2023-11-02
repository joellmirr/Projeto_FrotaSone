/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Viagem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class DaoViagem {
    
  
     public void cadastrar(Viagem viagem) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO viagem (motorista,cpf,origem,destino,placa,dataida,datavolta,detalhes,status) values ('" + viagem.getMotorista() + "','" + viagem.getCpf() + "',"
                    + "'"+ viagem.getOrigem()+ "','" + viagem.getDestino()+ "','" + viagem.getPlacaveiculo()+ "','" + viagem.getDataida() + "','"  
                    + viagem.getDatavolta() + "','"+ viagem.getDetalhesviagem() + "','" + viagem.getStatus() +"')";


            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
            
      
            
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Viagem viagem) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE viagem set motorista='" + viagem.getMotorista() +"'"
                   + ", cpf ='"+ viagem.getCpf() +"'"
                   + ", origem='"+ viagem.getOrigem()+"'"
                   + ", destino='"+ viagem.getDestino() +"'"
                   + ", placa='"+ viagem.getPlacaveiculo()+"'"
                   + ", dataida='"+ viagem.getDataida() +"'"
                   + ", datavolta='"+ viagem.getDatavolta() +"'"
                   + ", detalhes='"+ viagem.getDetalhesviagem() +"'"
                   + ", status='"+ viagem.getStatus() +"'"
                   +" where idviagem = '"+ viagem.getIdviagem()+ "'"
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
     
   public void excluir(Viagem viagem) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM viagem WHERE idviagem = '" + viagem.getIdviagem() + "'";
                    
            
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
    public ArrayList buscar(String idviagem) {
        //Criando a lista
        ArrayList<Viagem> array = new ArrayList<Viagem>();
        Viagem viagem;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM viagem WHERE idviagem='" + idviagem + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                viagem = new Viagem();
                
                viagem.setIdviagem(resultadoBusca.getString("idviagem"));
                viagem.setMotorista(resultadoBusca.getString("motorista"));
                viagem.setCpf(resultadoBusca.getString("cpf"));
                viagem.setOrigem(resultadoBusca.getString("origem"));
                viagem.setDestino(resultadoBusca.getString("destino"));
                viagem.setPlacaveiculo(resultadoBusca.getString("placa"));
                viagem.setDataida(resultadoBusca.getString("dataida"));
                viagem.setDatavolta(resultadoBusca.getString("datavolta"));
                viagem.setDetalhesviagem(resultadoBusca.getString("detalhes"));
                viagem.setStatus(resultadoBusca.getString("status"));
                
                
                //Adicionado a tarefa na lista
                array.add(viagem);
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
