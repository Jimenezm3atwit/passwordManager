package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class passmainController {

	private Stage stage;
    private Scene scene;
    private Parent root;


public void switchToGenerator(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Generator.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
public void switchToNewEntry(ActionEvent event) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("newentry.fxml"));
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchToReused(ActionEvent event) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("Reused.fxml"));
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}


public void switchTosearch(ActionEvent event) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchToLogOut(ActionEvent event) throws IOException {
	FileAccesser.saveFile(new File("PasswordFiles/adminPasswords.txt"), Main.accounts);
	System.out.print("Bruh");
	System.exit(0);
    
}








}

