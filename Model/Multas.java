/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoMultas;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Multas {
    
    private String idmulta;
    private String placa;
    private String descricao;
    private String valor;

    /**
     * @return the idmulta
     */
    public String getIdmulta() {
        return idmulta;
    }

    /**
     * @param idmulta the idmulta to set
     */
    public void setIdmulta(String idmulta) {
        this.idmulta = idmulta;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
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

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    

    public ArrayList buscar(String placa){
        DaoMultas daoMultas = new DaoMultas();
        return daoMultas.buscar(placa);
    }
    
    public void cadastrar(){
        
        DaoMultas daoMultas = new DaoMultas();
        daoMultas.cadastrar(this);

    }
    
      public void alterar() {
        DaoMultas daoMultas = new DaoMultas();
        daoMultas.alterar(this);
    }
    
    public void excluir() {
        DaoMultas daoMultas = new DaoMultas();
        daoMultas.excluir(this);
    }    
    
    
}
