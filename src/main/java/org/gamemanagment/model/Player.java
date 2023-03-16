package org.gamemanagment.model;

import java.util.Arrays;

public class Player extends User{
    private Game [] games;


    public Player() {
    }

    public Player(int id, String name, String surName, String nationalIdentity, String birthDate, String memberDate, String password, String eMail, String userName, String picture, Game[] games) {
        super(id, name, surName, nationalIdentity, birthDate, memberDate, password, eMail, userName, picture);
        this.games = games;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Player{" +super.toString()+
                "games=" + Arrays.toString(games) +
                '}';
    }
}