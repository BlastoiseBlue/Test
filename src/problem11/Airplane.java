package problem11;

public class Airplane {
	int r = 7;
	int c = 4;

	// enum column {
	// A, B, C, D
	// };

	char[][] seats = new char[r][c];
	{
		for (int i = 0; i < r; i++) {
			seats[i][0] = 'A';
			seats[i][1] = 'B';
			seats[i][2] = 'C';
			seats[i][3] = 'D';
		}
	}

	boolean[][] taken = new boolean[r][c];
	{
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				taken[i][j] = false;
			}
		}
	}

	public void output() {
		for (int i = 0; i < this.r; i++) {
			System.out.print(i + 1 + "	");
			for (int j = 0; j < this.c; j++) {
				if (!taken[i][j])
					System.out.print(seats[i][j] + "	");
				else
					System.out.print('X' + "	");
			}
			System.out.println();
		}
	}

	public void book(int row, String col) {
		int column = 0;
		switch (col.toUpperCase()) {
		case "A":
			column = 0;
			break;
		case "B":
			column = 1;
			break;
		case "C":
			column = 2;
			break;
		case "D":
			column = 3;
			break;
		default:
			System.out.println("INVALAID");
			break;
		}
		if (!taken[row][column]) {
			seats[row][column] = 'X';
			taken[row][column] = true;
		} else
			System.out.println("That seat is already taken.");
	}

	public int seatsLeft() {
		int left = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (!taken[i][j])
					left++;
			}
		}
		return left;
	}

	Airplane() {
		r = 7;
		c = 4;
	}

	Airplane(int inputRows) {
		r = inputRows;
		c = 4;
	}
}
