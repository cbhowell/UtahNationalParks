package utahNationalParks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.MenuButton;
import utahNationalParks.GraphFunctions;


import javax.print.attribute.standard.Destination;

/**
 * Controller class the controls the functionality of the GUI buttons
 * Condie Howell
 */
public class Controller {

    public MenuButton startMenuBTN;
    public MenuButton destMenuBTN;
    public Label distanceDisplay;
    public Label displayLabel;
    private int start;
    private int dest;


    /**
     * Control Functionality for item selected
     *
     * @param
     */
    public void startArchesSelected() {
        start = 0;
        startMenuBTN.setText("Arches");

        System.out.println("Arches selected");
    }


    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void startBryceSelected(ActionEvent actionEvent) {
        start = 1;
        startMenuBTN.setText("Bryce");
        System.out.println("Bryce Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void startCanyonLandsSelected(ActionEvent actionEvent) {
        start = 2;
        startMenuBTN.setText("Canyonlands");
        System.out.println("Canyonlands Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void startCapitolReefSelected(ActionEvent actionEvent) {
        start = 3;
        startMenuBTN.setText("Capitol Reef");
        System.out.println("Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void startZionSelected(ActionEvent actionEvent) {
        start = 4;
        startMenuBTN.setText("Zion");
        System.out.println("Zion Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void destArchesSelected(ActionEvent actionEvent) {
        dest = 0;
        destMenuBTN.setText("Arches");
        System.out.println("Dest Arches Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void destBryceSelected(ActionEvent actionEvent) {
        dest = 1;


        destMenuBTN.setText("Bryce");
        System.out.println("Dest Bryce selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void destCanyonLandsSelected(ActionEvent actionEvent) {
        dest = 2;

        destMenuBTN.setText("Canyonlands");
        System.out.println("Dest Canyon Lands selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void destCapitolReefSelected(ActionEvent actionEvent) {
        dest = 3;
        destMenuBTN.setText("Capitol Reef");
        System.out.println("Dest Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     *
     * @param actionEvent
     */
    public void destZionSelected(ActionEvent actionEvent) {
        dest = 4;
        destMenuBTN.setText("Zion");
        System.out.println("Dest Zion selected");
    }

    /**
     * Control Functionality for item selected
     */
    public void submit(MouseEvent mouseEvent) {
        System.out.println("Start Button text: " + startMenuBTN.getText());
        System.out.println("Destination Button text: " + destMenuBTN.getText());
        GraphFunctions gf = new GraphFunctions();
        displayLabel.setText(gf.getPathVerbose(start, dest).toString());
        //String s1 = Double.toString(gf.distanceTo(start, dest)) ;
        distanceDisplay.setText("Total Distance: " + (int) gf.distanceTo(start, dest) + " miles");
        System.out.println("Submit button pressed");
    }

    /**
     * Control Functionality for item selected
     */
    public void reset(MouseEvent mouseEvent) {
        start = 0;
        dest = 0;
        System.out.println("Reset button pressed");

        displayLabel.setText("***");
        startMenuBTN.setText("Start Location");
        destMenuBTN.setText("Destination");
        distanceDisplay.setText("***");

    }


}
