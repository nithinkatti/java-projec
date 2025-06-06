package NEW;
import java.util.*;
public class Arrayy {
		public static void main(String[]args) {
			ArrayList<String> a=new ArrayList<String>();
			a.add("hdbhjbf");
			a.add("hdbfhjbf");		
			a.add("edbhjbf");		
			a.add("hdebhjbf");		
			a.add("hdbhjvbbf");		
			a.add("hdbhdjbf");	
			System.out.println(a);
			System.out.println(a.remove(4));
			System.out.println(a);
			a.set(0,"deekshith");
			System.out.println(a);
			Collections.sort(a);
			System.out.println(a);
		}
	}



