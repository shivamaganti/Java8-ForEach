package ForEach;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		
		al.forEach(pr -> System.out.println(pr));
		
	}
}
