package com.example.film;

public class Filmes {

    private Integer id;

    private String tilte;

    private String description;

    private Integer launchYear;

    private CategoryEnum categoryFilm;

    public Filmes(Integer id, String title, String description, Integer launchYear, CategoryEnum categoryFilm) {
        this.id = id;
        this.tilte = title;
        this.description = description;
        this.launchYear = launchYear;
        this.categoryFilm = categoryFilm;
    }

}
