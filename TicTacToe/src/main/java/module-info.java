module com.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.tictactoe to javafx.fxml;
    exports com.tictactoe;
}