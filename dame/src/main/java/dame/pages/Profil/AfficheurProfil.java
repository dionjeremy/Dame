package dame.pages.Profil;

import ntro.debogage.J;
import ntro.mvc.Afficheur;

public class AfficheurProfil extends Afficheur<ProfilLectureSeule, VueProfil>{

	@Override
	public void initialiserAffichage(ProfilLectureSeule modeleLectureSeule, VueProfil vue) {
		J.appel(this);
		
	}

	@Override
	public void rafraichirAffichage(ProfilLectureSeule modeleLectureSeule, VueProfil vue) {
		J.appel(this);
		
		vue.afficherNom(modeleLectureSeule.getNom());
		vue.afficherAvatar(modeleLectureSeule.getAvatar());
		vue.afficherAge(modeleLectureSeule.getAge());
		vue.afficherStatistique(modeleLectureSeule.getStatistique());
		vue.afficherDescription(modeleLectureSeule.getDescription());
		
	}

}
