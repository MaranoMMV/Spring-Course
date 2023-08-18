package br.com.maranoart.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    //Atributos
    private Integer id;
    private String nome;

    //Construtor
    public Cliente(){
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Metodos
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + "]";
    }

    
}
