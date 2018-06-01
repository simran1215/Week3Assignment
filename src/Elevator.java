
public class Elevator {
	//elevator keeps track of its current floor
		int currentFloor; //0 means basement
		
		//elevator is created at floor 0 (basement)
		public Elevator()
		{
			currentFloor = 0;
		}
		
		//retrieve whatever floor the elevator is on
		public int getCurrentFloor()
		{
			return currentFloor;
		}
		
		//call elevator to a particular floor
		public void goToFloor(int floorNum)
		{
			//I want to be at floorNum and I'm at currentFloor...
			int direction = 0;
			
			//if my desired floor is above me, going up, else going down
			if(floorNum > currentFloor)
			{
				direction = 1; //going up
			}
			else if(floorNum < currentFloor)
			{
				direction = -1; //going down
			}
			else
			{
				System.out.println("Already on that floor!");
			}
			
			//repeat until we reach the correct floor:
			while(floorNum != currentFloor)
			{
				if(direction == 1)
				{
					System.out.println("Going up!");
				}
				else if(direction == -1)
				{
					System.out.println("Going down!");
				}
				else if(direction == 0)
				{
					System.out.println("Arrived!");
				}
				//add direction to our current floor
				currentFloor = currentFloor + direction;
				System.out.println("Floor " + currentFloor);
			}
			//arrived at desired floor!
			System.out.println("DING!");
		}
	}


