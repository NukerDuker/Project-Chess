public class Rook extends ChessPiece{

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            return (line == toLine && column != toColumn) || (column == toColumn && line != toLine);
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
