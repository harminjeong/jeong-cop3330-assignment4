/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ResourceBundle;

public class Controller {
    /*@Override
    public void initialize(URL url, ResourceBundle rb){

    }*/
    @FXML
    private Label welcomeText;

    @FXML
    protected void onAddButtonClick() {
        welcomeText.setText("Welcome to To-Do List Application!");
    }
    @FXML
    Button onAddButtonClick;
    @FXML
    TextField descriptionText;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;

    @FXML

    private void addEvent(Event e){

    };

    public void descriptionText(ActionEvent actionEvent) {
    }

    public void datePicker(ActionEvent actionEvent) {
    }

    public void onEditButtonClick(ActionEvent actionEvent) {
    }

    public void onEditTitleButtonClick(ActionEvent actionEvent) {
    }

    public void onDeleteButtonClick(ActionEvent actionEvent) {
    }

    public void onSaveButtonClick(ActionEvent actionEvent) {
    }
}