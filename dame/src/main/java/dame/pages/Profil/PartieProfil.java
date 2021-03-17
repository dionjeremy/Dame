package dame.pages.Profil;



import java.io.IOException;
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


public class PartieProfil extends Application  {
	
	public static final String[] IDS_MODELES_TESTS = {"test01","test02","test03"};
	
	static {
		Initialisateur.initialiser();
		J.appel(PartieProfil.class);
		
	}
	
	private Random alea = new Random();
	
	public static void main(String []args) throws IOException {
		J.appel(PartieProfil.class);
		launch(args);
		System.out.print("test");
		
		
	
		
	}



	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		ChargeurDeVue <VueProfil> chargeur;
		chargeur = new ChargeurDeVue<VueProfil>("/ressources/profil/profil.xml");
		
		VueProfil vue=chargeur.getVue();
		
		String idModeleTest = IDS_MODELES_TESTS[alea.nextInt(IDS_MODELES_TESTS.length)];
		Profil Profil=EntrepotDeModeles.obtenirModele(Profil.class, idModeleTest);
		
		AfficheurProfil afficheurProfil=new AfficheurProfil();
		
		DoitEtre.nonNul(vue);
		
		FabriqueControleur.creerControleur(ControleurProfil.class,Profil,vue,afficheurProfil);
		
		Scene scene =chargeur.nouvelleScene(500,400);
		
		fenetrePrincipale.setScene(scene);
		
		J.valeurs(Profil.getNom(),Profil.getStatistique(),Profil.getAge(),Profil.getAvatar(),Profil.getDescription());
		
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
