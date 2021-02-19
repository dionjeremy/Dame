package dame.pages.Profil;



import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Profil extends Modele<ProfilLectureSeule> implements ProfilLectureSeule {

	private String nomJoueur;
	private String descriptionJoueur;
	private int ageJoueur;
	private int statistiqueJoueur;
	private String avatarJoueur;
	
	
	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		
	}

	@Override
	public void apresCreation() {
		J.appel(this);
		
		nomJoueur=this.getNom();
		descriptionJoueur=this.getDescription();
		ageJoueur=this.getAge();
		statistiqueJoueur=this.getStatistique();
		avatarJoueur=this.getAvatar();
	}

	@Override
	public String getAvatar() {
		J.appel(this);
		return avatarJoueur;
	}

	@Override
	public String getNom() {
		J.appel(this);
		return nomJoueur;
	}

	@Override
	public int getAge() {
		J.appel(this);
		return ageJoueur;
	}

	@Override
	public String getDescription() {
		J.appel(this);
		return descriptionJoueur;
	}

	@Override
	public int getStatistique() {
		J.appel(this);
		return statistiqueJoueur;
	}


	public void setNom(String nomJoueur) {
		J.appel(this);
		this.nomJoueur=nomJoueur;
	}
	
	
	public void setAge(int ageJoueur) {
		J.appel(this);
		this.ageJoueur=ageJoueur;
	}
	
	
	public void setDescription(String descriptionJoueur) {
		J.appel(this);
		this.descriptionJoueur=descriptionJoueur;
	}
	
	
	public void setStatistique(int statistiqueJoueur) {
		J.appel(this);
		this.statistiqueJoueur=statistiqueJoueur;
	}
	
	
	public void setAvatar(String avatarJoueur) {
		J.appel(this);
		this.avatarJoueur=avatarJoueur;
	}
	
	
	
	

}
