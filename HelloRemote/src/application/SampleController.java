package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button testBT;

    @FXML
    private Label testLB;

    @FXML
    void onTestBT(ActionEvent event) {
    	Platform.runLater(() ->testLB.setText("HelloFX"));
    }

    @FXML
    void initialize() {
        assert testBT != null : "fx:id=\"testBT\" was not injected: check your FXML file 'Sample.fxml'.";
        assert testLB != null : "fx:id=\"testLB\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
