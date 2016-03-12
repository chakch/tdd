package tdd.test;

public class TicTacToe {
	private Character[][] board = {{'\0', '\0', '\0'},
			{'\0', '\0', '\0'},
			{'\0', '\0', '\0'}};
	private String nextPlayer = "O";
	public String play(int x, int y) {
		if (x < 1 || x > 3) {
			throw
			new RuntimeException("X is outside board");
		} else if (y < 1 || y > 3) {
			throw
			new RuntimeException("Y is outside board");
		}
		if (board[x - 1][y - 1] != '\0') {
			throw
			new RuntimeException("Box is occupied");
		} else {
			board[x - 1][y - 1] = 'X';
		}
		nextPlayer = nextPlayer();
		return "No winner";
	}
	public String nextPlayer() {
		if (nextPlayer.equals("X")){
			return "O";
		}else {
			return "X";
		}
		
	}

}
