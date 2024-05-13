package com.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AppController {

    public String winner = " ";

    public int scx = 0;
    public int scy = 0;

    public char turn = 'x';

    @FXML
    public TextField scorex;

    @FXML
    public TextField scoreo;

    @FXML
    public Label turnx;

    @FXML
    public Label turny;

    @FXML
    private Button reset;

    @FXML
    private Button exit;

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    private Button[][] buttons = new Button[3][3];

    public void initialize() {
        buttons[0][0] = button00;
        buttons[0][1] = button01;
        buttons[0][2] = button02;
        buttons[1][0] = button10;
        buttons[1][1] = button11;
        buttons[1][2] = button12;
        buttons[2][0] = button20;
        buttons[2][1] = button21;
        buttons[2][2] = button22;
    }

    public void clean() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        winner = " ";
    }

    public boolean gagne() {
        // Vérification des lignes
        for (int i = 0; i < 3; i++) {
            if (!buttons[i][0].getText().equals(" ") &&
                    buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][1].getText().equals(buttons[i][2].getText())) {
                winner = buttons[i][0].getText();
                return true;
            }
        }
        // Vérification des colonnes
        for (int i = 0; i < 3; i++) {
            if (!buttons[0][i].getText().equals(" ") &&
                    buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[1][i].getText().equals(buttons[2][i].getText())) {
                winner = buttons[0][i].getText();
                return true;
            }
        }
        // Vérification de la diagonale principale
        if (!buttons[0][0].getText().equals(" ") &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText())) {
            winner = buttons[0][0].getText();
            return true;
        }
        // Vérification de la diagonale secondaire
        if (!buttons[0][2].getText().equals(" ") &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText())) {
            winner = buttons[0][2].getText();
            return true;
        }
        return false;
    }

    public boolean matchNull() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (buttons[i][j].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void updateScore() {
        if (gagne()) {
            if (winner.equals("x")) {
                scx += 1;
                scorex.setText(Integer.toString(scx));
            }
            if (winner.equals("o")) {
                scy += 1;
                scoreo.setText(Integer.toString(scy));
            }
        }
    }

    @FXML
    public void resetButtonClick(ActionEvent actionEvent) {
        clean();
    }

    @FXML
    public void exitButtonClick(ActionEvent actionEvent) {
        exit.getScene().getWindow().hide();
    }

    @FXML
    public void handleButtonClick(ActionEvent actionEvent) {
        Button source = (Button) actionEvent.getSource();
        if (source.getText().equals(" ") && !gagne()) {
            if (turn == 'x') {
                turnx.setTextFill(Color.BLACK);
                turny.setTextFill(Color.RED);
                turn = 'o';
                source.setText("x");
            } else {
                turnx.setTextFill(Color.RED);
                turny.setTextFill(Color.BLACK);
                turn = 'x';
                source.setText("o");
            }
            updateScore();
            if (gagne()) {
                // Mettez ici le code pour annoncer le vainqueur et peut-être proposer de commencer une nouvelle partie
            } else if (matchNull()) {
                // Mettez ici le code pour annoncer que le match est nul et peut-être proposer de commencer une nouvelle partie
            }
        }
    }
}
