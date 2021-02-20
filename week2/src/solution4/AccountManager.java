package solution4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
	private static TreeSet<Account> accounts = new TreeSet<>();

	static {
		User enterpriseUser = new User();
		enterpriseUser.setEmail("selen.demir");
		enterpriseUser.setPassword("1234");
		enterpriseUser.setAddress(new ArrayList<>());
		enterpriseUser.setAge(21);
		enterpriseUser.setName("Selen");
		enterpriseUser.setSurname("Demir");
		enterpriseUser.setJob("student");

		Enterprise enterpriseAccount = new Enterprise(enterpriseUser, new ArrayList<>());

		User individualUser = new User();
		individualUser.setEmail("demir.bakýr");
		individualUser.setPassword("121234");
		individualUser.setAddress(new ArrayList<>());
		individualUser.setAge(11);
		individualUser.setName("demir");
		individualUser.setSurname("bakýr");
		individualUser.setJob("student");
		Individual individualAccount = new Individual(individualUser, new ArrayList<>());

		accounts.add(enterpriseAccount);
		accounts.add(individualAccount);
	}

	public static Account login(String email, String pass) {

		for (Account account : accounts) {

			try {
				System.out.println(account.getUser().getName());
				account.login(email, pass);
				return account;

			} catch (InvalidAuthenticationException e) {
				System.out.println(e);
			}

		}
		return null;
	}

	/*
	 * public static Account login(String email, String password){ for
	 * (Iterator<Account> it = accounts.iterator(); it.hasNext(); ) { Account
	 * account = it.next(); try{ account.login(email,password); return account; }
	 * catch (InvalidAuthenticationException e){
	 * 
	 * }
	 * 
	 * 
	 * } return null;
	 * 
	 * }
	 */

}
