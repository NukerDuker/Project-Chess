public class Main{
    public static void main(String[] args) {
        Horse test = new Horse("White");
        ChessBoard board = new ChessBoard("White");
        board.board[3][4] = test;
        board.printBoard();
        System.out.println(board.moveToPosition(3, 4,5,5));
        board.printBoard();
    }
}