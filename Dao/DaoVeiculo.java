/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.Veiculo;

/**
 *
 * @author Marcos
 */
public class DaoVeiculo {
    
     public void cadastrar(Veiculo veiculo) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO veiculos (codigo,placa,cidade_estado,marca,modelo,ano_fab_mod,seguro,seguradora,inicio_seguro,vencimento_seguro,status) values ('" + veiculo.getCodigo() + "','" + veiculo.getPlaca() + "',"
                    + "'"+ veiculo.getCidade_estado()+ "','" + veiculo.getMarca()+ "','" + veiculo.getModelo()+ "','" + veiculo.getAno_fab_mod() + "','"  
                    + veiculo.getSeguro() + "','"+ veiculo.getSeguradora() + "','" + veiculo.getInicio_seguro() + "','" + veiculo.getVencimento_seguro() + "','" + veiculo.getStatus() +"')";


            statement = conexao.getCon().createStatement();
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução do cadastro.");
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public void alterar(Veiculo veiculo) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE veiculos set codigo='" + veiculo.getCodigo() +"'"
                   + ", marca='"+ veiculo.getMarca() +"'"
                   + ", modelo='"+ veiculo.getModelo() +"'"
                   + ", placa='"+ veiculo.getPlaca() +"'"
                   + ", ano_fab_mod='"+ veiculo.getAno_fab_mod() +"'"
                   + ", cidade_estado='"+ veiculo.getCidade_estado() +"'"
                   + ", seguro='"+ veiculo.getSeguro() +"'"
                   + ", inicio_seguro='"+ veiculo.getInicio_seguro() +"'"
                   + ", vencimento_seguro='" + veiculo.getVencimento_seguro() +"'"
                   + ", seguradora='"+ veiculo.getSeguradora() +"'"
                   + ", status='"+ veiculo.getStatus() +"'"
                   +" where placa = '"+ veiculo.getPlaca() + "'"
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
     
   public void excluir(Veiculo veiculo) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM veiculos WHERE placa = '" + veiculo.getPlaca() + "'";
                    
            
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
        ArrayList<Veiculo> array = new ArrayList<Veiculo>();
        Veiculo veiculo;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM veiculos WHERE placa='" + placa + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                veiculo = new Veiculo();
                
                veiculo.setCodigo(resultadoBusca.getString("codigo"));
                veiculo.setMarca(resultadoBusca.getString("marca"));
                veiculo.setModelo(resultadoBusca.getString("modelo"));
                veiculo.setPlaca(resultadoBusca.getString("placa"));
                veiculo.setAno_fab_mod(resultadoBusca.getString("ano_fab_mod"));
                veiculo.setCidade_estado(resultadoBusca.getString("cidade_estado"));
                veiculo.setSeguro(resultadoBusca.getString("seguro"));
                veiculo.setInicio_seguro(resultadoBusca.getString("inicio_seguro"));
                veiculo.setVencimento_seguro(resultadoBusca.getString("vencimento_seguro"));
                veiculo.setSeguradora(resultadoBusca.getString("seguradora"));
                veiculo.setStatus(resultadoBusca.getString("status"));
                
                
                //Adicionado a tarefa na lista
                array.add(veiculo);
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
