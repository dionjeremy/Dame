
package dame.pages.PartieLocale.modeles;


import ntro.debogage.J;
import ntro.mvc.modeles.Modele;
import dame.Constantes.PartieLocale.Constantes;
import dame.enumerations.PartieLocale.Couleur;

public class      Partie<PLS extends PartieLectureSeule> 
       extends    Modele<PLS>
       implements PartieLectureSeule {

	protected transient int largeur;
	protected int hauteur;
	
	protected Couleur couleurCourante;

	protected Grille grille;
	
	
	public static boolean[][] CasesUtilisables;
	
	@Override
	public void apresCreation() {
		J.appel(this);
		
		largeur = Constantes.TAILLE_DAMIER_PAR_DEFAUT.getLargeur();
		hauteur = Constantes.TAILLE_DAMIER_PAR_DEFAUT.getHauteur();
		CasesUtilisables = Constantes.CasesUtilisables(hauteur, largeur);
		couleurCourante = Couleur.NOIRE;
		
		initialiserGrille();
	}
	
	private void initialiserGrille() {
		J.appel(this);

		grille = new Grille();
		grille.apresCreation(largeur);
	}

	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		largeur = grille.getColonnes().size();
		grille.apresChargementJson();
	}
	
	/*
    public void jouerIci(int indiceColonneDebut, int indiceRangeeDebut, int ColonneFin, int RangeeFin){
        J.appel(this);

        effectuerCoup(indiceColonneDebut, indiceRangeeDebut, ColonneFin, RangeeFin);
    }
	
    public void effectuerCoup(int indiceColonneDebut, int indiceRangeeDebut, int ColonneFin, int RangeeFin) {
        J.appel(this);
        
        grille.retirerJeton(indiceColonneDebut, indiceRangeeDebut);
        grille.ajouterJeton(ColonneFin, RangeeFin, couleurCourante);
        
        prochaineCouleur();
    }
    */
	
	public void jouerIci(int indiceColonne, int indiceRangee){
        J.appel(this);

        effectuerCoup(indiceColonne, indiceRangee);
    }

    public void effectuerCoup(int indiceColonne, int indiceRangee) {
        J.appel(this);

        grille.ajouterJeton(indiceColonne, indiceRangee, couleurCourante);
        prochaineCouleur();
    }
    
    private void prochaineCouleur() {
        J.appel(this);

        switch(couleurCourante) {

        case NOIRE:
        	couleurCourante = Couleur.BLANC;
            break;
        case BLANC:
        	couleurCourante = Couleur.NOIRE;
            break;
        }
    }

	public int getLargeur() {
		J.appel(this);
		return largeur;
	}

	public void setLargeur(int largeur) {
		J.appel(this);
		this.largeur = largeur;

		initialiserGrille();
	}

	public int getHauteur() {
		J.appel(this);
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		J.appel(this);
		this.hauteur = hauteur;
		
		initialiserGrille();
	}

	public Couleur getCouleurCourante() {
		J.appel(this);
		return couleurCourante;
	}

	public void setCouleurCourante(Couleur couleurCourante) {
		J.appel(this);
		this.couleurCourante = couleurCourante;
	}

	public GrilleLectureSeule getGrille() {
		J.appel(this);
		return (GrilleLectureSeule) grille;
	}

	public void setGrille(Grille grille) {
		J.appel(this);
		this.grille = grille;
	}

	public boolean siPossibleJouerIci(int indiceColonne, int indiceRangee) {
		J.appel(this);

		return grille.siPossibleJouerIci(indiceColonne, indiceRangee);
	}
}
