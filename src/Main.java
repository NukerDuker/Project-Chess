public class Main{
    public static void main(String[] args) {
        Rook test = new Rook("White");
        ChessBoard board = new ChessBoard("White");
        board.board[3][4] = test;
        board.printBoard();
        System.out.println(board.moveToPosition(3, 4,3,6));
        board.printBoard();
    }
}