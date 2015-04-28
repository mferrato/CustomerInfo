package customerinfo.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import customerinfo.MainApp;
import customerinfo.model.Customer;

public class CustomerController {
		@FXML
		private TextField firstName;
		@FXML
		private TextField lastName;
		@FXML
		private TextField middleInitial;
		@FXML
		private RadioButton Male;
		@FXML
		private RadioButton Female;
		@FXML
		private TextField address;
		@FXML
		private ChoiceBox state;
		@FXML
		private TextField city;
		@FXML
		private PasswordField postalCode;
		@FXML
		private Button Save;
		@FXML
		private Button Clear;
		private Stage customerStage;
		
		@SuppressWarnings("unchecked")
		@FXML
		private void initialize(){
			firstName.addEventFilter(KeyEvent.KEY_TYPED, maxLength(50));
			lastName.addEventFilter(KeyEvent.KEY_TYPED, maxLength(50));
			middleInitial.addEventFilter(KeyEvent.KEY_TYPED, maxLength(1));
			address.addEventFilter(KeyEvent.KEY_TYPED, maxLength(50));
			city.addEventFilter(KeyEvent.KEY_TYPED, maxLength(25));
			postalCode.addEventFilter(KeyEvent.KEY_TYPED, maxLength(9));

			ObservableList<String> states = FXCollections.observableArrayList();
			states.addAll("Alabama","Alaska","Arizona","Arkansas","California","Colorado",
					"Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois",
					"Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland",
					"Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
					"Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico",
					"New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon",
					"Pennsylvania","Rhode","Island","South Carolina","South Dakota",
					"Tennessee","Texas","Utah","Vermont","Virginia","Washington",
					"West Virginia","Wisconsin","Wyoming");
			state.setItems(states);
			
			Female.setSelected(true);
			Male.setSelected(true);
		}
		
		public void setCustomerStage(Stage customerStage){
			this.customerStage = customerStage;
		}

		public CustomerController() {
		}
		
		@SuppressWarnings("unchecked")
		@FXML
		private void handleClear(){
			firstName.setText("");;
			lastName.clear();
			middleInitial.clear();
			Male.setSelected(false);
			Female.setSelected(false);
			address.clear();
			city.clear();
			state.setValue(null);
			postalCode.clear();
		}
		
		@FXML
		private void handleSave(){
			String firstNam = firstName.getText();
			String lastNam = lastName.getText();
			String middleInitia = middleInitial.getText();
			String gende; 
			String addres = address.getText();
			String cit = city.getText();
			String stat = (String) state.getValue();
			String postalCod = postalCode.getText();
			if (Male.isPressed()){gende = Male.getText();} else {gende = Female.getText();}
			Customer newCustomer = new Customer(lastNam, firstNam, middleInitia,
					addres, postalCod, cit, gende, stat);
			System.out.println(newCustomer.toString());
		}
		public EventHandler<KeyEvent> maxLength(final Integer i) {
	        return new EventHandler<KeyEvent>() {
	            @Override
	            public void handle(KeyEvent arg0) {

	                TextField text = (TextField) arg0.getSource();
	                if (text.getText().length() >= i) {
	                    arg0.consume();
	                }

	            }

	        };

	    }

	}

