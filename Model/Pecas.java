/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoPecas;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Pecas {
    
    
    private String idpeca;
    private String nome;
    private String quantidade;
    private String descricao;

    /**
     * @return the idpeca
     */
    public String getIdpeca() {
        return idpeca;
    }

    /**
     * @param idpeca the idpeca to set
     */
    public void setIdpeca(String idpeca) {
        this.idpeca = idpeca;
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
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public ArrayList buscar(String nome){
        DaoPecas daoPecas = new DaoPecas();
        return daoPecas.buscar(nome);
    }
    
    public void cadastrar(){
        
        DaoPecas daoPecas = new DaoPecas();
        daoPecas.cadastrar(this);

    }
    
      public void alterar() {
        DaoPecas daoPecas = new DaoPecas();
        daoPecas.alterar(this);
    }
    
    public void excluir() {
        DaoPecas daoPecas = new DaoPecas();
        daoPecas.excluir(this);
    }    
    
    
    
}
