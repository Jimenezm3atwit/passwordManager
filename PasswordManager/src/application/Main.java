package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	private static Stage stg;
	public static ArrayList<Account> accounts = new ArrayList<>();
	@Override
	
	
	
	public void start(Stage stage) {
		try {
			
			
			stg=stage;
            
			Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Password Manager");
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void changeScene(String fxml) throws IOException{

        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileAccesser fileopener = new FileAccesser();
	 accounts = fileopener.loadFile(new File("PasswordFiles/adminPasswords.txt"));
		
		
		
		
		
		
		
		
		
		
		launch(args);
		
		
		
		
		
		
	}
}
