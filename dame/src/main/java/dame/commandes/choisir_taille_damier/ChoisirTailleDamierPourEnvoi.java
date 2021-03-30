package dame.commandes.choisir_taille_damier;

import ntro.commandes.CommandePourEnvoi;
import dame.enumerations.Parametres.TailleDamier;

public interface ChoisirTailleDamierPourEnvoi extends CommandePourEnvoi {
	void setTailleDamier(TailleDamier taille);

}
