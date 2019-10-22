package com.grokonez.jwtauthentication.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private long id_post;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String  descripcion;

    @Column(name = "imagen")
    private String imagen;

    public long getId_post() {
        return id_post;
    }

    public void setId_post(long id_post) {
        this.id_post = id_post;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
