
package dame.enumerations.PartieLocale;

import static dame.Constantes.PartieLocale.Constantes.*;

import ntro.debogage.J;

public enum TailleDamier {
	
	DAMIER_8X8(HAUTEUR_DAMIER_8X8, LARGEUR_DAMIER_8X8), 
	DAMIER_10X10(HAUTEUR_DAMIER_10X10, LARGEUR_DAMIER_10X10), 
	DAMIER_12X12(HAUTEUR_DAMIER_12X12, LARGEUR_DAMIER_12X12);

	private int hauteur;
	private int largeur;
	
	private TailleDamier(int hauteur, int largeur) {
		J.appel(this);

		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
	public int getHauteur(){
		return hauteur;
	}

	public int getLargeur(){
		return largeur;
	}
}
