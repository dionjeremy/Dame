package dame.pages.Parametres;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import dame.enumerations.Parametres.Couleur;
import dame.enumerations.Parametres.TailleDamier;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import ntro.commandes.FabriqueCommande;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.Vue;
import dame.commandes.choisir_qui_commence.ChoisirQuiCommencePourEnvoi;
import dame.commandes.choisir_taille_damier.ChoisirTailleDamierPourEnvoi;
import dame.commandes.choisir_qui_commence.ChoisirQuiCommence;
import dame.commandes.choisir_taille_damier.ChoisirTailleDamier;



public class VueParametres implements Vue, Initializable {
	
	private ChoisirQuiCommencePourEnvoi choisirQuiCommence;
	private ChoisirTailleDamierPourEnvoi choisirTailleDamier;
	
	@FXML 
	private Button caseNoire, caseBlanc;
	
	@FXML
	private CheckBox checkNoire, checkBlanc;

	@FXML
	private ComboBox<String> choixTaille;
	
	private Map<String, TailleDamier> tailleSelonNom = new HashMap<>();
	private Map<TailleDamier, String> nomSelonTaille = new HashMap<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(caseNoire);
		DoitEtre.nonNul(caseBlanc);
		DoitEtre.nonNul(checkNoire);
		DoitEtre.nonNul(checkBlanc);
		DoitEtre.nonNul(choixTaille);

		caseNoire.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		caseBlanc.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));
		
		initialiserChoixTaille(resources);
		
	}
	
	private void initialiserChoixTaille(ResourceBundle resources) {
		J.appel(this);

		for(TailleDamier tailleDamier : TailleDamier.values()) {
			
			String nomTaille = tailleDamier.toString();
			
			choixTaille.getItems().add(nomTaille);
			
			tailleSelonNom.put(nomTaille, tailleDamier);
			nomSelonTaille.put(tailleDamier, nomTaille);
		}

		choixTaille.getSelectionModel().clearAndSelect(0);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		checkNoire.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirQuiCommence.setCouleur(Couleur.NOIRE);
				choisirQuiCommence.envoyerCommande();
			}
		});
		
		checkBlanc.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				choisirQuiCommence.setCouleur(Couleur.BLANC);
				choisirQuiCommence.envoyerCommande();
			}
		});

		choixTaille.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				String nomTailleChoisie = choixTaille.getSelectionModel().getSelectedItem();
				
				TailleDamier tailleChoisie = tailleSelonNom.get(nomTailleChoisie);
				
				choisirTailleDamier.setTailleDamier(tailleChoisie);
				choisirTailleDamier.envoyerCommande();
			}
		});
		
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		choisirQuiCommence = FabriqueCommande.obtenirCommandePourEnvoi(ChoisirQuiCommence.class);
		choisirTailleDamier = FabriqueCommande.obtenirCommandePourEnvoi(ChoisirTailleDamier.class);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}
	
	public void afficherQuiCommence(Couleur couleur) {
		J.appel(this);
		
		DoitEtre.nonNul(couleur);

		switch(couleur) {
		
		case NOIRE:
			checkNoire.setSelected(true);
			checkBlanc.setSelected(false);
			break;

		case BLANC:
			checkNoire.setSelected(false);
			checkBlanc.setSelected(true);
			break;
		
		}
	}

	public void afficherTailleDamier(TailleDamier tailleDamier) {
		J.appel(this);
		
		String nomTaille = nomSelonTaille.get(tailleDamier);
		
		int indiceTaille = choixTaille.getItems().indexOf(nomTaille);
		
		if(indiceTaille != -1) {
			choixTaille.getSelectionModel().clearAndSelect(indiceTaille);
		}
	}

}
