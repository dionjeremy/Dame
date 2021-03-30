package dame.pages.Resultats;

import ntro.mvc.modeles.ModeleLectureSeule;

public interface ResultatsLectureSeule extends ModeleLectureSeule{
	String getNom();
	String getResults();
	int getNbMove();
	int getScorePartie();
	int getScoreTotal();
	

}
