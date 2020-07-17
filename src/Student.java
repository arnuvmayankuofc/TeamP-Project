
public class Student {
	private int playerNumber;
	private double playerMoney;
	private int playerPosition = 0;
	private Course[] coursesOwned;
	private boolean ownsFacultyOne = false;
	private boolean ownsFacultyTwo = false;
	private boolean ownsFacultyThree = false;
	private boolean ownsFacultyFour = false;
	
	public Student() {
		
	}
	public Student(int playerNumber, double playerMoney)
	{
		if (playerNumber > 0 && playerNumber < 5) {	
			this.playerNumber = playerNumber;
		}
		if (playerMoney > 0) {
			this.playerMoney = playerMoney;
		}
	}
}
