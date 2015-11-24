package univel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txfCod;

    @FXML
    private TextField txfNome;

    @FXML
    void salvar(ActionEvent event) {
    	String codigo = txfCod.getText();
    	String nome = txfNome.getText();
    	
    	System.out.println(codigo + "\t" + nome);
    }

    @FXML
    void initialize() {
        assert txfCod != null : "fx:id=\"txfCod\" was not injected: check your FXML file 'Principal.fxml'.";
        assert txfNome != null : "fx:id=\"txfNome\" was not injected: check your FXML file 'Principal.fxml'.";

    }
}
