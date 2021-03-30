package dame.commandes.choisir_qui_commence;

import ntro.commandes.CommandePourEnvoi;
import dame.enumerations.Parametres.Couleur;

public interface ChoisirQuiCommencePourEnvoi extends CommandePourEnvoi {
	void setCouleur(Couleur marque);

}
