package ru.gb.family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private final List<Human> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addHuman(Human human) {
        this.members.add(human);
    }

    public Human findHumanByName(String name) {
        for (Human human : members) {
            if (human.toString().contains(name)) {
                return human;
            }
        }
        return null;
    }

    public List<Human> getAllChildrenOfHuman(Human human) {
        return human.getChildren();
    }

    @Override
    public String toString() {
        return "FamilyTree(members=" + members + ")";
    }
}
