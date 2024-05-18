abstract class Player {
    String Name;
    char mark;

    abstract void Move();
    boolean isValidMove(int row ,int col){
        if(row>=0 && row<=2 && col>=0&& col<=2 ){

            if(TicTacToe.board[row][col]==' '){
                return true;
            }

        } 
        return false;   
    }
}
