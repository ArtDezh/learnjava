package com.artdezh.spring.mvc.learnjava;

public class Pianist implements Playable {
    private String name;

    public Pianist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на пианино");
    }
}
