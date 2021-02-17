package modeles;

public class Avatar implements AvatarLectureSeule{

	private String avatar;
	
	

	@Override
	public void setAvatar(String avatar) {
		this.avatar=avatar;
		
	}



	@Override
	public String getAvatar() {
	
		return avatar;
	}
}
