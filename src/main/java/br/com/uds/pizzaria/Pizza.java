package br.com.uds.pizzaria;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pizza {
    @ApiModelProperty(hidden = true)
    private final UUID id;
    @ApiModelProperty(hidden = true)
    private final LocalDateTime data_cadastro;

    private String massa;
    private String queijo;
    private String molho;
    private String sabor;
    private int tempoDePreparo;

    public Pizza() {
        this.id = UUID.randomUUID();
        this.data_cadastro = LocalDateTime.now();
    }

    public Pizza(String massa, String queijo, String molho, String sabor, int tempoDePreparo) {
        this();
        this.massa = massa;
        this.queijo = queijo;
        this.molho = molho;
        this.sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;
    }
    public void pizzaDTO (String massa, String queijo, String molho, String sabor, int tempoDePreparo) {
        this.massa = massa;
        this.queijo = queijo;
        this.molho = molho;
        this.sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;

    }
    public UUID getId() {
        return id;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", data_cadastro=" + data_cadastro +
                ", massa='" + massa + '\'' +
                ", queijo='" + queijo + '\'' +
                ", molho='" + molho + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tempoDePreparo=" + tempoDePreparo +
                '}';
    }
}





