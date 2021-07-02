package game;

import java.util.Scanner;

public class SnakeandLadder {
	public static final int WinningPosition = 100;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first player name : ");
		String player1 = s.next();
		System.out.print("Enter second player name : ");
		String player2 = s.next();
		int player1Pos = 0;
		int player2Pos = 0;

		while (player1Pos <= WinningPosition && player2Pos <= WinningPosition) {
			if (player1Pos == WinningPosition) {
				System.out.println(player1 + " is winner");
				break;
			} else if (player2Pos == WinningPosition) {
				System.out.println(player2 + " is winner");
				break;
			} else {
				player1Pos = player1(player1Pos, player1);
				player2Pos = player2(player2Pos, player2);
			}
		}
	}

	private static int player1(int player1Position, String player1Name) {
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		int RemainingPosition = WinningPosition - player1Position;
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		if (RemainingPosition >= die) {
			switch (option) {
			case 0:
				break;
			case 1:
				player1Position += die;
				if (player1Position == WinningPosition)
					break;
				else
					player1(player1Position, player1Name);
				break;
			default:
				player1Position -= die;
				if (player1Position < 0)
					player1Position = 0;
			}
			System.out.println(player1Name + " position: " + player1Position);
		}
		return player1Position;
	}

	private static int player2(int player2Position, String player2Name) {
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		int RemainingPosition = WinningPosition - player2Position;
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		if (RemainingPosition >= die) {
			switch (option) {
			case 0:
				break;
			case 1:
				player2Position += die;
				if (player2Position == WinningPosition)
					break;
				else
					player2(player2Position, player2Name);
				break;
			default:
				player2Position -= die;
				if (player2Position < 0)
					player2Position = 0;
			}
		}
		System.out.println(player2Name + " position: " + player2Position);
		return player2Position;
	}

}