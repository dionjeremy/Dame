package dame.commandes.choisir_taille_damier;

import dame.enumerations.Parametres.TailleDamier;
import ntro.commandes.Commande;
import ntro.debogage.J;


public class ChoisirTailleDamier extends Commande<ChoisirTailleDamierPourEnvoi, ChoisirTailleDamierRecue> 
implements ChoisirTailleDamierPourEnvoi, ChoisirTailleDamierRecue {
	private TailleDamier tailleDamier;

	@Override
	public TailleDamier getTailleDamier() {
		J.appel(this);
		
		return tailleDamier;
	}

	@Override
	public void setTailleDamier(TailleDamier taille) {
		J.appel(this);
		
		this.tailleDamier = taille;
		
	}
	
	

}
