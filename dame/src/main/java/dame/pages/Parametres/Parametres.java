package dame.pages.Parametres;

import dame.enumerations.Parametres.Couleur;
import dame.enumerations.Parametres.TailleDamier;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;





public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {
	
	private Couleur couleurJoueur1;
	private TailleDamier tailleDamier;

	@Override
	public Couleur getCouleurJoueur1() {
		J.appel(this);
		
		return couleurJoueur1;
	}

	@Override
	public TailleDamier getTailleDamier() {
		
		return tailleDamier;
	}

	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(couleurJoueur1);
		DoitEtre.nonNul(tailleDamier);
		
	}

	@Override
	public void apresCreation() {
		J.appel(this);

		couleurJoueur1 = Couleur.NOIRE;
		tailleDamier = TailleDamier.DAMIER_10X10;
		
	}
	public void choisirQuiCommence(Couleur joueurQuiCommence) {
		J.appel(this);
		
		this.couleurJoueur1 = joueurQuiCommence;
	}

	public void choisirTailleDamier(TailleDamier tailleDamier) {
		J.appel(this);
		
		this.tailleDamier = tailleDamier;
	}


}
