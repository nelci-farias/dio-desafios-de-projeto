package rh01;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nelci.5900
 */
public class Pessoa {
    private int id;
    //private String cpf;
    private String nomeCompleto;
    private Date dataNascimento;
    private Date dataContratacao;
    private Date dataSaida;
    //private String status;
    EstadoCivil estadoCivil;
    Genero genero;
    Cargo cargo;
    Titulacao titulacao;
    Cidade cidade;
    Status status;
    //Desempenho desempenho;

    public Pessoa(int id, String nomeCompleto, Date dataNascimento, Date dataContratacao, Date dataSaida,
            EstadoCivil estadoCivil, Genero genero, Cargo cargo, Titulacao titulacao, Cidade cidade, Status status) {
        this.id = id;
        //this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.dataSaida = dataSaida;
        this.status = status;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.cargo = cargo;
        this.titulacao = titulacao;
        this.cidade = cidade;
        //this.desempenho = desempenho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
*/
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

  /*  public Desempenho getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(Desempenho desempenho) {
        this.desempenho = desempenho;
    }
*/
}
