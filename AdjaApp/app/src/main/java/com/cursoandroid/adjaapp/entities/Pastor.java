package com.cursoandroid.adjaapp.entities;

import android.graphics.drawable.Drawable;

public class Pastor {

    public int id;
    public String nome;
    public String historia;
    public Drawable picture;

    public Pastor(int id, String nome, String historia, Drawable picture) {
        this.id = id;
        this.nome = nome;
        this.historia = historia;
        this.picture = picture;
    }
}
