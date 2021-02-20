package solution4;

public class AddressManager {
	
	public static void addAddres(User user, Address addres) {
		user.getAddress().add(addres);
	}
	
	public static void deleteAddres(User user, Address addres) {
		user.getAddress().remove(addres);
	}
	

}
