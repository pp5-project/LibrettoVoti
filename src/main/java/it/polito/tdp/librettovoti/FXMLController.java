package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.*;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private Libretto model;
	
		
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtRisutato;

    @FXML
    void handInserisci(ActionEvent event) {
    	
    	String nomeEsame=txtEsame.getText();
    	String votoEsame=txtVoto.getText();
    	int votoInt =Integer.parseInt(votoEsame);
    	String dataEsame=txtData.getText();
    	LocalDate data=LocalDate.parse(dataEsame);
    	Voto voto=new Voto(nomeEsame,votoInt,data);
    	model.add(voto);
    	txtRisutato.setText(model.toString());

    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisutato != null : "fx:id=\"txtRisutato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setModel(Libretto model) {
    	this.model=model;
    }
}
