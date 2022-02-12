
public class PrOrNot {



	public static void main(String[] args) {
		
		boolean isPrholder=true;
		
		int totalNoOfDaysInCanada = 1000;
		
		/*
		 * In below line, we are checking two conditions 
		 * condition1 : isPrholder 
		 * condition2 : totalNoOfDaysInCanada>1000
		 */
		if(isPrholder && totalNoOfDaysInCanada>=1000) {
			System.out.println("Eligible for citizenship");
		}else {
			System.out.println("Not eligible for citizenship");
		}

	}

}

