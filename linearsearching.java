import java.util.Scanner;

public class linearsearching1 {

	public static void main(String[] args) {
		  int c, n, search, array[];
		  
		    Scanner in = new Scanner(System.in);
		    System.out.print("MASUKKAN BANYAKNYA ANGKA :");
		    n = in.nextInt();
		    array = new int[n];
		 
		    System.out.println("MASUKKAN " + n + " ANGKA : ");
		 
		    for (c = 0; c < n; c++)
		      array[c] = in.nextInt();
		 
		    System.out.print("ANGKA YANG DICARI : ");
		    search = in.nextInt();
		   
		    for (c = 0; c < n; c++)
		    {
		      if (array[c] == search)     
		      {
		         System.out.println(search + " ANGKA YANG DICARI :  " + (c + 1) + ".");
		          break;
		      }
		   }
		   if (c == n)  
		      System.out.println(search + " tidak ada data.");
		  }
	}
