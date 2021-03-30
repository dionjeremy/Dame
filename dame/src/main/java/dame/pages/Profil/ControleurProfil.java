package dame.pages.Profil;

import dame.commandes.profil.ChoisirProfil;
import dame.commandes.profil.ChoisirProfilPourEnvoi;
import dame.commandes.profil.ChoisirProfilRecue;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;
import ntro.mvc.controleurs.RecepteurCommandeMVC;
import ntro.mvc.modeles.EntrepotDeModeles;

public class ControleurProfil extends ControleurModeleVue<ProfilLectureSeule,Profil,VueProfil,AfficheurProfil> {

	
	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(ChoisirProfil.class, new RecepteurCommandeMVC<ChoisirProfilRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirProfilRecue commande) {
				J.appel(this);
				
				
				String nom =commande.getNom();
				String description=commande.getDescription();
				String avatar=commande.getAvatar();
				int statistique=commande.getStatistique();
				int age=commande.getAge();
				
				
				
				DoitEtre.nonNul(nom);
				DoitEtre.nonNul(description);
				DoitEtre.nonNul(avatar);
				DoitEtre.nonNul(statistique);
				DoitEtre.nonNul(age);
				
				getModele().setNom(nom);
				getModele().setDescription(description);
				getModele().setAvatar(avatar);
				getModele().setStatistique(statistique);
				getModele().setAge(age);
				
				
				
			}

			
		});
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
		
	}

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);
		
	}

}
