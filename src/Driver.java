import java.util.Scanner;

public class Driver {
	public static void main(String [] args)
	{
		Elevator mainElevator = new Elevator();
		ElevatorOperator mac = new ElevatorOperator(mainElevator);
		
		Scanner sc = new Scanner(System.in);
		char input = ' ';
		while(input != 'q' && input != 'Q')
		{
			System.out.println("What floor?");
			System.out.println("B) Basement");
			System.out.println("1) First Floor");
			System.out.println("2) Second Floor");
			System.out.println("Q) Quittin Time");
			String typed = sc.nextLine();
			input = typed.charAt(0);
			if(input == 'b' || input == 'B')
			{
				mac.pressButtonToFloor(0);
			}
			else if(input == '1')
			{
				mac.pressButtonToFloor(1);
			}
			else if(input == '2')
			{
				mac.pressButtonToFloor(2);
			
			}
			else if(input == 'q')
				System.out.println("GoodBye");
		}
			
		System.out.println("Have a nice day!");
	}
} 

