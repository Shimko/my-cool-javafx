package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea ;


    public void btnSendClick(ActionEvent actionEvent) {
//        Button button = (Button) actionEvent.getSource();
//        String text = button.getText();
//        System.out.println("Нажал на кнопку \""+ text +"\"");
        String text = textArea.getText()  +textField.getText() + "\n";
        textField.setText("");
        textField.requestFocus();
        textArea.setText(text);
        textArea.setScrollTop(Double.MAX_VALUE);



    }
}
