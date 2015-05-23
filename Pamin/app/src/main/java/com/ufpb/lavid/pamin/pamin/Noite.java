package com.ufpb.lavid.pamin.pamin;

/**
 * Created by Milton on 22/05/2015.
 */
public class Noite {

    private int imagem;
    private int imagemLocal;
    private int imagemFone;
    private String nome;
    private String local;

    public int getImagemLocal() {
        return imagemLocal;
    }

    public void setImagemLocal(int imagemLocal) {
        this.imagemLocal = imagemLocal;
    }

    public int getImagemFone() {
        return imagemFone;
    }

    public void setImagemFone(int imagemFone) {
        this.imagemFone = imagemFone;
    }

    private String fone;

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
