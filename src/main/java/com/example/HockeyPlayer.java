package com.example;

public class HockeyPlayer {
    private String name;
    private int age;
    private String team;
    private PlayerPosition position;

    public HockeyPlayer(String name, int age, String team, PlayerPosition position) {
        super();

        this.name = name;
        this.age = age;
        this.team = team;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public PlayerPosition getPosition(){
        return position;
    }
}
