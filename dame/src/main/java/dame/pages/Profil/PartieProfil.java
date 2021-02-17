package dame.pages.Profil;



import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import ntro.debogage.J;
import ntro.javafx.Initialisateur;
import ntro.systeme.Systeme;


public class PartieProfil extends Application  {
	
	public static final String[] IDS_MODELES_TESTS = {"test01","test02","test03"};
	
	static {
		Initialisateur.initialiser();
		J.appel(PartieProfil.class);
		
	}
	
	
	
	public static void main(String []args) throws IOException {
		J.appel(PartieProfil.class);
		
		System.out.print("test");
		
		
	
		
	}



	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		J.ici();
		Systeme.quitter();
		
	}
	
	
	
	
	
}
