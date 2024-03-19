package application;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
public class generatorController {

	private Stage stage;
	private Clipboard clipboard = Clipboard.getSystemClipboard();
    private Scene scene;
 	@FXML
    private Button entrysave;
    @FXML
    private TextField entrydomain;
    @FXML
    private TextField entryuser;
    @FXML
    private PasswordField entrypass;
    @FXML
    private Button save;
   
    
    ////////back button
    public void switchTomainpass(ActionEvent event) throws IOException {
    	
    	
        Parent root = FXMLLoader.load(getClass().getResource("mainpass.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.print("brybksduhbfkds");
      
    }
  
    public void switchTogene(ActionEvent event) throws IOException {
    
    
    	System.out.print("Bruh moment TM");
    	
    	ClipboardContent content = new ClipboardContent();
    	String password = new PasswordGenerator().generatePassword(12,true,new Random());
    	content.putString(password);
    	
    clipboard.setContent(content);
    
    

    
    	
    	
    	
    }
    
     
	        
	    }