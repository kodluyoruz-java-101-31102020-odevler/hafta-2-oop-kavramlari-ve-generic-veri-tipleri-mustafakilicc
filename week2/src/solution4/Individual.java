package solution4;

import java.util.ArrayList;

public class Individual extends Account {

	public Individual(User individualUser, ArrayList arrayList) {
		super(individualUser, arrayList);	}

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
