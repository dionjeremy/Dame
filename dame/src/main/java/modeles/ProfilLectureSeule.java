package modeles;


import ntro.mvc.modeles.ModeleLectureSeule;

public interface ProfilLectureSeule extends ModeleLectureSeule{
	
	Avatar getAvatar();
	Nom getNom();
	Age getAge();
	Description getDescription();
	Statistique getStatistique();
	
}
