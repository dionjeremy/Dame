package commandes.profil;

import ntro.commandes.Commande;
import ntro.debogage.J;

public class ChoisirProfil  extends Commande<ChoisirProfilPourEnvoi,ChoisirProfilRecue>implements ChoisirProfilPourEnvoi,ChoisirProfilRecue{

	private int age;
	private int statistique;
	private String nom;
	private String description;
	private String avatar;
	
	@Override
	public String getNom() {
		J.appel(this);
		return nom;
	}

	@Override
	public String getDescription() {
		J.appel(this);
		return description;
	}

	@Override
	public String getAvatar() {
		J.appel(this);
		return avatar;
	}

	@Override
	public int getStatistique() {
		J.appel(this);
		return statistique;
	}

	@Override
	public int getAge() {
		J.appel(this);
		return age;
	}

	@Override
	public void setNom(String nom) {
		J.appel(this);
		this.nom=nom;
	}

	@Override
	public void setAge(int age) {
		J.appel(this);
		this.age=age;
		
	}

	@Override
	public void setDescription(String description) {
		J.appel(this);
		this.description=description;
		
	}

	@Override
	public void setStatistique(int statistique) {
		J.appel(this);
		this.statistique=statistique;
		
	}

	@Override
	public void setAvatar(String avatar) {
		J.appel(this);
		this.avatar=avatar;
		
	}

}
