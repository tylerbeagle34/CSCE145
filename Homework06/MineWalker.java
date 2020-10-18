import java.util.Scanner;
import java.util.Random;
public class MineWalker {

	public static final int BOARD_SIZE = 10;
	enum Space{Empty, Mine, Player, Goal}; //Creates a type Space
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPlaying = true;
		//Set Player Position
		int pX = 0;
		int pY = 0;
				
		//Randomly select goal position
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		Scanner keyboard = new Scanner(System.in);
		
		Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
		for(int y = 0; y < board.length; y++)
		{
			for(int x = 0; x < board.length; x++)
			{
				board[y][x] = Space.Empty;
			}
		}
		board[pY][pX] = Space.Player;
		board[gY][gX] = Space.Goal;
		int mines = (BOARD_SIZE * BOARD_SIZE)/10;
		while(mines > 0)
		{
			int mX = r.nextInt(BOARD_SIZE);
			int mY = r.nextInt(BOARD_SIZE);
		    if(board[mY][mX] == Space.Empty)
		    { 
		    		board[mY][mX] = Space.Mine;
		        mines--;
		    }
		}
		System.out.println("Welcome to Mine Walker. Get the ice cream cone and avoid the mines");
		boolean gameOver = false;
		while(gameOver == false) //Game Loop
		{
			//Draw the board
			for(int y = 0; y < board.length; y++)
			{
				for(int x = 0; x < board[y].length; x++)
				{
					switch(board[y][x])
					{
					case Empty:
						System.out.print("_");
						break;
					case Player:
						System.out.print("X");
						break;
					case Mine:
						System.out.print("_");
						break;
					case Goal:
						System.out.print("^");
						break;
					default:
						System.out.print("?");
						break;
					}
				}
				System.out.println();
			} //Outside for loop
			System.out.println("Enter 9 to quit of 1, 0, or -1 to move in the x");
			int dX = keyboard.nextInt();
			if(dX == 9)
			{
				System.out.println("Bye");
				break; // Stop the game loop
			}
			System.out.println("Enter 1, 0, or -1 to move in the y");
			int dY = keyboard.nextInt();
			//Check if entered values are correct
			if(dX < -1 || dX > 1)
			{
				dX = 0;
			}
			if(dY < -1 || dY > 1)
			{
				dY = 0;
			}
			//Make sure still in bounds
			board[pY][pX] = Space.Empty;
			pX += dX;
			pY += dY;
			if(pX < 0)
			{
				pX = 0;
			}
			else if(pX > BOARD_SIZE)
			{
				pX = BOARD_SIZE - 1;
			}
			if(pY < 0)
			{
				pY = 0;
			}
			else if(pY > BOARD_SIZE)
			{
				pY = BOARD_SIZE - 1;
			}
			//See if we won
			if(board[pY][pX] == Space.Goal)
			{
				System.out.println("WIN!");
				gameOver = true;
				System.out.println("Would you like to play again? \"Yes\" or \"No\"");
				Scanner keyboard1 = new Scanner(System.in);
				String answer = keyboard1.nextLine();
				if(answer.equalsIgnoreCase("Yes"))
				{
					//Set Player Position
					pX = 0;
					pY = 0;
					
					//Reset the goal position
					board[gY][gX] = Space.Empty;
					//Randomly select goal position
					gX = r.nextInt(BOARD_SIZE);
					gY = r.nextInt(BOARD_SIZE);
					
					board[pY][pX] = Space.Player;
					board[gY][gX] = Space.Goal;
					
					for(int i = 0; i < BOARD_SIZE; i++) //Set mines back to empty
					{
						for(int j = 0; j < BOARD_SIZE; j++)
						{
							if(board[j][i] == Space.Mine)
							{
								board[j][i] = Space.Empty;
							}
						}
					}
					mines = (BOARD_SIZE * BOARD_SIZE)/10;
					while(mines > 0)
					{
						int mX = r.nextInt(BOARD_SIZE);
						int mY = r.nextInt(BOARD_SIZE);
					    if(board[mY][mX] == Space.Empty)
					    { 
					    		board[mY][mX] = Space.Mine;
					        mines--;
					    }
					}
					System.out.println("Welcome to Mine Walker. Get the ice cream cone and avoid the mines");
					gameOver = false;
				}
				else
				{
					System.out.println("Thanks for playing");
					System.exit(0);
				}
			}
			if(board[pY][pX] == Space.Mine)
			{
				System.out.println("Boom! Dead!");
				gameOver = true;
				System.out.println("Would you like to play again? \"Yes\" or \"No\"");
				Scanner keyboard1 = new Scanner(System.in);
				String answer = keyboard1.nextLine();
				if(answer.equalsIgnoreCase("Yes"))
				{
					//Set Player Position
					pX = 0;
					pY = 0;
					//Reset the goal position
					board[gY][gX] = Space.Empty;
					//Randomly select goal position
					gX = r.nextInt(BOARD_SIZE);
					gY = r.nextInt(BOARD_SIZE);
					
					board[pY][pX] = Space.Player;
					board[gY][gX] = Space.Goal;
					
					for(int i = 0; i < BOARD_SIZE; i++) //Set mines back to empty
					{
						for(int j = 0; j < BOARD_SIZE; j++)
						{
							if(board[j][i] == Space.Mine)
							{
								board[j][i] = Space.Empty;
							}
						}
					}
					mines = (BOARD_SIZE * BOARD_SIZE)/10;
					while(mines > 0)
					{
						int mX = r.nextInt(BOARD_SIZE);
						int mY = r.nextInt(BOARD_SIZE);
					    if(board[mY][mX] == Space.Empty)
					    { 
					    		board[mY][mX] = Space.Mine;
					        mines--;
					    }
					}
					System.out.println("Welcome to Mine Walker. Get the ice cream cone and avoid the mines");
					gameOver = false;
				}
				else
				{
					System.out.println("Thanks for playing");
					System.exit(0);
				}
			}
			board[pY][pX] = Space.Player;
		}
	}
}
