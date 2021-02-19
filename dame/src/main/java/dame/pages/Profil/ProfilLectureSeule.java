package dame.pages.Profil;


import ntro.mvc.modeles.ModeleLectureSeule;

public interface ProfilLectureSeule extends ModeleLectureSeule{
	
	String getAvatar();
	String getNom();
	int getAge();
	String getDescription();
	int getStatistique();
	
}
