package com.cadastrocarros.CadastroDeCarros.cars;

import com.cadastrocarros.CadastroDeCarros.clients.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @ManyToOne
    @JoinColumn(name = "fk_clienteid")
    private ClienteModel cliente;

}