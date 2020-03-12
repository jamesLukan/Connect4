import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        //make instances
        Human h = new Human("Alby", "X");
        Computer c = new Computer("O");
        Scanner sc =  new Scanner(System.in);
        Board b = new Board();

        //game loop - alternate moves
        while(!b.checkWin()) {

            //set up vars

            boolean legalCol = false;

            int moveCol = -1;

            //human move: validate input and move
            while(!legalCol) {




                //col move
                System.out.println("Enter col to move:");
                //hasNextInt will return true if user input is an int
                if(sc.hasNextInt()) {
                    moveCol = sc.nextInt();
                    legalCol = true;
                }
                else {
                    System.out.println("Enter a legal col!");
                    sc.next();  //very important, resets the input from the "bad" one
                }

                if(legalCol) {
                    b.makeMove(moveCol,h.token);
                }
            }

            //computer move
            int cMove = c.determineMove();
            b.makeMove(cMove,c.token);

            //all done moving, display and repeat
            b.printBoard();

        }

        System.out.print("Game Over!");

    }
}
