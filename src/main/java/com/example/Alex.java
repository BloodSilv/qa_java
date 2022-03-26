package com.example;

import java.util.List;

class Alex extends Lion {

    Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    int getKittens() {
        return 0;
    }
}