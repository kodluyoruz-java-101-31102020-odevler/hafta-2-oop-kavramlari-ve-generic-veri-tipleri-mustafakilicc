package solution4;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Comparable<Account>{

	private User user;
	private List<Insurance> insurances;
	private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

	public Account(User user, ArrayList arrayList) {
		this.user = user;
        this.insurances = arrayList;
	}

	final public void showUserInfo() {
		System.out.println(user.toString());
	}

	public void login(String email, String pass) {

		if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
			authenticationStatus = AuthenticationStatus.SUCCESS;

		} else {

			throw new InvalidAuthenticationException("Authentication Failed!");

		}

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}

	public void addAddres(Address addres) {

		AddressManager.addAddres(user, addres);
	}

	public void deleteAddres(Address addres) {

		AddressManager.deleteAddres(user, addres);
	}
	
	public boolean isLogined() {
		return authenticationStatus.equals(AuthenticationStatus.SUCCESS);
	}
	
	abstract void addInsurance(Insurance insurance);
	
}
