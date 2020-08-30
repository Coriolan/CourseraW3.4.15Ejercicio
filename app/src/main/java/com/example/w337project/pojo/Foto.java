package com.example.w337project.pojo;

public class Foto {

    private int rating;
    private int foto;

    public Foto(int rating, int foto) {
        this.rating = rating;
        this.foto = foto;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
