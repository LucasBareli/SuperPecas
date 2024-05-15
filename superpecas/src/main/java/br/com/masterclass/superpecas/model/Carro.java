package br.com.masterclass.superpecas.model;


import jakarta.persistence.*; // Importa as classes relacionadas ao Java Persistence API (JPA)
import lombok.*; //Importa as anotações do projeto Lombok para geração automática de construtores, getters e setters, e construtor sem argumentos (default constructor) e construtor com todos os argumentos (all-args constructor)

@Entity //marca a classe como uma entidade JPA
@Table(name = "Carros") //tabela do mysql
@NoArgsConstructor //gera um construtor sem argumentos para a classe
@AllArgsConstructor //gera um construtor com todos os argumentos para a classe

public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Especifica a estratégia de geração de valores para a chave primária
    @Column(name = "CarroID") //Especifica a tabela do mysql
    private int carroID; //Identificador unico

    @Column(name = "NomeModelo")
    private String nomeModelo;

    @Column(name = "Fabricante")
    private String fabricante;

    @Column(name = "CodigoUnico", unique = true)
    private String codigoUnico;

    public int getCarroID() {
        return carroID;
    }

    public void setCarroID(int carroID) {
        this.carroID = carroID;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
}

