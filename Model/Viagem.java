/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoViagem;
import java.util.ArrayList;

    
public class Viagem {
    
    private String idviagem;
    private String motorista;
    private String cpf;
    private String origem;
    private String destino;
    private String placaveiculo;
    private String dataida;
    private String datavolta;
    private String detalhesviagem;
    private String status;

    
    public String getIdviagem() {
        return idviagem;
    }

    /**
     * @param idviagem the idviagem to set
     */
    public void setIdviagem(String idviagem) {
        this.idviagem = idviagem;
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

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the placaveiculo
     */
    public String getPlacaveiculo() {
        return placaveiculo;
    }

    /**
     * @param placaveiculo the placaveiculo to set
     */
    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    /**
     * @return the dataida
     */
    public String getDataida() {
        return dataida;
    }

    /**
     * @param dataida the dataida to set
     */
    public void setDataida(String dataida) {
        this.dataida = dataida;
    }

    /**
     * @return the datavolta
     */
    public String getDatavolta() {
        return datavolta;
    }

    /**
     * @param datavolta the datavolta to set
     */
    public void setDatavolta(String datavolta) {
        this.datavolta = datavolta;
    }

    /**
     * @return the detalhesviagem
     */
    public String getDetalhesviagem() {
        return detalhesviagem;
    }

    /**
     * @param detalhesviagem the detalhesviagem to set
     */
    public void setDetalhesviagem(String detalhesviagem) {
        this.detalhesviagem = detalhesviagem;
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
    
     public ArrayList buscar(String idviagem){
        DaoViagem daoViagem = new DaoViagem();
        return daoViagem.buscar(idviagem);
    }
    
    public void cadastrar(){
        
        DaoViagem daoViagem = new DaoViagem();
        daoViagem.cadastrar(this);

    }
    
      public void alterar() {
        DaoViagem daoViagem = new DaoViagem();
        daoViagem.alterar(this);
    }
    
    public void excluir() {
        DaoViagem daoViagem = new DaoViagem();
        daoViagem.excluir(this);
    }
    
    
}
