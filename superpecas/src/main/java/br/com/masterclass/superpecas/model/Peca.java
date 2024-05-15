package br.com.masterclass.superpecas.model;


import jakarta.persistence.*;
import lombok.*;

@Entity //marca a classe como uma entidade JPA
@Table(name = "Pecas") //tabela do mysql
@NoArgsConstructor //gera um construtor sem argumentos para a classe
@AllArgsConstructor //gera um construtor com todos os argumentos para a classe

public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Especifica a estratégia de geração de valores para a chave primária
    @Column(name = "PecaID") //Especifica a tabela do mysql
    private int pecaID; //Identificador unico

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name = "NumeroSerie", unique = true)
    private String numeroSerie;

    @Column(name = "Fabricante")
    private String fabricante;

    @Column(name = "ModeloCarro")
    private String modeloCarro;


    public int getPecaID() {
        return pecaID;
    }

    public void setPecaID(int pecaID) {
        this.pecaID = pecaID;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

}
