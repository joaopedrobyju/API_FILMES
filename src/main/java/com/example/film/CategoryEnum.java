package com.example.film;

public enum CategoryEnum {

    TERROR("Terror"),
    DRAMA("Drama"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    ROMANCE("Romance");

    private String category;

    private CategoryEnum(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }


}
