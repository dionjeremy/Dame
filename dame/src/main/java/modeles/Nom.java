package modeles;

public class Nom implements NomLectureSeule {
	private String nom;

	@Override
	public String getNom() {
		
		return this.nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	
}
