package customerinfo;

import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import customerinfo.model.Customer;
import customerinfo.view.CustomerController;


public class MainApp extends Application {
		private Stage primaryStage;
		private AnchorPane rootLayout;
		
		
		// Starts application
		@Override
		public void start(Stage primaryStage) {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Customer Information");
			
			initRootLayout();
			
		}
		
		public void initRootLayout(){
			
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("view/Layout.fxml"));
				rootLayout = (AnchorPane) loader.load();
				
				Scene scene = new Scene(rootLayout);
				primaryStage.setScene(scene);
				primaryStage.show();
				
				
			} catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}