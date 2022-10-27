package hu.petrik.emberektablazat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class emberekController {
    @FXML
    public TableView<Ember> emberek;
    public TextField nevMezo;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;
    @FXML
    private Spinner<Integer> korMezo;

    @FXML
    private void initialize(){
        nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("Gipsz Jakab",25);
        Ember e2 = new Ember("Teszt Elek",52);
        Ember e3 = new Ember("Lakatos Brendon Károly",11);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);

    }

    public void hozzaadClick(ActionEvent actionEvent) {

    emberek.getItems().add(new Ember(nevMezo.getText(),korMezo.getValue()));

    }
}