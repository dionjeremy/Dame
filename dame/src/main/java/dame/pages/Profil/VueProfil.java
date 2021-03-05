package dame.pages.Profil;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import ntro.debogage.J;
import ntro.mvc.Vue;

public class VueProfil implements Vue,Initializable{

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
		
	}
	
	public void afficherDescription(String description) {
		
	}
	
	public void afficherAvatar(String avatar) {
		
	}
	
	public void afficherStatistique(int statistique) {
		
	}
	
	public void afficherAge(int age) {
		
	}
}
