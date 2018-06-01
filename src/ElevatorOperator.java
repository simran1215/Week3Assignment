
public class ElevatorOperator {
	Elevator myElevator;
	
	public ElevatorOperator(Elevator assignedElevator)
	{
		myElevator = assignedElevator;
	}
	
	public void pressButtonToFloor(int floorNum)
	{
		if(myElevator.getCurrentFloor() != floorNum)
		{
			myElevator.goToFloor(floorNum);
		}
		else
		{
			System.out.println("Current Floor");
		}
	}
	
}


