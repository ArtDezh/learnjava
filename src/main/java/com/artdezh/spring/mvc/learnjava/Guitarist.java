package com.artdezh.spring.mvc.learnjava;

public class Guitarist implements Playable {

    private String name;

    public Guitarist(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на гитаре");
    }
}
