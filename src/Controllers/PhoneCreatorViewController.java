package Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class PhoneCreatorViewController {
    @FXML
    private TextField modelTextField;

    @FXML
    private TextField screenSizeTextField;

    @FXML
    private TextField frontCameraTextField;

    @FXML
    private TextField rearCameraTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private ChoiceBox<?> makeChoiceBox;

    @FXML
    private ChoiceBox<?> osChoiceBox;

    @FXML
    private Slider slider;

    @FXML
    private Label memorySlider;
}

