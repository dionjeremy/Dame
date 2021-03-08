package dame.pages.Profil;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import ntro.debogage.J;
import ntro.mvc.Vue;

public class VueProfil implements Vue,Initializable{
	
	@FXML
	private TextField nomText,ageText,descriptionText,avatarText,statistiqueText;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
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
