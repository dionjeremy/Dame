
package dame.pages.PartieLocale.vues;

import java.net.URL;
import java.util.ResourceBundle;

import ntro.commandes.FabriqueCommande;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.Vue;
import dame.commandes.jouer_ici.JouerIciPourEnvoi;
import dame.Constantes.PartieLocale.Constantes;
import dame.commandes.jouer_ici.JouerIci;
import dame.enumerations.PartieLocale.Couleur;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public abstract class VuePartie implements Vue, Initializable {

    @FXML
    private HBox conteneurEntetes;

    @FXML
    private VBox conteneurGrille;
    
    private Button[] entetes;
    
    private Button[][] cases;
    
    private JouerIciPourEnvoi jouerIciPourEnvoi;
    
    private Image imgNoire = new Image(Constantes.CHEMIN_IMAGE_NOIRE);
    private Image imgBlanc = new Image(Constantes.CHEMIN_IMAGE_BLANC);
    
    private ImageView viewNoire = new ImageView(imgNoire);
    private ImageView viewBlanc = new ImageView(imgBlanc);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(conteneurEntetes);
		DoitEtre.nonNul(conteneurGrille);
	}

    public void creerGrille(int largeur, int hauteur) {
        J.appel(this);

        //creerEntetes(largeur);
        
        creerColonnes(largeur, hauteur);
    }
    
    private void creerEntetes(int largeur) {
        J.appel(this);
        
        entetes = new Button[largeur];
        
        for(int indiceRangee = 0; indiceRangee < largeur; indiceRangee++) {
        	
        	Button entete = new Button("|");
        	
        	entete.setMinWidth(Constantes.TAILLE_CASE);
        	entete.setMaxWidth(Constantes.TAILLE_CASE);
        	
        	entetes[indiceRangee] = entete;
        	
        	conteneurEntetes.getChildren().add(entete);
        }
    }

    private void creerColonnes(int largeur, int hauteur) {
        J.appel(this);
        
        cases = new Button[largeur][hauteur];

        for(int indiceRangee = 0; indiceRangee < hauteur; indiceRangee++) {
        	HBox ligne = creerLigne(indiceRangee, largeur);
        	
        	conteneurGrille.getChildren().add(ligne);
        }
    }

    private HBox creerLigne(int indiceRangee, int largeur) {
        J.appel(this);
        
        HBox ligne = new HBox();
        
        for(int indiceColonne = 0; indiceColonne < largeur; indiceColonne++) {
        	
        	Button _case = new Button();
        	
        	_case.setMinWidth(Constantes.TAILLE_CASE);
        	_case.setMaxWidth(Constantes.TAILLE_CASE);
        	_case.setPrefSize(Constantes.TAILLE_CASE, Constantes.TAILLE_CASE);
        	
        	cases[indiceColonne][indiceRangee] = _case;
        	
        	ligne.getChildren().add(_case);
        }
        
        return ligne;
    } 
    


	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	} 
	
	private boolean siIndicesValides(int indiceColonne, int indiceRangee) {
		J.appel(this);

		boolean siValide = false;
		
		if(indiceColonne >= 0 && indiceColonne < cases.length) {
			siValide = indiceRangee >= 0 && indiceRangee < cases[indiceColonne].length;
		}
		
		return siValide;
	}

	public void changerCouleurCase() {
		J.appel(this);
		
		String couleurCase = "FONCE";
		
		for (int i = 0; i < cases.length; i++) {
			
			switch(couleurCase) {
				case "FONCE":
					couleurCase = "PALE";
					break;
				case "PALE":
					couleurCase = "FONCE";
					break;
			}
			
			for (int j = 0; j < cases[i].length; j++) {
				
				Button _case = cases[i][j];
				
				switch(couleurCase) {
					case "FONCE":
						_case.setBackground(new Background(new BackgroundFill(Color.SADDLEBROWN, null, null)));
						couleurCase = "PALE";
						break;
					case "PALE":
						_case.setBackground(new Background(new BackgroundFill(Color.MOCCASIN, null, null)));
						couleurCase = "FONCE";
						break;
				}
			}
		}
		
	}
	
	public void afficherJeton(int indiceColonne, int indiceRangee, Couleur couleur) {
		J.appel(this);
		viewNoire.setFitHeight(30);
		viewNoire.setPreserveRatio(true);
		
		viewBlanc.setFitHeight(30);
		viewBlanc.setPreserveRatio(true);
		
		viewNoire = new ImageView(imgNoire);
		viewBlanc = new ImageView(imgBlanc);
		
		if(siIndicesValides(indiceColonne, indiceRangee)) {

			Button _case = cases[indiceColonne][indiceRangee];
			
			switch(couleur) {
				case NOIRE:
					_case.setGraphic(viewNoire);
					break;
				case BLANC:
					_case.setGraphic(viewBlanc);
					break;
				case VIDE:
					_case.setGraphic(null);
					break;
				case BLOQUE:
					_case.setGraphic(null);
					break;
			}
		}
	}
	
	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		jouerIciPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(JouerIci.class);
	}
	
	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases[i].length; j++) {
				
				final int indiceColonne = i;
				final int indiceLigne = j;
				
				cases[i][j].setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						J.appel(this);
						
						jouerIciPourEnvoi.setIndiceColonne(indiceColonne);
						jouerIciPourEnvoi.setIndiceLigne(indiceLigne);
						
						jouerIciPourEnvoi.envoyerCommande();
					}
					
				});
				
				
				
				
			}
		}
		
		
		
		
	}

}









