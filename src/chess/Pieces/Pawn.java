package chess.Pieces;

import java.awt.Point;
import java.util.ArrayList;
import chess.Piece;
import chess.Tile;

public class Pawn extends Piece {

    public Pawn(boolean white, Tile initTile) {
        super(white, "Pawn.png", initTile);

    }

    @Override
    public ArrayList<Tile> movableTiles(Tile tile) {
        // TODO Auto-generated method stub
        ArrayList<Tile> movableTileList = new ArrayList<Tile>();
        movableTileList.add(new Tile(tile.getX(), tile.getY() + 1));
        if (tile.getY() == 2) {
            movableTileList.add(new Tile(tile.getX(), 4));
        }
        return movableTileList;
    }

}
