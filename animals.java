import java.util.Scanner;
public class animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 ="cow";
		String word2 ="Unknown";
				
		System.out.println("MOOOOOO");
		Scanner input = new Scanner(System.in);
		System.out.println("What animal is this?");
		String firstName= input.nextLine();
		if(firstName.equals (word1) ) {
			System.out.println("You're utterly correct");
		}else {
			System.out.println("Sorry you're stupid");
		}
	}

}
