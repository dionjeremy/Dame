package dame.pages.Resultats;

import ntro.debogage.J;
import ntro.mvc.Afficheur;

public class  AfficheurResultats extends Afficheur<ResultatsLectureSeule, VueResultats> {

	@Override
	public void initialiserAffichage(ResultatsLectureSeule modeleLectureSeule, VueResultats vue) {
		J.appel(this);
		
	}

	@Override
	public void rafraichirAffichage(ResultatsLectureSeule modeleLectureSeule, VueResultats vue) {
		J.appel(this);
		vue.rafraichirligne(modeleLectureSeule.getNom(), modeleLectureSeule.getResults(), 
				modeleLectureSeule.getNbMove(), modeleLectureSeule.getScorePartie(), modeleLectureSeule.getScoreTotal());
	} 
	
}

