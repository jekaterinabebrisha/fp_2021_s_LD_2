import java.util.Scanner;

public class DigitSum_191RDB059 {
	public static void main(String[] args) {
		System.out.println("1. variants Jekaterina Bebrisa 191RDB059\n");
		
		Scanner sc=new Scanner(System.in);
		int  n=0;
		System.out.println("Enter an integer:");
		    if (sc.hasNextInt()) {
		    n=sc.nextInt();
		    System.out.println(n + " superDigit is " + superDigit(n));
		    }
		    else {
		    	System.out.println("input-output error!");
		    }
		    sc.close(); 
}
	
	static long superDigit(long n){
		 if (String.valueOf(n).length() == 1) {
	            return n;
	        }
	        n = String.valueOf(n).chars().reduce(0, (sum, i) -> sum + Character.getNumericValue(i));
	        return superDigit(n);
	  }
	}


