package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.util.ResourceBundle;


public class selection_Controller implements Initializable {

    //Define Variables
    @FXML
    Button dashboard_Button, appearance_Button, health_Button, skills_Button, jobs_Button;
    @FXML
    GridPane gridView1, gridView2;
    @FXML
    Pane pane1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane1.getChildren().clear();
        setDashboardButton();
        setAppearanceButton();
    }

    public void setDashboardButton(){
        dashboard_Button.setOnAction(e -> {
            //System.out.println("Dashboard Button Clicked");
            pane1.getChildren().remove(gridView2);
            pane1.getChildren().add(gridView1);
        });
    }

    public void setAppearanceButton(){
        appearance_Button.setOnAction(e -> {
            //System.out.println("Appearance Button Clicked");
            pane1.getChildren().remove(gridView1);
            pane1.getChildren().add(gridView2);
        });
    }

    public void setSkillsButton(){
        skills_Button.setOnAction(e -> System.out.println("Skills Button Clicked"));
    }

    public void setHealthButton(){
        health_Button.setOnAction(e -> System.out.println("Health Button Clicked"));
    }
    public void setJobsButton(){
        jobs_Button.setOnAction(e -> System.out.println("Jobs Button Clicked"));
    }
}
