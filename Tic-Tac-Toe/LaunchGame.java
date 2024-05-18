class LaunchGame{
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer H1 = new HumanPlayer("Gowtham", 'X');
        AIPlayer H2 = new AIPlayer("Priya", 'O');
        Player cp = H1;

        while (true) {
            System.out.println(cp.Name + ": Goes");
            cp.Move();
            TicTacToe.Display();
            if (TicTacToe.CheckColWin() || TicTacToe.CheckRowWin() || TicTacToe.CheckDigWin()) {
                System.out.println(cp.Name + ": has won");
                break; } else{
if(cp == H1){
cp = H2;
}
else{
cp=H1;
}
    }
}

    }
}