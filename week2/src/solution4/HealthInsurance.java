package solution4;

public class HealthInsurance extends Insurance{

	@Override
	double calculate(int cost) {
		
		return cost*0.1;
	}

}
