package game;

public class SnakeandLadder2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladders program");
		int playerposition = 0;
		System.out.println("player start position is:" + playerposition);
		int die_rolled = (int) (Math.floor(Math.random() * 10) % 6+1);
		System.out.println("the rolled die value is " + die_rolled);
	}

}