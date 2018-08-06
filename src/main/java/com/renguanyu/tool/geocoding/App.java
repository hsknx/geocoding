package com.renguanyu.tool.geocoding;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = (Parent)FXMLLoader.load(getClass().getResource("/fxml/MainFxml.fxml"));
		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add("/css/app.css");
		primaryStage.setScene(scene);
		primaryStage.setTitle("地址信息转经纬度信息");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
