import java.util.ArrayList;
import java.util.Scanner;

public class StringArray {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		String answer;
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("kacsa");
		obj.add("kutya");
		
		do {
		
		System.out.println("Welcome to the Unbeleivable String ArrayList Simulator 2017!");
		System.out.println("Please enter one of these magical words:");
		System.out.println("'List', to view the current roster!");
		System.out.println("'Add', to add a new unimaginable object!");
		System.out.println("'Remove', to remove an object, duh!");
		System.out.println("'Search' for a first-letter search!");
		System.out.println("And don't forget, it's CaSe SeNsItIvE!");
		
		in = new Scanner(System.in);
		String n = in.next();
		
		switch(n) {
		case "List":
			System.out.println("Current list of fluffies: " + obj);
			break;
		case "Add":
			System.out.println("Enter a happy new animal: ");
			in = new Scanner(System.in);
			String b = in.next();
			if (obj.contains(b)) {
				System.out.println("Already in the list silly!");
				obj.remove(b);
			} else {
				obj.add(b);
				System.out.println("Current list of fluffies after add: " + obj); }
			break;
		case "Remove":
			System.out.println("Current list of fluffies: " + obj);
			System.out.println("Choose which sad animal to remove: ");
			in = new Scanner(System.in);
			String c = in.next();
			if (!obj.contains(c)) {
				System.out.println(c + " is not in the list :(");
			} else {
				obj.remove(c);
				System.out.println("Current list of fluffies after remove: " + obj); }
			break;
		case "Search":
			System.out.println("Enter the first letter to search: ");
			in = new Scanner(System.in);
			String d = in.next();
			String start = d;
			obj.stream()
				.filter(x -> x.startsWith(start))
				.forEach(System.out::println);
			break;
			
		}
		
		System.out.println("Continue this magnificent game? Yes or No is enough to answer!");
		in = new Scanner(System.in);
		answer = in.next();
		
	} while (answer.equals("Yes"));
		
	}

}
