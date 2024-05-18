import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player{
    String name;
    char mark;
//to use ai we have random class in java to generate automatically
    public AIPlayer(String Name,char mark){
        this.Name=Name;
        this.mark=mark;
    }
    void Move(){
  
    Scanner scan=    new Scanner(System.in);
    int row;
    int col;
    do {
      Random r = new Random();
      row =r.nextInt(3);
      col = r.nextInt(3);
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

