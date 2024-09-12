# 🎮 Tic-Tac-Toe JavaFX Application

Ce projet est une implémentation graphique du célèbre jeu **Tic-Tac-Toe** en Java à l'aide de **JavaFX**. Deux joueurs (X et O) s'affrontent sur une grille de 3x3, avec gestion des scores, tour par tour, et détection de la victoire ou du match nul.

## ✨ Fonctionnalités

- 🖥️ **Interface graphique** simple et intuitive avec JavaFX.
- 🔄 **Gestion du tour** des joueurs : `X` et `O`.
- 🏆 **Suivi des scores** pour chaque joueur.
- ✅ **Détection automatique** de la victoire ou du match nul.
- 🔄 **Réinitialisation** de la partie ou des scores.
- 🚪 Option pour **quitter** l'application.

## 📂 Structure du projet

Le projet est organisé en trois classes principales :

1. **AppController** : 🎮 Gère l'interface utilisateur, le tour des joueurs et la mise à jour des scores.
   
2. **ApplicationModels** : 🧩 Contient la logique du jeu : initialisation, mise à jour et réinitialisation de la grille.

3. **Application** : 🚀 Point d'entrée de l'application JavaFX, où l'interface est chargée et affichée.

## ⚙️ Prérequis

- Java 8 (ou plus récent) ☕
- JavaFX (assurez-vous qu'il est configuré) 🖥️

## 🚀 Comment exécuter le projet

1. Clonez le dépôt ou téléchargez le projet.
2. Assurez-vous que Java et JavaFX sont correctement configurés.
3. Compilez et exécutez le projet via votre IDE ou en ligne de commande :
   
   javac -d bin src/com/tictactoe/*.java
   java -cp bin com.tictactoe.Application

## 🎯 Utilisation

- 🕹️ Les joueurs cliquent à tour de rôle sur les boutons de la grille pour placer leur symbole (`X` ou `O`).
- 🏆 Le jeu détecte automatiquement un gagnant ou un match nul.
- 📊 Le score est mis à jour en fonction des résultats.
- 🔄 Utilisez le bouton "Reset" pour réinitialiser les scores, ou "New Game" pour démarrer une nouvelle partie.

## 🚧 Améliorations futures

- 🤖 Ajout d'une option pour jouer contre une IA.
- 🎨 Amélioration de l'interface avec des animations.
- 🧩 Support pour des grilles de tailles différentes (ex : 4x4, 5x5).

## 👨‍💻 Auteurs

- **[DIALLO SIDY]** - Développeur principal

