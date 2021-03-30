package dame.commandes.choisir_qui_commence;

import ntro.commandes.Commande;
import ntro.debogage.J;
import dame.enumerations.Parametres.Couleur;

public class ChoisirQuiCommence extends Commande<ChoisirQuiCommencePourEnvoi, ChoisirQuiCommenceRecue> 
implements ChoisirQuiCommencePourEnvoi, ChoisirQuiCommenceRecue {

	private Couleur couleur;
	
	@Override
	public Couleur getCouleur() {
		J.appel(this);
		
		return couleur;
	}

	@Override
	public void setCouleur(Couleur marque) {
		J.appel(this);
		
		this.couleur = marque;
		
	}

}
