public class Main{
    public static void main(String[] args) {
        Pawn test = new Pawn("White");
        ChessBoard board = new ChessBoard("White");
        board.board[3][4] = test;
        board.printBoard();
        System.out.println(board.moveToPosition(3, 4,2,4));
        board.printBoard();
    }
}