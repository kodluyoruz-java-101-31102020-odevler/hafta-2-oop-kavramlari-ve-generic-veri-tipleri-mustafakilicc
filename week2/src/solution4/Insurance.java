package solution4;

import java.util.Date;

public abstract class Insurance {
	
	String insuranceName;
	private double insurancePrice;
    private Date startDate;
    private Date endDate;

    abstract double calculate(int cost);

}
