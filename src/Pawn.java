public class Pawn  extends ChessPiece{

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            if(line != toLine ){
                if(((color.equals("White") || (color.equals("Black"))) && line == 1)) {
                    return ((toLine == line + 2) || (toLine == line + 1));
                } else if ((color.equals("White")) || (color.equals("Black"))){
                    return toLine == line + 1;
                }
            } else return false;
        } return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
