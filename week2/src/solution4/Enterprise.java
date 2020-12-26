package solution4;

import java.util.ArrayList;

public class Enterprise extends Account {

	public Enterprise(User enterpriseUser, ArrayList arrayList) {
		super(enterpriseUser,arrayList);
	}

	@Override
	void addInsurance(Insurance insurance) {
		super.getInsurances().add(insurance);
		
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
