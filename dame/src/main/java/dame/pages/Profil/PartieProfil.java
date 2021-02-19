package dame.pages.Profil;



import java.io.IOException;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import ntro.debogage.J;
import ntro.javafx.Initialisateur;
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
		J.ici();
		
		String idModeleTest = IDS_MODELES_TESTS[alea.nextInt(IDS_MODELES_TESTS.length)];
		Profil profil=EntrepotDeModeles.obtenirModele(Profil.class, idModeleTest);
		
		J.valeurs(profil.getId(),profil.getNom(),profil.getStatistique(),profil.getAge(),profil.getAvatar(),profil.getDescription());
		
		Systeme.quitter();
		
	}
	
	
	
	
	
}
