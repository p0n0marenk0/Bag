package com.p0n0marenk0;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private ArrayList<Item> bestItems = null;
    private double maxWeight;
    private double bestPrice;

    public Bag(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double calculateWeight(ArrayList<Item> items) {
        double summary = 0;
        for (Item i : items) {
            summary += i.getWeight();
        }
        return summary;
    }

    private double calculatePrice(ArrayList<Item> items) {
        double summary = 0;
        for (Item i : items) {
            summary += i.getPrice();
        }
        return summary;
    }

    private void checkSet(ArrayList<Item> items) {
        if (bestItems == null) {
            if (calculateWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = calculatePrice(items);
            }
        } else {
            if ((calculateWeight(items) <= maxWeight) && (calculatePrice(items) > bestPrice)) {
                bestItems = items;
                bestPrice = calculatePrice(items);
            }
        }
    }

    public void makeAllSets(ArrayList<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public ArrayList<Item> getBestItems() {
        return bestItems;
    }
}



