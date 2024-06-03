package ru.gb.family_tree;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private final String name;
    private final String birthDate;
    private final String deathDate;
    private final List<Human> parents;
    private final List<Human> children;

    public Human(String name, String birthDate, String deathDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Human(String name, String birthDate) {
        this(name, birthDate, null);
    }

    public void addParent(Human parent) {
        this.parents.add(parent);
        parent.children.add(this);
    }

    public void addChild(Human child) {
        this.children.add(child);
        child.parents.add(this);
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Human(name=" + name + ", birthDate=" + birthDate + ", deathDate=" + deathDate + ")";
    }
}
