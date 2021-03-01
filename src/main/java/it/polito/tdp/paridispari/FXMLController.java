package it.polito.tdp.paridispari;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField txtNumero;

    @FXML
    private Label txtRisultato;

    @FXML
    void handleControlla(ActionEvent event) {
    	String numero = txtNumero.getText();
    	int num ;
    	try {
    		num = Integer.parseInt(numero);
    	}catch(NumberFormatException e) {
    		txtRisultato.setText("ERRORE: Devi inserire un numero");
    		return ;
    	}
    	if (num%2 == 0) {
    		txtRisultato.setText("Il numero "+numero+" è pari");
    	}else {
    		txtRisultato.setText("Il numero "+numero+" è dispari");
    	}
    }

    @FXML
    void initialize() {

    }
}
