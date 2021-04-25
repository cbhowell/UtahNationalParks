package utahNationalParks;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Controller class the controls the functionality of the GUI buttons
 * Condie Howell
 */
public class Controller {

    public MenuButton startMenuBTN;
    public MenuButton destMenuBTN;
    public Label distanceDisplay;
    public Label displayLabel;
   // @FXML public Pane pane_1;
    private int start;
    private int dest;


    @FXML public Label imgLbl_1;




    /**
     * Control Functionality for item selected
     *
     */
    public void startArchesSelected() throws FileNotFoundException {




        start = 0;
        startMenuBTN.setText("Arches");

        System.out.println("Arches selected");
    }


    /**
     * Control Functionality for item selected
     *
     */
    public void startBryceSelected() {
        start = 1;
        startMenuBTN.setText("Bryce");
        System.out.println("Bryce Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void startCanyonLandsSelected() {
        start = 2;
        startMenuBTN.setText("Canyonlands");
        System.out.println("Canyonlands Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void startCapitolReefSelected() {
        start = 3;
        startMenuBTN.setText("Capitol Reef");
        System.out.println("Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void startZionSelected() {
        start = 4;
        startMenuBTN.setText("Zion");
        System.out.println("Zion Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void destArchesSelected() {
        dest = 0;
        destMenuBTN.setText("Arches");
        System.out.println("Dest Arches Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void destBryceSelected() {
        dest = 1;


        destMenuBTN.setText("Bryce");
        System.out.println("Dest Bryce selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void destCanyonLandsSelected() {
        dest = 2;

        destMenuBTN.setText("Canyonlands");
        System.out.println("Dest Canyon Lands selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void destCapitolReefSelected() {
        dest = 3;
        destMenuBTN.setText("Capitol Reef");
        System.out.println("Dest Capitol Reef Selected");
    }

    /**
     * Control Functionality for item selected
     *
     */
    public void destZionSelected() {
        dest = 4;
        destMenuBTN.setText("Zion");
        System.out.println("Dest Zion selected");
    }

    /**
     * Control Functionality for item selected
     */
    public void submit() {
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
    public void reset() {
        start = 0;
        dest = 0;
        System.out.println("Reset button pressed");

        displayLabel.setText("");
        startMenuBTN.setText("Start Location");
        destMenuBTN.setText("Destination");
        distanceDisplay.setText("");

    }


}
