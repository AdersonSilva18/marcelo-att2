package com.company;

public class Aluno{
    String nome;
    int[] notas = new int[4];
    Integer maiorNota;
    Integer menorNota;
    Integer media;

    public Aluno(String nome) {
        this.nome = nome;
        maiorNota = 0;
        menorNota = 0;
        media = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Integer getMaiorNota() {
        return maiorNota;
    }

    public void setMaiorNota(Integer maiorNota) {
        this.maiorNota = maiorNota;
    }

    public Integer getMenorNota() {
        return menorNota;
    }

    public void setMenorNota(Integer menorNota) {
        this.menorNota = menorNota;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }
}