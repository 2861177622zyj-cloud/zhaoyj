package com.heima.demo;

/**
 * ClassName: Movie
 * Package: com.heima.demo
 */
public class Movie {
    private int id;
    private String name;



    private double score;
    private String actor;

    public Movie(){

    }
    public Movie(String name, String actor, int id, double score) {
        this.name = name;
        this.actor = actor;
        this.id = id;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

}
