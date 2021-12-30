package CFPR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF_PROJECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		
		System.out.println("please enter your name:");
		String name = input.nextLine();
		System.out.println("\nHello "+ name);
		
		System.out.print("\nWould your like to complete the survey?");
		String yes = input.nextLine();
		String y = "y";
		String x = "yes";
		if(yes.equals(x) || yes.equals(y)) {
			System.out.print("\nSplendid\n");
		}else {
			System.out.print("\n sorry to hear that please feel free to complete at any time");
		}
		String q[] = {"\nname of fav pet", "\nthe first name of the their favorite actor or actress", "Do they have a favorite quarterback?", "Whast his jersey number",
						"What is two-digit model year of their car?", "What is their lucky number?"};
		ArrayList<String>questions= new ArrayList<String>(Arrays.asList(q));
		Scanner a = new Scanner(System.in);
			
		for(String question : questions) {
			System.out.println(questions.get(0));
			String answer1 = a.nextLine();
			questions.set(0, answer1);
			
			System.out.println(questions.get(1));
			String answer2 = a.nextLine();
			questions.set(1, answer2);
			
			System.out.println(questions.get(2));
			String answer3 = a.nextLine();
			questions.set(2, answer3);
			
			System.out.println(questions.get(3));
			Integer answer4 = a.nextInt();
			String a4 = Integer.toString(answer4);
			questions.set(3, a4);
			
			System.out.println(questions.get(4));
			Integer answer5 = a.nextInt();
			String a5 = Integer.toString(answer5);
			questions.set(4, a5);
			
			System.out.println(questions.get(5));
			Integer answer6 = a.nextInt();
			String a6 = Integer.toString(answer6);
			questions.set(5, a6);
			break;
			}
		System.out.println(questions);
	
	}
	

}
