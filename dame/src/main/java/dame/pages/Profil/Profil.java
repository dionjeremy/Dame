package dame.pages.Profil;



import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Profil extends Modele<ProfilLectureSeule> implements ProfilLectureSeule {

	private String nom;
	private String description;
	private int age;
	private int statistique;
	private String avatar;
	
	
	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(nom);
		DoitEtre.nonNul(description);
		DoitEtre.nonNul(age);
		DoitEtre.nonNul(statistique);
		DoitEtre.nonNul(avatar);
	}

	@Override
	public void apresCreation() {
		J.appel(this);
		
		nom="joueur";
		description="etudiant";
		age=20;
		statistique=1;
		avatar="photo";
	}

	@Override
	public String getAvatar() {
		J.appel(this);
		return avatar;
	}

	@Override
	public String getNom() {
		J.appel(this);
		return nom;
	}

	@Override
	public int getAge() {
		J.appel(this);
		return age;
	}

	@Override
	public String getDescription() {
		J.appel(this);
		return description;
	}

	@Override
	public int getStatistique() {
		J.appel(this);
		return statistique;
	}


	public void setNom(String nomJoueur) {
		J.appel(this);
		this.nom=nomJoueur;
	}
	
	
	public void setAge(int ageJoueur) {
		J.appel(this);
		this.age=ageJoueur;
	}
	
	
	public void setDescription(String descriptionJoueur) {
		J.appel(this);
		this.description=descriptionJoueur;
	}
	
	
	public void setStatistique(int statistiqueJoueur) {
		J.appel(this);
		this.statistique=statistiqueJoueur;
	}
	
	
	public void setAvatar(String avatarJoueur) {
		J.appel(this);
		this.avatar=avatarJoueur;
	}
	
	
	
	

}
