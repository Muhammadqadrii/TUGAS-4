import java.util.ArrayList;
import java.util.Arrays;


public class Insertionsort {
	public static void main(String[] args) {
		ArrayList<Double> input 	= new ArrayList<Double>();
		Double[] bilangan = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7 };
		System.out.println("DATA : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("PROSES INSERTIONSORT :");
		System.out.println();
		insertionsort(bilangan);
		
		System.out.println();
		System.out.println("HASIL INSERTIONSORT : "+Arrays.toString(bilangan));
			
		}

	private static void insertionsort(Double[] bilangan) {
		ArrayList<Double> input 	= new ArrayList<Double>();
		for(int a = 0; a < bilangan.length; a++) {
			System.out.print("STEP-"+(a+1)+"--> ");
			Double key = bilangan[a];
			int c = a-1;
			while (c>=0 && bilangan[c] >key) {
				bilangan[c+1] = bilangan[c];
				c = c-1;
			}
			bilangan[c+1] = key;	
			System.out.println(Arrays.toString(bilangan));
			} 
	}
}	   
