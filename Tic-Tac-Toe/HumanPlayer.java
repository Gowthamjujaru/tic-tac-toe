import java.util.Scanner;

public class HumanPlayer extends Player {
    String Name;
    char mark;

    public HumanPlayer(String Name,char mark){
        this.Name=Name;
        this.mark=mark;
    }
    void Move(){
  
    Scanner scan=    new Scanner(System.in);
    int row;
    int col;
    do {
        System.out.println("enter row and col");
 row = scan.nextInt();
 col = scan.nextInt();
    } while (!isValidMove(row, col));
  TicTacToe.PlaceMark(row, col, mark);
    }

    boolean isValidMove(int row ,int col){
        if(row>=0 && row<=2 && col>=0&& col<=2 ){

            if(TicTacToe.board[row][col]==' '){
                return true;
            }

        } 
        return false;   
    }
}
