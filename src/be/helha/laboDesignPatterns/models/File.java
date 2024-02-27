package be.helha.laboDesignPatterns.models;

public class File extends Node {

    protected int size; // file size in kb

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
