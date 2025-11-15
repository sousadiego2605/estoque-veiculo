package com.unifecaf.estoque_veiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    // Aqui o Spring cria automaticamente a busca se você seguir o padrão de nomes
    // Ex: findBy + NomeDoAtributo
}