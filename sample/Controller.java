package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;

public class Controller {

    public MenuButton startMenuBTN;
    public MenuButton destMenuBTN;


    public void startArchesSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Arches National Park");

        System.out.println("Arches selected");
    }

    public void startBryceSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Bryce National Park");
        System.out.println("Bryce Selected");
    }

    public void startCanyonLandsSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Canyonlands National Park");
        System.out.println("Canyonlands Selected");
    }

    public void startCapitolReefSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Capitol Reef National Park");
        System.out.println("Capitol Reef Selected");
    }

    public void startZionSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Zion National Park");
        System.out.println("Zion Selected");
    }

    public void destArchesSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Arches National Park");
        System.out.println("Dest Arches Selected");
    }

    public void destBryceSelected(ActionEvent actionEvent) {

        destMenuBTN.setText("Bryce National Park");
        System.out.println("Dest Bryce selected");
    }

    public void destCanyonLandsSelected(ActionEvent actionEvent) {

        destMenuBTN.setText("Canyonlands National Park");
        System.out.println("Dest Canyon Lands selected");
    }

    public void destCapitolReefSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Capitol Reef National Park");
        System.out.println("Dest Capitol Reef Selected");
    }

    public void destZionSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Zion National Park");
        System.out.println("Dest Zion selected");
    }

    public void submit(MouseEvent mouseEvent) {
        System.out.println("Submit button pressed");
    }

    public void reset(MouseEvent mouseEvent) {
        System.out.println("Reset button pressed");
    }
}
