package application;

import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class SampleController {
	
	@FXML
	Button visualizar;

	@FXML
	Button progresso;

	@FXML
	Button contratarmais;

	@FXML
	Button contratar1;

	@FXML
	Button contratar2;
	
	@FXML
	Button home;
	
	@FXML
	Button eventos;
	
	public void visualizar_perfil() throws IOException {
		Stage stage = (Stage) visualizar.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("VisualizarPerfil.fxml"));
		primaryStage.setTitle("Visualizar Perfil");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
	
	}
	
	public void progresso_evento() throws IOException {
		Stage stage = (Stage) progresso.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ProgressoEvento.fxml"));
		primaryStage.setTitle("Visualizar Progresso do Evento");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
		
	}
	
	public void contratar_mais() throws IOException {
		Stage stage = (Stage) contratarmais.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ContratarFuncionarios.fxml"));
		primaryStage.setTitle("Contratar Funcionarios");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
	
	}
	
	public void contratar_func1() throws IOException {
		Stage stage = (Stage) contratar1.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ContratacaoEfetuada1.fxml"));
		primaryStage.setTitle("Funcionario Contratado");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
		
	}
	
	public void contratar_func2() throws IOException {
		Stage stage = (Stage) contratar2.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ContratacaoEfetuada2.fxml"));
		primaryStage.setTitle("Funcionario Contratado");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
	
	}	
	
	public void abrir_home() throws IOException {
		Stage stage = (Stage) home.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		primaryStage.setTitle("Dashboard");
		primaryStage.setScene(new Scene(root, 1366, 768));
		primaryStage.show();
		
	}
	
}
