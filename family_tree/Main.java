package ru.gb.family_tree;

import java.util.List;

public class Main {
    public static void runDemo() {
        // Создание людей
        Human john = new Human("John Doe", "1960-01-01");
        Human jane = new Human("Jane Doe", "1965-05-15");
        Human child1 = new Human("Child One", "1990-03-20");
        Human child2 = new Human("Child Two", "1992-07-10");

        // Построение семейных связей
        john.addChild(child1);
        john.addChild(child2);
        jane.addChild(child1);
        jane.addChild(child2);

        // Создание генеалогического древа
        FamilyTree tree = new FamilyTree();
        tree.addHuman(john);
        tree.addHuman(jane);
        tree.addHuman(child1);
        tree.addHuman(child2);

        // Проведение исследования
        Human personToResearch = tree.findHumanByName("John Doe");
        if (personToResearch != null) {
            List<Human> children = tree.getAllChildrenOfHuman(personToResearch);
            System.out.println("Children of " + personToResearch + ": " + children);
        } else {
            System.out.println("Person not found.");
        }
    }

    public static void main(String[] args) {
        runDemo();
    }
}
