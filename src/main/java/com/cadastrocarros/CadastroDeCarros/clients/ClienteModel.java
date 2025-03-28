package com.cadastrocarros.CadastroDeCarros.clients;


import com.cadastrocarros.CadastroDeCarros.cars.CarModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = ("tb_clientes"))
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarModel> carList;

}
