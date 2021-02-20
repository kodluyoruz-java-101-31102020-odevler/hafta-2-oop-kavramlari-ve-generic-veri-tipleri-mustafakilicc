package solution4;

public class BusinessAddress implements Address {
	
	private String businessaddres;

	@Override
	public String getAddres() {
		
		return this.businessaddres;
	}

	@Override
	public void setAddres(String addres) {
		this.businessaddres=addres;
		
	}

	
	

}
