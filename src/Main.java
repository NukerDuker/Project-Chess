public class Main{
    public static void main(String[] args) {
        King test = new King("White");
        ChessBoard board = new ChessBoard("White");
        board.board[3][4] = test;
        board.printBoard();
        System.out.println(board.moveToPosition(3, 4,4,7));
        board.printBoard();
    }
}