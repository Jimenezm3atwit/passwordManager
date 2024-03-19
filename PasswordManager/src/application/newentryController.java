package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class newentryController {

	private Stage stage;
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

    	 System.out.print("Bruh");
	        String username = entryuser.getText().toString();
	        String domain = entrydomain.getText().toString();
	        String password = entrypass.getText().toString();
	        
	        
	        Account newacc = new Account(username,password,domain);
	        
	        Main.accounts.add(newacc);
    	
    	
    	
    	
    	
        Parent root = FXMLLoader.load(getClass().getResource("mainpass.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
  

	 

	    
	    
	    
	    public void plswork(ActionEvent event) throws IOException{
	    
	   
	    
	    	
		        
	     }
	        
	        
	        
	    }


	
	

