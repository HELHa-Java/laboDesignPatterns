package be.helha.laboDesignPatterns.models;

import java.util.ArrayList;

public class Folder extends Node {

    protected ArrayList<Node> nodes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    public int getSize() {
        // TODO : retourner la taille du dossier, c'est-à-dire la somme des poids de chaque sous-dossier et de chaque sous-fichier
        return 0;
    }

    public boolean isFolder() {
        return true;
    }

}
