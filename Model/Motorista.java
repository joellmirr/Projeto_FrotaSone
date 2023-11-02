/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoMotorista;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Motorista {
    
    
    private String codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String status;
    
    private String datanascimento;
    private String naturalidade;
    private String nacionalidade;
    private String cnhnumero;
    private String cnhcategoria;


    public String getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the cnhnumero
     */
    public String getCnhnumero() {
        return cnhnumero;
    }

    /**
     * @param cnhnumero the cnhnumero to set
     */
    public void setCnhnumero(String cnhnumero) {
        this.cnhnumero = cnhnumero;
    }

    /**
     * @return the cnhcategoria
     */
    public String getCnhcategoria() {
        return cnhcategoria;
    }

    /**
     * @param cnhcategoria the cnhcategoria to set
     */
    public void setCnhcategoria(String cnhcategoria) {
        this.cnhcategoria = cnhcategoria;
    }
    
    

    
    public ArrayList buscar(String cpf){
        DaoMotorista daoMotorista = new DaoMotorista();
        return daoMotorista.buscar(cpf);
    }
    
    public void cadastrar(){
        
        DaoMotorista daoMotorista = new DaoMotorista();
        daoMotorista.cadastrar(this);

    }
    
      public void alterar() {
        DaoMotorista daoMotorista = new DaoMotorista();
        daoMotorista.alterar(this);
    }
    
    public void excluir() {
        DaoMotorista daoMotorista = new DaoMotorista();
        daoMotorista.excluir(this);
    }
    
   
    
    
    
}
