
package dame.Constantes.PartieLocale;

import java.util.List;

import dame.enumerations.PartieLocale.TailleDamier;
import dame.pages.PartieLocale.modeles.Colonne;

public class Constantes {
	
	public static final String CHEMIN_PARTIE_LOCALE_FXML = "/partie/locale/structure.xml";
	
	public static final String CHEMIN_IMAGE_NOIRE = "/images/noire.png";
	public static final String CHEMIN_IMAGE_BLANC = "/images/blanc.png";
	
	public static final String[] IDS_MODELES_TESTS = {"test01","test02","test03"};

	public static final int HAUTEUR_DAMIER_8X8 = 8;
	public static final int HAUTEUR_DAMIER_10X10 = 10;
	public static final int HAUTEUR_DAMIER_12X12 = 12;

	public static final int LARGEUR_DAMIER_8X8 = 8;
	public static final int LARGEUR_DAMIER_10X10 = 10;
	public static final int LARGEUR_DAMIER_12X12 = 12;
	
	public static final TailleDamier TAILLE_DAMIER_PAR_DEFAUT = TailleDamier.DAMIER_10X10;
	
	public static final int TAILLE_CASE = 40;
	
	public static final int LARGEUR_PIXELS_MIN = 400;
	public static final int HAUTEUR_PIXELS_MIN = 600;

	public static final int LARGEUR_PIXELS = 600;
	public static final int HAUTEUR_PIXELS= 800;

	
	public static final boolean[][] CASES_UTILISABLES_8X8 = CasesUtilisables(8, 8);
	public static final boolean[][] CASES_UTILISABLES_10X10 = CasesUtilisables(10, 10);
	public static final boolean[][] CASES_UTILISABLES_12X12 = CasesUtilisables(12, 12);
	
	public static final boolean[][] CasesUtilisables(int hauteur, int largeur) {
		
		boolean[][] rep = new boolean[hauteur][largeur];
		
		for (int i = 0; i < rep.length; i++) {
			for (int j = 0; j < rep[i].length; j++) {
				if (hauteur % 2 == 0 && largeur % 2 == 0) {
					rep[i][j] = false;
				}else if (hauteur % 2 != 0 && largeur % 2 != 0) {
					rep[i][j] = false;
				}else {
					rep[i][j] = true;
				}
			}
		}
		
		
		return rep;
	}
	
}

