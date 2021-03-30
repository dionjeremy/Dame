package dame.commandes.profil;

import ntro.commandes.CommandeRecue;

public interface ChoisirProfilRecue extends CommandeRecue {
	String getNom();
	String getDescription();
	String getAvatar();
	int getStatistique();
	int getAge();
	
}
