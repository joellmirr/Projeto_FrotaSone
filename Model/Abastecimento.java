/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoAbastecimento;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Abastecimento {
    
    private String idabastecimento;
    private String tipo;
    private String placa;
    private String quantidade;
    private String valor;
    private String motorista;
    private String km;
    private String data;


    

    /**
     * @return the idabastecimento
     */
    public String getIdabastecimento() {
        return idabastecimento;
    }

    /**
     * @param idabastecimento the idabastecimento to set
     */
    public void setIdabastecimento(String idabastecimento) {
        this.idabastecimento = idabastecimento;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    /**
     * @return the motorista
     */
    public String getMotorista() {
        return motorista;
    }

    /**
     * @param motorista the motorista to set
     */
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }
    

    public ArrayList buscar(String placa){
        DaoAbastecimento daoAbastecimento = new DaoAbastecimento();
        return daoAbastecimento.buscar(placa);
    }
    
    public void cadastrar(){
        
        DaoAbastecimento daoAbastecimento = new DaoAbastecimento();
        daoAbastecimento.cadastrar(this);

    }
    
      public void alterar() {
        DaoAbastecimento daoAbastecimento = new DaoAbastecimento();
        daoAbastecimento.alterar(this);
    }
    
    public void excluir() {
        DaoAbastecimento daoAbastecimento = new DaoAbastecimento();
        daoAbastecimento.excluir(this);
    }    

    /**
     * @return the km
     */
    public String getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(String km) {
        this.km = km;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
        
        
    
}
