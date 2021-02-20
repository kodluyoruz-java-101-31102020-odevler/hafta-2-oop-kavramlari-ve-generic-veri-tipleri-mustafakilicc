package solution4;

public class Solution4 {
   
	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("email address: "); String email = scanner.next();
		 * System.out.println("password: "); String password = scanner.next();
		 */
        Account account = AccountManager.login("demir.bakýr", "121234");
        if(account == null){
            System.out.println("User not found!");
            return;
        }
        System.out.println(account.getUser());





    }
	
}
