
import java.util.Hashtable;
	import java.util.Enumeration;

	public class hashtable {
	 
	 public static void main(String[] args) {
	 
	   Enumeration names;
	   String key;

	   Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();

	   hashtable.put("Key1","ular");
	   hashtable.put("Key2","sapi");
	   hashtable.put("Key3","abdi");
	   hashtable.put("Key4","anjing");
	   hashtable.put("Key5","monyet");
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 }
	}
