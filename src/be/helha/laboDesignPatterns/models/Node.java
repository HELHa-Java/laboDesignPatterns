package be.helha.laboDesignPatterns.models;

public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public boolean isFolder() {
        return false;
    }
}
