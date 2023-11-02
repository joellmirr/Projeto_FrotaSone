/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Dao.DaoVeiculo;

/**
 *
 * @author Marcos
 */
public class Veiculo {

    
    private String codigo;
    private String placa;
    private String marca;
    private String modelo;
    private String ano_fab_mod;
    private String cidade_estado;
    private String seguro;
    private String inicio_seguro;
    private String vencimento_seguro;
    private String seguradora;
    private String status;
    
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
     * @return the cidade_estado
     */
    public String getCidade_estado() {
        return cidade_estado;
    }

    /**
     * @param cidade_estado the cidade_estado to set
     */
    public void setCidade_estado(String cidade_estado) {
        this.cidade_estado = cidade_estado;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano_fab_mod
     */
    public String getAno_fab_mod() {
        return ano_fab_mod;
    }

    /**
     * @param ano_fab_mod the ano_fab_mod to set
     */
    public void setAno_fab_mod(String ano_fab_mod) {
        this.ano_fab_mod = ano_fab_mod;
    }

    /**
     * @return the seguro
     */
    public String getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the seguradora
     */
    public String getSeguradora() {
        return seguradora;
    }

    /**
     * @param seguradora the seguradora to set
     */
    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    /**
     * @return the inicio_seguro
     */
    public String getInicio_seguro() {
        return inicio_seguro;
    }

    /**
     * @param inicio_seguro the inicio_seguro to set
     */
    public void setInicio_seguro(String inicio_seguro) {
        this.inicio_seguro = inicio_seguro;
    }

    /**
     * @return the vencimento_seguro
     */
    public String getVencimento_seguro() {
        return vencimento_seguro;
    }

    /**
     * @param vencimento_seguro the vencimento_seguro to set
     */
    public void setVencimento_seguro(String vencimento_seguro) {
        this.vencimento_seguro = vencimento_seguro;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }    

  
     public ArrayList buscar(String placa){
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        return daoVeiculo.buscar(placa);
    }
    
    public void cadastrar(){
        
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        daoVeiculo.cadastrar(this);

    }
    
      public void alterar() {
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        daoVeiculo.alterar(this);
    }
    
    public void excluir() {
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        daoVeiculo.excluir(this);
    }
    

     
    
}
