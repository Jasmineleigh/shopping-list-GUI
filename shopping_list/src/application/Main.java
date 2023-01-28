package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	protected TextArea txaList = new TextArea();
	protected List shoppingList = new List();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = buildRoot();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Pane buildRoot() {
		GridPane root = new GridPane();
		root.add(buildList(), 0, 0);
		root.add(addItem(), 0, 1);
		return root;
	}
	
	public VBox buildList() {
		VBox vBoxList = new VBox();
		vBoxList.getChildren().add(txaList);
		return vBoxList;
	}
	
	// Section for adding item
	public VBox addItem() {
		VBox vBoxAddItem = new VBox();
		
		GridPane root = new GridPane();
		HBox hBoxFields = new HBox();
		hBoxFields.setSpacing(15);
		
		TextField txfItemName = new TextField();
		TextField txfItemAmount = new TextField();
		Button btnAddItem = new Button("Add");
		
		hBoxFields.getChildren().addAll(txfItemName, txfItemAmount, btnAddItem);
		root.add(hBoxFields, 0, 0);
		btnAddItem.setOnAction(new EventHandler<ActionEvent> () {

			@Override
			public void handle(ActionEvent event) {
				String name = txfItemName.getText();
				int amount = Integer.parseInt(txfItemAmount.getText());
				Item addItem = new Item(name, amount);
				System.out.println("Adding...\n" + addItem);
				shoppingList.addItem(addItem);
				txaList.setText(shoppingList.toString());
			}
			
		});
		
		vBoxAddItem.getChildren().add(root);
		return vBoxAddItem;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
