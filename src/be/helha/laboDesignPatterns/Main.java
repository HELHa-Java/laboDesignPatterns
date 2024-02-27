package be.helha.laboDesignPatterns;

import be.helha.laboDesignPatterns.models.Folder;

// TODO : prenez connaissance du code existant
// TODO : complétez le main pour :
//  - créer un dossier "/" (déjà fait)
//  - créer un sous-dossier "home" dans "/" (déjà fait)
//  - créer un sous-dossier "user1" dans "home"
//  - créer un sous-dossier "user2" dans "home"
//  - créer un fichier "a.txt" de 200kb dans "user1"
//  - créer un fichier "b.txt" de 450kb dans "user1"
//  - créer un fichier "c.txt" de 10kb dans "user2"
//  - créer un fichier "README.md" de 150kb dans "home"
// TODO : implémentez la méthode getSize dans Folder et écrivez du code qui la teste
// TODO : créez une classe "FolderListing" dans le package views
//          qui prend un dossier en paramètre dans son constructeur
//          et qui permet d'afficher toute la hiérarchie de ce dossier via une méthode show()
// TODO : rendez chaque noeud observable (java.util.Observable, même si c'est déprécié)
// TODO : rendez votre vue observatrice (java.util.Observer, même si c'est déprécié)
// TODO : rendez chaque dossier observateur (java.util.Observer) des sous-noeuds qui le composent
// TODO : mettez en place tous les mécanismes des observers
//          pour qu'un changement dans un dossier (nom, ajout d'un fichier, changement d'un nom de fichier) ou un des sous-dossiers
//          appelle automatiquement la méthode show() sur les objets FolderListing créés sur ce dossier.
// TODO : créez une classe "FolderSize" dans le package views
//          qui affichera la taille d'un dossier ou d'un fichier
//          et se réaffichera automatiquement à chaque changement de taille (et pas lors d'un changement de nom...)
// TODO : ajoutez une classe SoftLink qui représente un lien vers un autre fichier.
//          Chaque lien a un nom, ne peut contenir de sous-fichiers ou sous-dossiers et sa taille est nulle.
//          Créez quelques liens dans les dossiers existants et vérifiez que tout fonctionne correctement.
// TODO : testez tout cela en changeant les dossiers, fichiers et liens dans le main (pas de tests unitaires :))


public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("/");
        Folder home = new Folder("home");
        root.addNode(home);
        // TODO A continuer
    }
}
