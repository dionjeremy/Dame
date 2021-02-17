package dame.pages.Profil;



import java.io.IOException;
import java.util.Random;

import modeles.Profil;
import ntro.debogage.J;
import ntro.javafx.Initialisateur;
import ntro.mvc.modeles.EntrepotDeModeles;


public class PartieProfil  {
	
	public static final String[] IDS_MODELES_TESTS = {"test01","test02","test03"};
	
	static {
		Initialisateur.initialiser();
		J.appel(PartieProfil.class);
		
	}
	
	
	
	public static void main(String []args) throws IOException {
		J.appel(PartieProfil.class);
		
		
		
		
	
		
	}
	
	
	
	
	
}
