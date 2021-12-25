public class Queen extends ChessPiece{

    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && chessBoard.board[line][column] != null) {
            if ((line == toLine && column != toColumn) || (column == toColumn && line != toLine)){
                return true;
            } else if (line != toLine || column != toColumn) {
                int maxL = Math.max(line, toLine);
                int minL = Math.min(line, toLine);
                int maxC = Math.max(column, toColumn);
                int minC = Math.min(column, toColumn);
                return maxL - minL == maxC - minC;
            }
        } else return false;
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    public boolean checkPos(int num){
        return num >= 0 && num <= 7;
    }



}
