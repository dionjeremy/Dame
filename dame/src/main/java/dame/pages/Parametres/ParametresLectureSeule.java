package dame.pages.Parametres;

import ntro.mvc.modeles.ModeleLectureSeule;
import dame.enumerations.Parametres.Couleur;
import dame.enumerations.Parametres.TailleDamier;

public interface ParametresLectureSeule extends ModeleLectureSeule {
	
	Couleur getCouleurJoueur1();
	TailleDamier getTailleDamier();

}
