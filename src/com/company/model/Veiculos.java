package com.company.model;

public class veiculo {
    private Integer velocidade;
    private double aceleração;
    private String AnguloDeVirada;
    private String Patente;
    private double Peso;
    private Integer Rodas;
    private String Placa;

    public void removerVeiculo(veiculo){

    }

    public void removerVeiculoComPlaca(String Placa){
        this.Placa = Placa;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleração() {
        return aceleração;
    }

    public void setAceleração(double aceleração) {
        this.aceleração = aceleração;
    }

    public String getAnguloDeVirada() {
        return AnguloDeVirada;
    }

    public void setAnguloDeVirada(String anguloDeVirada) {
        AnguloDeVirada = anguloDeVirada;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Integer getRodas() {
        return Rodas;
    }

    public void setRodas(Integer rodas) {
        Rodas = rodas;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }
}
