import java.util.Random;

public class Dice {
	public int rollDice() {
		int random = new Random().nextInt(6);
		return random;
	}
}