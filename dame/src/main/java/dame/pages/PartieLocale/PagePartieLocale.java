
package dame.pages.PartieLocale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.javafx.ChargeurDeVue;
import ntro.javafx.Initialisateur;
import ntro.mvc.controleurs.FabriqueControleur;
import ntro.mvc.modeles.EntrepotDeModeles;
import ntro.systeme.Systeme;
import dame.pages.PartieLocale.afficheurs.AfficheurPartieLocale;
import dame.pages.PartieLocale.controleurs.ControleurPartieLocale;
import dame.pages.PartieLocale.vues.VuePartieLocale;
import dame.pages.PartieLocale.modeles.ColonneLectureSeule;
import dame.pages.PartieLocale.modeles.JetonLectureSeule;
import dame.pages.PartieLocale.modeles.PartieLocale;

import static dame.Constantes.PartieLocale.Constantes.*;
import static dame.Constantes.PartieLocale.Constantes.CHEMIN_PARTIE_LOCALE_FXML;
import static dame.Constantes.PartieLocale.Constantes.HAUTEUR_PIXELS;
import static dame.Constantes.PartieLocale.Constantes.IDS_MODELES_TESTS;
import static dame.Constantes.PartieLocale.Constantes.LARGEUR_PIXELS;

import java.util.Random;


public class PagePartieLocale extends Application {

	static {

		Initialisateur.initialiser();
		
		J.appel(PagePartieLocale.class);
	}

	private Random alea = new Random();
	
	public static void main(String[] args) {
		J.appel(PagePartieLocale.class);
		launch(args);
	}

	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		ChargeurDeVue<VuePartieLocale> chargeur;
		chargeur = new ChargeurDeVue<VuePartieLocale>(CHEMIN_PARTIE_LOCALE_FXML);

		VuePartieLocale vue = chargeur.getVue();
		
		String idModeleTest = IDS_MODELES_TESTS[alea.nextInt(IDS_MODELES_TESTS.length)];
		PartieLocale partie = EntrepotDeModeles.obtenirModele(PartieLocale.class, "test07");
		
		AfficheurPartieLocale afficheur = new AfficheurPartieLocale();
		
		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurPartieLocale.class, partie, vue, afficheur);

		Scene scene = chargeur.nouvelleScene(LARGEUR_PIXELS, HAUTEUR_PIXELS);

		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.setMinWidth(LARGEUR_PIXELS);
		fenetrePrincipale.setMinHeight(HAUTEUR_PIXELS);

		fenetrePrincipale.show();
	}
}

