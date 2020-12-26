package solution2;

public class Matris <T extends Number> {

	
	public void multiplicationArrs(T[][] arr1,T[][] arr2) {
		int  rows =arr1.length;
		int columns=arr2[0].length;
		
		Object[][] resultArr=new Object[rows][columns];
		
		for(int i=0;i<rows;i++) {
			//T sum=(T) 1;
			for(int j=0;j<rows;j++) {
				T mult= (T) arr1[i][j]*arr1[j][i];
				
			}
		}
		
	}
	
	

}
