package com.alevel.entities;

import javax.persistence.*;

@Entity
@Table
public class FilmGenre {

    @Id
    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(targetEntity = Film.class)
    @JoinColumn(name = "film", referencedColumnName = "id")
    private Film film;

    @ManyToOne(targetEntity = Genre.class)
    @JoinColumn(name = "genre", referencedColumnName = "id")
    private Genre genre;

    public FilmGenre() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
