package org.gamemanagment.model;

public class Game {
    private int id;
    public String name;
    private double price;
    private String description;
    private String category;
    private String picture;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}