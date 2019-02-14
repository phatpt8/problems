package com.udemy.housebuilding;

public class Algorithm {

    public void buildLayer(int height) {
        if (height == 0) return;

        buildLayer(height - 1);

        System.out.println(height);
    }
}

