package dame.pages.Parametres;

import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;
import ntro.mvc.controleurs.RecepteurCommandeMVC;
import dame.commandes.choisir_taille_damier.ChoisirTailleDamier;
import dame.commandes.choisir_taille_damier.ChoisirTailleDamierRecue;
import dame.enumerations.Parametres.TailleDamier;
import dame.commandes.choisir_qui_commence.ChoisirQuiCommence;
import dame.commandes.choisir_qui_commence.ChoisirQuiCommenceRecue;
import dame.enumerations.Parametres.Couleur;


public class ControleurParametres extends ControleurModeleVue<ParametresLectureSeule, Parametres, VueParametres, AfficheurParametres> {

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(ChoisirQuiCommence.class, new RecepteurCommandeMVC<ChoisirQuiCommenceRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirQuiCommenceRecue commande) {
				J.appel(this);
				
				Couleur quiCommence = commande.getCouleur();

				DoitEtre.nonNul(quiCommence);

				getModele().choisirQuiCommence(quiCommence);
			}
		});
		installerRecepteurCommande(ChoisirTailleDamier.class, new RecepteurCommandeMVC<ChoisirTailleDamierRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirTailleDamierRecue commande) {
				J.appel(this);
				
				TailleDamier tailleDamier = commande.getTailleDamier();
				
				DoitEtre.nonNul(tailleDamier);
				
				getModele().choisirTailleDamier(tailleDamier);
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
