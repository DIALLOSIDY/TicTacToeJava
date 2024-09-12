<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Tic-Tac-Toe JavaFX</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f4f4f4;
            color: #333;
        }
        h1, h2, h3 {
            color: #ff6600;
        }
        pre {
            background-color: #333;
            color: #fff;
            padding: 10px;
            border-radius: 5px;
        }
        img {
            max-width: 100%;
            height: auto;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin: 10px 0;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        ul li {
            padding-left: 20px;
            text-indent: -20px;
        }
        ul li::before {
            content: "• ";
            color: #ff6600;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <h1>🎮 Tic-Tac-Toe JavaFX Application</h1>

    <p>
        Ce projet est une implémentation graphique du célèbre jeu <strong>Tic-Tac-Toe</strong> en Java à l'aide de <strong>JavaFX</strong>.
        Deux joueurs (X et O) s'affrontent sur une grille de 3x3, avec gestion des scores, tour par tour, et détection de la victoire ou du match nul.
    </p>

    <h2>✨ Fonctionnalités</h2>
    <ul>
        <li>🖥️ <strong>Interface graphique</strong> simple et intuitive avec JavaFX.</li>
        <li>🔄 <strong>Gestion du tour</strong> des joueurs : <code>X</code> et <code>O</code>.</li>
        <li>🏆 <strong>Suivi des scores</strong> pour chaque joueur.</li>
        <li>✅ <strong>Détection automatique</strong> de la victoire ou du match nul.</li>
        <li>🔄 <strong>Réinitialisation</strong> de la partie ou des scores.</li>
        <li>🚪 Option pour <strong>quitter</strong> l'application.</li>
    </ul>

    <h2>📂 Structure du projet</h2>
    <p>Le projet est organisé en trois classes principales :</p>
    <ul>
        <li><strong>AppController</strong> : 🎮 Gère l'interface utilisateur, le tour des joueurs et la mise à jour des scores.</li>
        <li><strong>ApplicationModels</strong> : 🧩 Contient la logique du jeu : initialisation, mise à jour et réinitialisation de la grille.</li>
        <li><strong>Application</strong> : 🚀 Point d'entrée de l'application JavaFX, où l'interface est chargée et affichée.</li>
    </ul>

    <h2>⚙️ Prérequis</h2>
    <ul>
        <li>Java 8 (ou plus récent) ☕</li>
        <li>JavaFX (assurez-vous qu'il est configuré) 🖥️</li>
    </ul>

    <h2>🚀 Comment exécuter le projet</h2>
    <ol>
        <li>Clonez le dépôt ou téléchargez le projet.</li>
        <li>Assurez-vous que Java et JavaFX sont correctement configurés.</li>
        <li>Compilez et exécutez le projet via votre IDE ou en ligne de commande :</li>
    </ol>

    <pre>
        javac -d bin src/com/tictactoe/*.java
        java -cp bin com.tictactoe.Application
    </pre>

   

    <h2>🎯 Utilisation</h2>
    <ul>
        <li>🕹️ Les joueurs cliquent à tour de rôle sur les boutons de la grille pour placer leur symbole (<code>X</code> ou <code>O</code>).</li>
        <li>🏆 Le jeu détecte automatiquement un gagnant ou un match nul.</li>
        <li>📊 Le score est mis à jour en fonction des résultats.</li>
        <li>🔄 Utilisez le bouton "Reset" pour réinitialiser les scores, ou "New Game" pour démarrer une nouvelle partie.</li>
    </ul>

    <h2>🚧 Améliorations futures</h2>
    <ul>
        <li>🤖 Ajout d'une option pour jouer contre une IA.</li>
        <li>🎨 Amélioration de l'interface avec des animations.</li>
        <li>🧩 Support pour des grilles de tailles différentes (ex : 4x4, 5x5).</li>
    </ul>

    <h2>👨‍💻 Auteurs</h2>
    <ul>
        <li><strong>[Votre nom]</strong> - Développeur principal</li>
    </ul>

</body>
</html>
