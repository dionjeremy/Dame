package dame.pages.Resultats;

import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Resultats extends Modele<ResultatsLectureSeule> implements ResultatsLectureSeule {
	private String nom = "user1";
	private String results = "Victoire";
	private int nbMove;
	private int scorePartie;
	private int scoreTotal;
	@Override
	public void apresChargementJson() {
		J.appel(this);
		DoitEtre.nonNul(nom);
		DoitEtre.nonNul(results);
	}

	@Override
	public void apresCreation() {
		J.appel(this);
		nom="user1";
		results = "Victoire";
		nbMove = 0;
		scorePartie = 0;
		scoreTotal = 0;
		
		
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		J.appel(this);
		this.nom = nom;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		J.appel(this);
		this.results = results;
	}

	public int getNbMove() {
		return nbMove;
	}

	public void setNbMove(int nbMove) {
		J.appel(this);
		this.nbMove = nbMove;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		J.appel(this);
		this.scorePartie = scorePartie;
	}

	public int getScoreTotal() {
		return scoreTotal;
	}

	public void setScoreTotal(int scoreTotal) {
		J.appel(this);
		this.scoreTotal = scoreTotal;
	}


}
