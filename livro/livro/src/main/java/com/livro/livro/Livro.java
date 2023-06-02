package com.livro.livro;

import java.persistence.Entity;
import java.persistence.Id;
import java.util.UUID;
import java.persistence.Table;

@Entity
@Table(name = "livro")

public class Livro{

    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_livro")
    private String id;

    @Column(name = "tit_livro")
    private String titulo;

    @Column(name = "aut_livro")
    private String autor;

    @Column(name = "edit_livro")
    private String editora;

    @Column(name = "ano_livro")
    private int ano;

    @Column(name = "prec_livro")
    private float preco;


    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public float getPreco() {
        return preco ;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Livro() {

    }

    public Livro(LivroTO to) {
        this.id = to.id();
        this.titulo = to.titulo();
        this.autor = to.autor();
        this.editora = to.editora();
        this.ano = to.ano();
        this.preco = to.preco();
    }
  
    


}