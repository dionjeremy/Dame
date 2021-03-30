
package dame.pages.Resultats;
import static dame.Constantes.Resultats.Constantes.*;

import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.javafx.ChargeurDeVue;
import ntro.javafx.Initialisateur;
import ntro.mvc.controleurs.FabriqueControleur;
import ntro.mvc.modeles.EntrepotDeModeles;
import ntro.systeme.Systeme;

public class PageResultats extends Application {

	static {

		Initialisateur.initialiser();
		
		J.appel(PageResultats.class);
	}
	
	
	private Random alea = new Random();
	
	public static void main(String[] args) {
		J.appel(PageResultats.class);
		launch(args);
	}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		ChargeurDeVue<VueResultats> chargeur;
		chargeur = new ChargeurDeVue<VueResultats>(CHEMIN_RESULTATS_FXML);

		VueResultats vue = chargeur.getVue();
		String idModeleTest = IDS_MODELES_TESTS[alea.nextInt(IDS_MODELES_TESTS.length)];
		Resultats resultats = EntrepotDeModeles.obtenirModele(Resultats.class, idModeleTest);
		
		AfficheurResultats afficheurResultats = new AfficheurResultats();
		
		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurResultats.class, resultats, vue, afficheurResultats);
		System.out.println(idModeleTest);

		J.valeurs(resultats.getNom(), resultats.getResults(), resultats.getNbMove(),
				resultats.getScorePartie(), resultats.getScoreTotal());
		
		Scene scene = chargeur.nouvelleScene(LARGEUR_PIXELS, HAUTEUR_PIXELS);
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.setMinWidth(LARGEUR_PIXELS);
		fenetrePrincipale.setMinHeight(HAUTEUR_PIXELS);
		capterEvenementFermeture(fenetrePrincipale);

		fenetrePrincipale.show();

	}
	private void capterEvenementFermeture(Stage fenetrePrincipale) {
		J.appel(this);
		fenetrePrincipale.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				J.appel(this);
				Systeme.quitter();
			}
		});
	}
	
}
