package com.tictactoe;

public class   ApplicationModels {
    char [][]Grid ;

    public void initialize() {
        Grid =new char [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Grid [i][j]=' ';
            }
        }
    }

    void updateGrid(int ligne, int colonne) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Grid [ligne][colonne]=' ';
            }
        }
    }

    void printGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Grid [i][j]+" ");
            }
        }
    }

    public void resetGame(){
        Grid =new char [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Grid [i][j]=' ';
            }
        }
    }

    public char[][] getGrid() {
        return Grid;
    }
}
