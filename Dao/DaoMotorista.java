/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Motorista;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class DaoMotorista {
    
  public void cadastrar(Motorista motorista) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
            String sql = "INSERT INTO motorista (nome,cpf,datanascimento, endereco,bairro,cidade,estado,status,nacionalidade,naturalidade,cnhnumero,cnhcategoria) values (" 
                    + "'" + motorista.getNome()
                    + "','" + motorista.getCpf()
                    + "','" + motorista.getDatanascimento()
                    + "','" + motorista.getEndereco()
                    + "','" + motorista.getBairro()
                    + "','" + motorista.getCidade()
                    + "','" + motorista.getEstado()
                    + "','" + motorista.getStatus()
                    + "','" + motorista.getNacionalidade()
                    + "','" + motorista.getNaturalidade()
                    + "','" + motorista.getCnhnumero()
                    + "','" + motorista.getCnhcategoria()
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
    
    public void alterar(Motorista motorista) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para cadatro no banco
           String sql = "UPDATE motorista set nome='" + motorista.getNome()+"'"
                   + ", cpf='"+ motorista.getCpf()+"'"
                   + ", datanascimento='"+ motorista.getDatanascimento()+"'"
                   + ", endereco='"+ motorista.getEndereco() +"'"
                   + ", bairro='"+ motorista.getBairro()+"'"
                   + ", cidade='"+ motorista.getCidade()+"'"
                   + ", estado='"+ motorista.getEstado()+"'"
                   + ", status='"+ motorista.getStatus() +"'"
                   + ", naturalidade='"+ motorista.getNaturalidade() +"'"
                   + ", nacionalidade='"+ motorista.getNacionalidade() +"'"
                   + ", cnhnumero='"+ motorista.getCnhnumero() +"'"
                   + ", cnhcategoria='"+ motorista.getCnhcategoria() +"'"
                   +" where cpf = '"+ motorista.getCpf()+ "'"
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
     
   public void excluir(Motorista motorista) {

        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        try {
            conexao.conectar();

            
            
            //SQL para exclusão dos dados
            String sql = "DELETE FROM motorista WHERE cpf = '" + motorista.getCpf()+ "'";
                    
            
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
    public ArrayList buscar(String cpf) {
        //Criando a lista
        ArrayList<Motorista> array = new ArrayList<Motorista>();
        Motorista motorista;
        
        
        dao.ConexaoMySql conexao = new dao.ConexaoMySql();
        Statement statement;    //Variável responsável por enviar informação para o banco de dados
        
        //Criando o ResultSet
        ResultSet resultadoBusca;
        
        try {
            conexao.conectar();
            
            //SQL para CONSULTA no banco
            String sql = "SELECT * FROM motorista WHERE cpf='" + cpf + "';";
            
            statement = conexao.getCon().createStatement();
            resultadoBusca = statement.executeQuery(sql);
            
            
            //Iterando no ResultSet pegando cada linha 
            while(resultadoBusca.next()){
                //Criando uma tarefa e colocando os dados
                motorista = new Motorista();
                
                motorista.setCodigo(resultadoBusca.getString("codigo"));
                motorista.setNome(resultadoBusca.getString("nome"));
                motorista.setCpf(resultadoBusca.getString("cpf"));
                motorista.setDatanascimento(resultadoBusca.getString("datanascimento"));
                motorista.setEndereco(resultadoBusca.getString("endereco"));
                motorista.setBairro(resultadoBusca.getString("bairro"));
                motorista.setCidade(resultadoBusca.getString("cidade"));
                motorista.setEstado(resultadoBusca.getString("estado"));
                motorista.setStatus(resultadoBusca.getString("status"));
                
                motorista.setNaturalidade(resultadoBusca.getString("naturalidade"));
                motorista.setNacionalidade(resultadoBusca.getString("nacionalidade"));
                motorista.setCnhnumero(resultadoBusca.getString("cnhnumero"));
                motorista.setCnhcategoria(resultadoBusca.getString("cnhcategoria"));
                
                
                
                
                //Adicionado a tarefa na lista
                array.add(motorista);
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
