import java.util.ArrayList;
import java.util.Arrays;

public class selectionsort {
	public static void main(String a[]){
		ArrayList<Double> input = new ArrayList<Double>();		
		input.add(500.95);
		input.add(542.03);
		input.add(667.48);
		input.add(499.59);
		input.add(104.95);
		input.add(219.87);
		input.add(769.91);
		input.add(256.89);
		System.out.println("Data :"+input.toString());
		System.out.println("");
 			ArrayList<Double> output = doselectionsort(input);
 		System.out.println("");
 			System.out.println("Hasil Sorting SelectionSort: "+output.toString());
	}
	private static ArrayList<Double> doselectionsort(ArrayList<Double> input) {
		int n	= input.size();
		for(int i=0;i<n-1;i++){			
			int min	= i;
			for(int j=1+i;j<n;j++){
				if(input.get(j)<input.get(min)){
					min = j;
				}}
			if(min != i){
				Double tempinput = input.get(i);
				input.set(i, input.get(min));
				input.set(min, tempinput);
			}
			//CETAK HASIL TIAP LANGKAH dan OPERASI SWAPnya
			System.out.println("langkah ke-"+i+", "+min+" SWAP("+i+" , "+min+")"+" = "+input.toString());
		}
		return input;		
	}}
