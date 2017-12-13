package problem11;
import java.util.Scanner;
public class Airplane {
	int r = 7;
	int c = 4;
	Scanner kbd=new Scanner(System.in);
	// enum column {
	// A, B, C, D
	// };
	public void schedule() {
		this.output();
		cnt:
			while(this.seatsLeft()>0) {
				System.out.println("Which seat do you want?");
				int row=kbd.nextInt();
				String clmn=kbd.next();
				this.book(row-1, clmn);
				this.output();
				System.out.println("Continue? Y/N");
				String response=kbd.next();
				while(!response.equalsIgnoreCase("y")&&!response.equalsIgnoreCase("n")) {
					System.out.println("Invalaid response, please try again");
					System.out.println("Continue? Y/N");
					response=kbd.next();
				}
				if(response.equalsIgnoreCase("n"))break cnt;
			}System.exit(0);
	}
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
