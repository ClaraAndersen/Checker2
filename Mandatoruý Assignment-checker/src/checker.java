import java.util.Scanner;

public class checker {
	
	
	// Atli
	// Atli made this comment, alone !!!
	// Game function.
	public static void game() {
		int rows = 10;
		int columns =10;
		//creating empty board
		String[][] matrix = new String[rows][columns];
		String player="1";

		// Initialize board
		initiBoard(matrix,rows,columns);
		// Print board
		printBoard(matrix,rows,columns);
		
		//runs the game
		while(true) {
		// moves the players
		move(matrix,rows,columns,player);
		//switch player
		player = chagingPlayer(player);
		//show board
		printBoard(matrix,rows,columns);
		}
		}
	
	//initial placement of players
	public static void initiBoard(String [][]matrix, int rows, int columns) {
		int i,j; // i = row and j = column
		for(i=0 ; i<rows ; i++) {
			for(j=0 ; j < columns; j++) {
				//Add boarders
				if (j==0||j==9) {matrix[i][j] = "|";}
				if (i==0||i==9) {matrix[i][j] ="_";}
				// Starting positions for Player 1's pieces.
				else if (i%2!=0 && i<=3 && j%2==0 && j<=8 && 2<=j) {matrix[i][j]="1";}
				else if (i%2==0 && i<=3 && j%2!=0 && j<=8 && 1<=j) {matrix[i][j]="1";}
				// Starting positions for Player 2's pieces.
				else if (i%2!=0 && 6<=i && j%2==0 && j<=8 && 2<=j) {matrix[i][j]="2";}
				else if (i%2==0 && 6<=i && j%2!=0 && j<=8 && 1<=j) {matrix[i][j]="2";}				
				// Replace all null with empty String
				else if (matrix[i][j] == null) { 
	            matrix[i][j] = " ";}
			}
		}
	}
	
	//displaying board
	public static void printBoard(String [][]matrix, int rows, int columns) {
		//first loop goes through rows second through columns.
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j < columns; j++) {
		System.out.print(matrix[i][j]+" ");
		}
			System.out.println("");	}
		}
	
	//control moves
	public static void move(String [][]matrix, int rows, int columns,String player) {
		//initializing inputs
		int xold_input;
		int yold_input;
		int ynew_input;
		int xnew_input;		 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Turn of player no. "+ player);
		//testing for legal moves
		while(true) {
			
			//Choosing move 
			while (true){
				//Choosing which piece to move 
				System.out.println("Coordinate of piece to move");
				System.out.println("Enter X: ");
				xold_input = s.nextInt();
				System.out.println("Enter Y: ");
				yold_input = s.nextInt();
				System.out.println("");
				
				//Check if the player is trying to move his/her own piece 
				if(matrix[yold_input][xold_input]==player) 
					{break;} 
				else 
					{System.out.println("You can only move you own pieces.");
					System.out.println("");}}
			 	
			//Choosing where to move the piece 
			  	System.out.println("");
			  	System.out.println("Coordinate of new position");
			  	System.out.println("Enter X: ");
			  	xnew_input = s.nextInt();
			  	System.out.println("Enter Y: ");
			  	ynew_input = s.nextInt();
			
			  	//checking if it is a legal move
			  	if (matrix[ynew_input][xnew_input]==" "
			  		//testing if move is diagonal
			  		&& ((xold_input%2==0 && xnew_input%2!=0)||(xnew_input%2==0 && xold_input%2!=0))
					//testing if move is forward
			  		&& ((player=="1" && ynew_input==yold_input+1)||(player=="2" && ynew_input==yold_input-1))
					// and within the board
			  		&& xnew_input<9 && 0< xnew_input && ynew_input<9 && 0<ynew_input ) 
			  			{System.out.println("Piece moved!");
			  			break;}
			  	
			  	//player 1 left jump
			  	else if (matrix[ynew_input][xnew_input]==" " && player=="1"
			  			//testing if move is diagonal to the left and forward
			  			&& xnew_input==xold_input-2 && ynew_input==yold_input+2
			  			//testing if jump is over the opponents player
			  			&& matrix [yold_input+1] [xold_input-1]=="2")
			  		{matrix [yold_input+1] [xold_input-1]=" ";
			  		System.out.println("you jumped!");
			  		break;}
			  	
			  //player 1 right jump
			  	else if (matrix[ynew_input][xnew_input]==" " && player=="1"
			  		//testing if move is diagonal to the right and forward
			  			&& xnew_input==xold_input+2 && ynew_input==yold_input+2
			  			//testing if jump is over the opponents player
			  			&& matrix [yold_input+1] [xold_input+1]=="2")
			  		{matrix [yold_input+1] [xold_input+1]=" ";
			  		System.out.println("you jumped!");
			  		break;}
			  	
			  //player 2 left jump
			  	else if (matrix[ynew_input][xnew_input]==" " && player=="2"
			  			&& xnew_input==xold_input-2 && ynew_input==yold_input-2
			  			&& matrix [yold_input-1] [xold_input-1]=="1")
			  	{matrix [yold_input-1] [xold_input-1]=" ";
			  	System.out.println("you jumped!");
			  	break;}
			  	
			  //player 2 right jump
			  	else if (matrix[ynew_input][xnew_input]==" " && player=="2"
			  			&& xnew_input==xold_input+2 && ynew_input==yold_input-2
			  			&& matrix [yold_input-1] [xold_input+1]=="1")
			  	{matrix [yold_input-1] [xold_input+1]=" ";
			  	System.out.println("you jumped!");
			  	break;}
			  	
			  else {
				  System.out.println("This is not a legal move, please enter a new move.");
				  System.out.println("");
				  }
			  	}
		
	
		//Moving the pieces
		matrix[yold_input][xold_input]=" ";
		matrix[ynew_input][xnew_input]=player;
		}
	
	//Switching between players
	public static String chagingPlayer(String player) {
		if (player=="2") {player="1";}
		else player="2";
		return player;
	}
	
	//main-runs the game.
	public static void main(String[] args) {
		game();
	}
}


