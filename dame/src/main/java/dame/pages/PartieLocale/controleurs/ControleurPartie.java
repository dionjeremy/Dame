

package dame.pages.PartieLocale.controleurs;

import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;
import ntro.mvc.controleurs.RecepteurCommandeMVC;
import dame.commandes.jouer_ici.JouerIci;
import dame.commandes.jouer_ici.JouerIciRecue;
import dame.pages.PartieLocale.afficheurs.AfficheurPartie;
import dame.pages.PartieLocale.modeles.Partie;
import dame.pages.PartieLocale.modeles.PartieLectureSeule;
import dame.pages.PartieLocale.vues.VuePartie;

public abstract class  ControleurPartie<PLS extends PartieLectureSeule, 
							    P extends Partie<PLS>,
                                V extends VuePartie, 
                                A extends AfficheurPartie<PLS, V>>

	            extends ControleurModeleVue<PLS, P, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);
	}

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(JouerIci.class, new RecepteurCommandeMVC<JouerIciRecue>() {
			
			@Override
			public void executerCommandeMVC(JouerIciRecue commande) {
				J.appel(this);
				
				reagirCommandeJouerIci(commande);
			}
			
			
		});
		
		
	} 
	
	
	protected void reagirCommandeJouerIci(JouerIciRecue jouerIciRecue) {
		J.appel(this);

			getModele().jouerIci(jouerIciRecue.getIndiceColonne(), jouerIciRecue.getIndiceLigne());
	}
	
}




















