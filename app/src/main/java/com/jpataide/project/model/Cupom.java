package com.jpataide.project.model;

import java.util.ArrayList;

/**
 * Created by jpataide on 6/29/15.
 */
public class Cupom {
    private String titulo;
    private ArrayList<Categoria> categorias;
    private Loja loja;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
}
