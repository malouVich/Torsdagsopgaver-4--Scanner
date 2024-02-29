import java.util.Scanner;

class Main{
	
	public static void main(String [] args){

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please type your name");
		String name = userInput.nextLine();
		
        System.out.println("Hello, " + name + "! Please type your age:");
        
        
        int age = userInput.nextInt();
        
        
        System.out.println("You entered: " + age);
        
       
        int yearsUntilRetirement = 67 - age;
        System.out.println("Years until retirement: " + yearsUntilRetirement);
        
        
        userInput.close();


	}
}