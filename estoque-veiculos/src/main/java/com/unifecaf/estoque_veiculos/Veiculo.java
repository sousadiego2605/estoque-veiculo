package com.unifecaf.estoque_veiculos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data  // Isso cria os Getters e Setters automaticamente (Plugin Lombok)
@Entity // Isso diz que essa classe vai virar uma Tabela no MySQL
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    private Double preco;
    private Integer quilometragem;
    private String status; // Ex: "Disponível", "Vendido"

}