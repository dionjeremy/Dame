package dame.commandes.jouer_ici;

import ntro.commandes.Commande;
import ntro.debogage.J;

public class JouerIci extends Commande<JouerIciPourEnvoi, JouerIciRecue> implements JouerIciPourEnvoi, JouerIciRecue {

	private int indiceColonne;
	private int indiceLigne;
	
	
	@Override
	public int getIndiceColonne() {
		J.appel(this);
		
		return indiceColonne;
	}

	@Override
	public int getIndiceLigne() {
		J.appel(this);
		
		return indiceLigne;
	}

	@Override
	public void setIndiceColonne(int indiceColonne) {
		J.appel(this);
		
		this.indiceColonne = indiceColonne;
	}

	@Override
	public void setIndiceLigne(int indiceLigne) {
		J.appel(this);
		
		this.indiceLigne = indiceLigne;
	}
	
	
	
	
	
}
