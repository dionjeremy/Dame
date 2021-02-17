package modeles;

public class Description implements DescriptionLectureSeule{
	 
	private String description;

	@Override
	public String getDescription() {
		
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description=description;
	}
	
	
}
