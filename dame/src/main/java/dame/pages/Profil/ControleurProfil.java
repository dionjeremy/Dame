package dame.pages.Profil;

import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;

public class ControleurProfil extends ControleurModeleVue<ProfilLectureSeule,Profil,VueProfil,AfficheurProfil> {

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
