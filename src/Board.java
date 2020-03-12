public class Board {
    int size = 8;
    String[][] grid = new String[size][size];  //make 8x8 2D array of strings

    public Board(String[][] grid) {
        this.grid = grid;
    }


    public int firstMove(){
        int random = (int)(Math.random()*2);
        return random;
    }
    //constructor initializes the whole
    // grid with 0's when created
    public Board() {

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "-";

            }
        }

    }



    //printBoard will output a board to the console
    public void printBoard() {
        System.out.println("Updated board:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                System.out.print(grid[row][col] + " ");

            }
            System.out.println("");
        }
    }

        //makes a move on the board - changes a position to "token value"
        public boolean makeMove( int col, String token){
            for(int i=7; i>=0; i--){
                if(grid[i][col].equals("-")){
                    grid[i][col]=token;
                    return true;
                }

                }

            return false;
            }




        //win check routine with basic "algorithm" for now
        //any move at 0,0 ends game
        public boolean checkWin() {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 4; j++) {
                    if (grid[i][j].equals("X") && grid[i][j + 1].equals("X") && grid[i][j + 2].equals("X") && grid[i][j + 3].equals("X")) {
                        return true;
                    }


                }

            }
            return false;
        }

}