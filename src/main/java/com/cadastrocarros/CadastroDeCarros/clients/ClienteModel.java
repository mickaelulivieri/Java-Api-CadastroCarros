package com.cadastrocarros.CadastroDeCarros.clients;


import com.cadastrocarros.CadastroDeCarros.cars.CarModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "cpf", unique = true)
    private String cpf;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarModel> carList;

}
