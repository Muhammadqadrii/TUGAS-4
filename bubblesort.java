import java.util.ArrayList;
import java.util.Arrays;

public class bubbleshort {
	public static void main(String[] args) {
	ArrayList<Double> input 	= new ArrayList<Double>();
	Double[] input1 = {11.2 , 43.1 , 67.2 , 18.3 , 55.4 , 12.9 , 92.6 , 34.5};
	
	System.out.println("DATA : "+Arrays.toString(input1));
	System.out.println();
	System.out.println("PROSES BUBBLESORT :");
	System.out.println();
	
	
		bubblesort(input1);
		
	System.out.println("HASIL BUBBLESORT : "+Arrays.toString(input1));
	}

	private static void bubblesort(Double[] input1) {
		ArrayList<Double> input 	= new ArrayList<Double>();
		for(int a = 0; a < input1.length; a++) {
			
			for(int b = 0; b < input1.length-1; b++) {
				if(input1[b] > input1[b+1]) {
					Double temp = input1[b];
					input1[b] = input1[b+1];
					input1[b+1] = temp;
				}
				System.out.println("STEP->"+(a+1)+", MIN = "+input1[b+1]+" SWAP("+(a+1)+","+input1[b+1]+")"+" -> "+Arrays.toString(input1));
			}
			
			System.out.println();
		}
	}
}
