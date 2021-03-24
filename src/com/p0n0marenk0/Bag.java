package com.p0n0marenk0;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> Items = new ArrayList<>();
    private double maxWeight;
    private double bestPrice;

    public Bag(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double calculateWeight(List<Item> items) {
        double summary = 0;
        for (Item i : items) {
            summary += i.getWeight();
        }
return summary;
    }

    private double calculatePrice(List<Item> items) {
        double summary = 0;
        for (Item i : items) {
            summary += i.getWeight();
        }
        return summary;
    }
    private void checkSet(List<Item> items){

    }
}


