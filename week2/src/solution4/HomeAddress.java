package solution4;

public class HomeAddress implements Address {
	
	private String homeaddres;

	@Override
	public String getAddres() {
		
		return this.homeaddres;
	}

	@Override
	public void setAddres(String addres) {
		this.homeaddres=addres;
		
	}

}
