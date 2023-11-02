/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoUsuario;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Usuario {
    
    
    private String codigo;
    private String login;
    private String nome;
    private String senha;
    private String confsenha;
    private String status;
    private String perfil;
    
    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the confsenha
     */
    public String getConfsenha() {
        return confsenha;
    }

    /**
     * @param confsenha the confsenha to set
     */
    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    public ArrayList buscar(String login){
        DaoUsuario daoUsuario = new DaoUsuario();
        return daoUsuario.buscar(login);
    }
    
    public void cadastrar(){
        
        DaoUsuario daoUsuario = new DaoUsuario();
        daoUsuario.cadastrar(this);

    }
    
      public void alterar() {
        DaoUsuario daoUsuario = new DaoUsuario();
        daoUsuario.alterar(this);
    }
    
    public void excluir() {
        DaoUsuario daoUsuario = new DaoUsuario();
        daoUsuario.excluir(this);
    }
    
  public int login() {
        DaoUsuario daoUsuario = new DaoUsuario();
        
        return daoUsuario.login(this);
        
        
        
    }    
        
    
    
  
    
}
