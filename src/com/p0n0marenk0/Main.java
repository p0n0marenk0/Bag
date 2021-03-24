package com.p0n0marenk0;

import java.util.ArrayList;

public class Main {
    private static final double MAX_WEIGHT = 15;

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        addItems(items);
        System.out.println("==============List============");
        showItems(items);
        System.out.println("============ReZulT============");
        result(items);
    }

    public static void addItems(ArrayList<Item> items) {
        items.add(0, new Item(600, 1, "Book"));
        items.add(0, new Item(34, 4, "Tree"));
        items.add(0, new Item(60, 3, "Box"));
        items.add(0, new Item(800, 2, "Bottle"));
    }

    public static void showItems(ArrayList<Item> items) {
        for (Item i : items) {
            System.out.printf("%s \t ", i.getName());
            System.out.printf("%s \t ", i.getWeight());
            System.out.println(i.getPrice());
        }


       /* for (Item i : items) {
            i.toString();
            System.out.println();
        }

        */
    }

    private static void result(ArrayList<Item> items) {
        Bag bag = new Bag(MAX_WEIGHT);
        bag.makeAllSets(items);
        ArrayList<Item> solved = bag.getBestItems();
        if (solved == null) {
            System.out.println("Нет решения");
        } else {
            showItems(solved);
        }
    }
}
