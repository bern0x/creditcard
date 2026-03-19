package br.com.alura.creditcard.modelos;

public class Usuario {
    String nome;
    int id;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
