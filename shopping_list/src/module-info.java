module shopping_list {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
