package lesson2;

public class ClassLesson2 {

	public static void main(String[] args) {
		//if statement
		int value = -5;
		if(value>0) {
			System.out.println("The value is above zero");
		}
		System.out.println("Continue with the rest of program");
		
		//if else
		int number = -9;
		if(number>-1) {
			System.out.println("The number is positive");
		}else {
			System.out.println("The number is negative");
		}
		
		//switch statement
		String planet = "Zelda";
		switch(planet){
		case "Earth":
			System.out.println("You are within our solar system");
			break;
		
		case "Mars":
			System.out.println("You are within our solar system");
			
		default:
			System.out.println("You are in outer space");

		}
		
		System.out.println("\nLOOPS BEGIN HERE");
		
		//for loop
		for(int i=1;i<=5;i++) { // i++ == i=i+1
			System.out.println(i);
		}
		
		System.out.println("\nWHILE LOOP");
		//while loop
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\nDO WHILE");
		//do while
		int j =1;
		do {
			System.out.println(j);
			j++;
		}while(j<=5);
		
		
	}

}
