package sample;

import bin.Kontroler;
import javafx.scene.shape.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Pane zewnetrzny;
    public Pane wewnetrzny;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Kontroler().main(this);
//        utworzBudynek(25, 10, "Orlen","Stacja");
//        utworzBudynek(10, 7, "Tesco","Magazyn");
//        utworzBudynek(12, 15, "Baza","Baza");
//        utworzBudynek(13, 18, "Huta szkla","Fabryka");
    }

    public void utworzBudynek(double pozycjaX, double pozycjaY, String nazwa, String typ) {
        Label label = new Label(nazwa);
        Rectangle rectangle = new Rectangle();
        rectangle.getStyleClass().add(typ.toLowerCase());
        rectangle.setHeight(100);
        rectangle.setWidth(50);
        rectangle.setLayoutX(pozycjaX * 15 - 10);
        rectangle.setLayoutY(pozycjaY * 15);
        label.setLayoutX(pozycjaX * 15);
        label.setLayoutY(pozycjaY * 15);
        this.wewnetrzny.getChildren().add(label);
      //  this.wewnetrzny.getChildren().add(rectangle);
    }

}
