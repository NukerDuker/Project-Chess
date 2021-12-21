public class Horse  extends ChessPiece{

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            if (line != toLine && column != toColumn){
                return ((toLine == line + 2 || toLine == line - 2) && (toColumn == column + 1 || toColumn == column - 1))
                        || ((toColumn == column + 2 || toColumn == column - 2) && (toLine == line + 1 || toLine == line - 1));
            }
        } else return false;
        return false;
    }

    @Override
    public String getSymbol() {
        return "Horse";
    }

    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}

