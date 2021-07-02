package game;

public class SnakeandLadder {

	public static void main(String[] args) {
		int player_position = 0;
		int Winning_Position = 100;
		System.out.println("Welcome to Snake and Ladders program");
		while (Winning_Position > player_position) {
			int die_rolled = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("The rolled die value is:" + die_rolled);
			int Remaining_Position = Winning_Position - player_position;
			int option = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("Selected option is:" + option);
			if (Remaining_Position >= die_rolled) {
				switch (option) {
				case 0:
					System.out.println("No play");
					player_position += 0;
					break;
				case 1:
					System.out.println("Ladder");
					player_position += die_rolled;
					break;
				default:
					System.out.println("Snake");
					player_position -= die_rolled;
					if (player_position < 0)
						player_position = 0;
				}
			}
		}
		System.out.println("player position is:" + player_position);
	}
}
