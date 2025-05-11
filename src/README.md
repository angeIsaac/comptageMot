# Projet : Comptage de mots dans un fichier texte

Ce projet consiste à compter le nombre total de mots présents dans un fichier texte donné. Le programme est structuré autour de deux classes principales : `ComptageMot` et `Main`.

---

## Fonctionnalités principales

1. Lecture d'un fichier texte ligne par ligne.
2. Comptage précis des mots dans chaque ligne à l'aide d'une méthode dédiée.
3. Gestion des ressources avec fermeture automatique des fichiers (`AutoCloseable`).
4. Affichage en console du nombre total de mots contenus dans le fichier.

---

## Structure des fichiers

### **Fichier `ComptageMot.java`**
Cette classe est responsable de gérer la logique de comptage des mots.
- **Attributs principaux :**
    - `Scanner scanner` : permet de lire le fichier ligne par ligne.
    - `int nombreMot` : stocke le nombre total de mots comptés.

- **Méthodes principales :**
    - `ComptageMot(String path)` : constructeur qui initialise le fichier à lire. Un message d'erreur clair est retourné si le fichier n'est pas trouvé ou si le chemin est invalide.
    - `public int nombreDeMot()` : méthode publique qui parcourt le fichier et retourne le nombre total de mots.
    - `private int compterMot(String ligne)` : méthode privée utilisée pour compter les mots dans une ligne donnée.
    - `close()` : méthode automatique pour fermer correctement le fichier et libérer les ressources.

---

### **Fichier `Main.java`**
Cette classe contient le point d'entrée de l'application.
- Exemple d'utilisation :
    1. Création d'une instance de la classe `ComptageMot`.
    2. Passage du chemin du fichier texte à analyser.
    3. Affichage du résultat final en console.

---

### **Fichier `TestExercice3.txt`**
Fichier texte utilisé pour tester le programme. Le contenu du fichier sert de base pour valider le comptage des mots.

Exemple de contenu :---

## Prérequis techniques

- **Java SDK** : version 23 ou ultérieure.
- Un éditeur de code compatible avec Java, comme IntelliJ IDEA.
- Système de fichiers valide avec les permissions nécessaires pour lire le fichier cible.

---

## Instructions pour exécuter le projet

1. Cloner ou télécharger le projet localement.
2. Ouvrir le projet dans un IDE tel que IntelliJ IDEA.
3. S'assurer que le fichier `TestExercice3.txt` est situé dans le répertoire `src`.
4. Exécuter le fichier `Main.java`.

---

## Exemple d'exécution

### **Code dans `Main.java` :**### **Sortie Console :**(*Note : Le résultat peut varier en fonction du contenu de votre fichier texte.*)

---

## Auteurs

- **Nom :** Guidy
- **Email :** packer02andro@gmail.com
- **GitHub :** guidy ange isaac

---

## Licence

Ce projet est distribué sous licence MIT. Voir le fichier LICENSE pour plus d'informations.