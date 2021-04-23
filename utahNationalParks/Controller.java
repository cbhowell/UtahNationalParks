package utahNationalParks;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.MenuButton;

/**
 * Controller class the controls the functionality of the GUI buttons
 * Condie Howell
 */
public class Controller {

    public MenuButton startMenuBTN;
    public MenuButton destMenuBTN;


    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void startArchesSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Arches National Park");

        System.out.println("Arches selected");
    }



    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void startBryceSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Bryce National Park");
        System.out.println("Bryce Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void startCanyonLandsSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Canyonlands National Park");
        System.out.println("Canyonlands Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void startCapitolReefSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Capitol Reef National Park");
        System.out.println("Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void startZionSelected(ActionEvent actionEvent) {
        startMenuBTN.setText("Zion National Park");
        System.out.println("Zion Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void destArchesSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Arches National Park");
        System.out.println("Dest Arches Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void destBryceSelected(ActionEvent actionEvent) {

        destMenuBTN.setText("Bryce National Park");
        System.out.println("Dest Bryce selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void destCanyonLandsSelected(ActionEvent actionEvent) {

        destMenuBTN.setText("Canyonlands National Park");
        System.out.println("Dest Canyon Lands selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void destCapitolReefSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Capitol Reef National Park");
        System.out.println("Dest Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     * @param actionEvent
     */
    public void destZionSelected(ActionEvent actionEvent) {
        destMenuBTN.setText("Zion National Park");
        System.out.println("Dest Zion selected");
    }

    /**
     * Control Functionality for item selected

     */
    public void submit(MouseEvent mouseEvent) {
        System.out.println("Start Button text: " + startMenuBTN.getText());
        System.out.println("Destination Button text: " + destMenuBTN.getText());


        System.out.println("Submit button pressed");
    }

    /**
     * Control Functionality for item selected
     */
    public void reset(MouseEvent mouseEvent) {
        System.out.println("Reset button pressed");
    }
}
