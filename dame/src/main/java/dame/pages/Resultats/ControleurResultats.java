package dame.pages.Resultats;

import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;

public class   ControleurResultats  extends ControleurModeleVue<ResultatsLectureSeule, Resultats, VueResultats, AfficheurResultats> {

	@Override
	protected void demarrer() {
		J.appel(this);		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);		
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

