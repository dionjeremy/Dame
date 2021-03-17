package commandes.profil;

import ntro.commandes.CommandePourEnvoi;

public interface ChoisirProfilPourEnvoi extends CommandePourEnvoi {
	void setNom(String nom);
	void setAge(int age);
	void setDescription(String descritpion);
	void setStatistique(int statistique);
	void setAvatar(String avatar);
}
