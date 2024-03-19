package application;



	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
	import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.ResourceBundle;
	import java.util.stream.Collectors;

	public class Controller implements Initializable {

		private Stage stage;
	    private Scene scene;

	    @FXML
	    private TextField searchBar;

	    @FXML
	    private ListView<Account> listView;
	    
	    
	    
	    public void switchTomainpass(ActionEvent event) throws IOException {
	    	
	    	
	        Parent root = FXMLLoader.load(getClass().getResource("mainpass.fxml"));
	        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        System.out.print("brybksduhbfkds");
	      
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    @FXML
	    void search(ActionEvent event) {
	        listView.getItems().clear();
	        listView.getItems().addAll(searchList(searchBar.getText(),Main.accounts));
	    }

	    @Override
	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        listView.getItems().addAll(Main.accounts);
	    }

	    private List<Account> searchList(String username, List<Account> accounts) {
	    	ArrayList<Account> results = new ArrayList<>();
			
			for (Account a : accounts) {
				if (a.getUsername().equals(username))
					results.add(a);
			}
			
			
			System.out.print(results);
			
			return results;
			
			
			
			
			
	    }
	}
