
package dame.pages.PartieLocale.modeles;

import java.util.ArrayList;

import java.util.List;

import dame.Constantes.PartieLocale.Constantes;
import dame.enumerations.PartieLocale.Couleur;
import ntro.debogage.J;

public class Colonne implements ColonneLectureSeule {
	
	private Jeton[] jetons = new Jeton[10];
	private transient int idColonne;
	
	private boolean[][] CasesUtilisables = Partie.CasesUtilisables;

	public Jeton ajouterJeton(int indiceRangee, Couleur couleur) {
		J.appel(this);
		

		jetons[indiceRangee].setCouleur(couleur);
		jetons[indiceRangee].setIndiceColonne(idColonne);
		jetons[indiceRangee].setIndiceRangee(indiceRangee);
		
		return jetons[indiceRangee];
	}
	
	public void retirerJeton(int indiceRangee) {
		J.appel(this);
		
		jetons[indiceRangee] = null;
		
	}

	@Override
	public List<JetonLectureSeule> getJetons() {
		J.appel(this);
		
		List<JetonLectureSeule> jetonsLectureSeule = new ArrayList<>();
		
		for(Jeton jeton : jetons) {

			jetonsLectureSeule.add((JetonLectureSeule) jeton);
		}
		
		return jetonsLectureSeule;
	}

	public int getIdColonne() {
		return idColonne;
	}

	public void setIdColonne(int idColonne) {
		this.idColonne = idColonne;
	}

	public boolean siPossibleJouerIci(int indiceRangee) {
		J.appel(this);
		boolean rep = true;
		
		if (CasesUtilisables[idColonne][indiceRangee] == false) {
			rep = false;
		}else if (jetons[indiceRangee] != null) {
			rep = false;
		}
		/*
		if (idColonne % 2 == 0 && indiceRangee % 2 == 0) {
			rep = false;
		}else if (idColonne % 2 != 0 && indiceRangee % 2 != 0) {
			rep = false;
		}else if (jetons.get(indiceRangee) != null) {
			rep = false;
		}
		*/
		return rep;
	}

	public void apresChargementJson() {
		J.appel(this);
		
		for(int indiceRangee = 0; indiceRangee < jetons.length; indiceRangee++) {
			Jeton jeton = jetons[indiceRangee];
			jeton.setIndiceColonne(idColonne);
			jeton.setIndiceRangee(indiceRangee);
		}
	}
	
}
