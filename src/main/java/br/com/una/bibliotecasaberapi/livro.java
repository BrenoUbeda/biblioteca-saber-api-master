package br.com.una.bibliotecasaberapi;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class livro {


    public long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLivro;
    private String nomeLivro;
    private String genero;
    int qntd;
}
