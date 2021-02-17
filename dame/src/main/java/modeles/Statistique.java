package modeles;

public class Statistique implements StatistiqueLectureSeule{

	private int statistique;
	@Override
	public int getStatistique() {
		
		return this.statistique ;
	}

	@Override
	public void setStatistique(int statistique) {
		this.statistique=statistique;
		
	}

	
}
