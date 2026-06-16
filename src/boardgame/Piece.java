package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // Se não for colocado null, o Java já atribui o valor null
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
