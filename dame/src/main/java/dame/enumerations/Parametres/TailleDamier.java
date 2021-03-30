package dame.enumerations.Parametres;

import static dame.Constantes.Parametres.Constantes.*;

import ntro.debogage.J;

public enum TailleDamier {
	DAMIER_10X10(HAUTEUR_DAMIER_10X10, LARGEUR_DAMIER_10X10), 
	DAMIER_8X8(HAUTEUR_DAMIER_8X8, LARGEUR_DAMIER_8X8), 
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
	
	// Nom de Tailledamier pour l'affichage
	@Override
	public String toString() {
		switch(this) {
		case DAMIER_10X10: return "Classique (10X10)";
		case DAMIER_8X8: return "Variante (8X8)";
		case DAMIER_12X12: return "Variante (12X12)";
		default: throw new IllegalArgumentException();
			
		}
		
		
	}
	


}
