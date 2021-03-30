package dame.commandes.choisir_taille_damier;

import ntro.commandes.CommandeRecue;
import dame.enumerations.Parametres.TailleDamier;

public interface ChoisirTailleDamierRecue extends CommandeRecue {
	TailleDamier getTailleDamier();

}
