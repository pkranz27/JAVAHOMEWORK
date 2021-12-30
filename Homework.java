import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("please enter the correct numbers David!");
		
		Integer code[]= {0};
		ArrayList<Integer>codeRelay = new ArrayList<Integer>(Arrays.asList(code));
		Integer numIndex = codeRelay.size();
		
		
		for(Integer i = 0; i < 5; i++) {
			String sc = input.nextLine();
			numIndex = Integer.parseInt(sc);
			codeRelay.add(numIndex);
			System.out.println("code is:"+ numIndex);
			
		}
		

		
		
			
		
	System.out.println("The five numbers you have selected: " + codeRelay);
		Integer sum = 0; 
		Integer product = 0;
		for(Integer i = 0; i<codeRelay.size() ; i++) {
			sum += codeRelay.get(i);
			
		}

		System.out.println("Your total sum is: " + sum);
		
		System.out.println("\nWhat can i help you with today?");
		Scanner look = new Scanner(System.in);
		Map<String, Integer> cars = new HashMap<String, Integer>();
		String carName = look.nextLine();
		cars.put("Acrua",1994);
		cars.put("Cvic",2002);
		cars.put("Highlander",2020);
		cars.put("Mustang",1969);
		cars.put("SeaBreeze",3202);
		cars.put("BatMobile",1910);
			for(Map.Entry<String, Integer>entry:cars.entrySet()){
				if(carName.equals(cars.get(carName))) {
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}else {
				System.out.println("I see we currently have that it stock" + entry.getKey()+ ":" + entry.getValue());
			};
				
				};
		
		
	}

	
}
