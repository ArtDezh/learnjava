package com.artdezh.spring.mvc.learnjava;

public class Main {
    public static void main(String[] args) {

        Playable[] players = {
                new Guitarist("Алексей"),
                new Pianist("Мария")
        };

        for (Playable player: players) {
            player.play();
        }
    }
}
