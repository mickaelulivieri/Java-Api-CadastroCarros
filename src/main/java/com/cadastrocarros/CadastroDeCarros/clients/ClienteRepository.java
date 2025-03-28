package com.cadastrocarros.CadastroDeCarros.clients;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long > {
}
