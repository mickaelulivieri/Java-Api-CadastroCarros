package com.cadastrocarros.CadastroDeCarros.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_Carros")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "chassi")
    private String chassi;

    @Column(name = "placa")
    private String placa;

    @Column(name = "preco")
    private Double preco;

    public CarModel(Long id, String placa, Double preco, String chassi, String marca, String modelo) {
        this.id = id;
        this.placa = placa;
        this.preco = preco;
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
    }

    public CarModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}