package modeles;



import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Profil extends Modele<ProfilLectureSeule> implements ProfilLectureSeule {

	private Nom nomJoueur;
	private Description descriptionJoueur;
	private Age ageJoueur;
	private Statistique statistiqueJoueur;
	private Avatar avatarJoueur;
	
	
	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(nomJoueur);
		DoitEtre.nonNul(descriptionJoueur);
		DoitEtre.nonNul(ageJoueur);
		DoitEtre.nonNul(statistiqueJoueur);
		DoitEtre.nonNul(avatarJoueur);
	}

	@Override
	public void apresCreation() {
		J.appel(this);
		
		
		
	}

	@Override
	public Avatar getAvatar() {
		J.appel(this);
		return avatarJoueur;
	}

	@Override
	public Nom getNom() {
		J.appel(this);
		return nomJoueur;
	}

	@Override
	public Age getAge() {
		J.appel(this);
		return ageJoueur;
	}

	@Override
	public Description getDescription() {
		J.appel(this);
		return descriptionJoueur;
	}

	@Override
	public Statistique getStatistique() {
		J.appel(this);
		return statistiqueJoueur;
	}


	public void setNom(Nom nomJoueur) {
		J.appel(this);
		this.nomJoueur=nomJoueur;
	}
	public void setAge(Age ageJoueur) {
		J.appel(this);
		this.ageJoueur=ageJoueur;
	}
	public void setDescription(Description descriptionJoueur) {
		J.appel(this);
		this.descriptionJoueur=descriptionJoueur;
	}
	public void setStatistique(Statistique statistiqueJoueur) {
		J.appel(this);
		this.statistiqueJoueur=statistiqueJoueur;
	}
	public void setAvatar(Avatar avatarJoueur) {
		J.appel(this);
		this.avatarJoueur=avatarJoueur;
	}
	
	
	
	

}
