
public class Ternary3 {
	 
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        int c = 30;
	 
	        String result = a > b ? a > c ? "a is greatest" : "c is greatest" : b > c ? "b is greatest" : "c is greatest";
	        System.out.println(result);
	    }
	 
	}
