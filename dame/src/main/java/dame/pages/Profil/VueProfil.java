package dame.pages.Profil;

import java.net.URL;
import java.util.ResourceBundle;

import commandes.profil.ChoisirProfil;
import commandes.profil.ChoisirProfilPourEnvoi;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ntro.commandes.FabriqueCommande;
import ntro.debogage.J;
import ntro.mvc.Vue;

public class VueProfil implements Vue,Initializable{
	
	private ChoisirProfilPourEnvoi choisirProfil;
	
	@FXML
	private TextField nomText,ageText,descriptionText,avatarText,statistiqueText;
	@FXML
	private Button buttonSauvegarder;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
	}
	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		choisirProfil=FabriqueCommande.obtenirCommandePourEnvoi(ChoisirProfil.class);
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		nomText.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setNom(nomText.getText());
				choisirProfil.envoyerCommande();
			}
		});
		
		ageText.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setAge(Integer.parseInt(ageText.getText()));
				choisirProfil.envoyerCommande();
			}
		});
		
		descriptionText.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setDescription(descriptionText.getText());
				choisirProfil.envoyerCommande();
			}
		});
		
		avatarText.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setAvatar(avatarText.getText());
				choisirProfil.envoyerCommande();
			}
		});
		
		statistiqueText.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setStatistique(Integer.parseInt(ageText.getText()));
				choisirProfil.envoyerCommande();
			}
		});
		
		buttonSauvegarder.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirProfil.setStatistique(Integer.parseInt(statistiqueText.getText()));
				choisirProfil.setAge(Integer.parseInt(ageText.getText()));
				choisirProfil.setDescription(descriptionText.getText());
				choisirProfil.setNom(nomText.getText());
				choisirProfil.setAvatar(avatarText.getText());
				choisirProfil.envoyerCommande();
			}
		});
		
	}

	

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

	public void afficherNom(String nom) {
		nomText.setText(nom);
	}
	
	public void afficherDescription(String description) {
		descriptionText.setText(description);
	}
	
	public void afficherAvatar(String avatar) {
		avatarText.setText(avatar);
	}
	
	public void afficherStatistique(int statistique) {
		String statistiqueString=""+statistique;
		statistiqueText.setText(statistiqueString);
	}
	
	public void afficherAge(int age) {
		String ageString=""+age;
		ageText.setText(ageString);
	}
}
