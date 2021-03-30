package dame.commandes.jouer_ici;

import ntro.commandes.CommandePourEnvoi;

public interface JouerIciPourEnvoi extends CommandePourEnvoi {
	
	void setIndiceColonne(int indiceColonne);
	void setIndiceLigne(int indiceLigne);
	
}
