package chess.Pieces;

import java.awt.Point;
import java.util.ArrayList;
import chess.Piece;
import chess.Tile;

public class Rook extends Piece {
    public Rook(boolean white, Tile initTile) {
        super(white, "Rook.png", initTile);

    }

    @Override
    public ArrayList<Tile> movableTiles(Tile tile) {

        ArrayList<Tile> movableTileList = new ArrayList<Tile>();

        // left of rook
        for (var x = tile.getX() - 1; x > 0; x--) {
            movableTileList.add(new Tile(x, tile.getY()));
        }
        // right of rook
        for (var x = tile.getX() + 1; x < 9; x++) {
            movableTileList.add(new Tile(x, tile.getY()));
        }
        // up of rook
        for (var y = tile.getY() - 1; y > 0; y--) {
            movableTileList.add(new Tile(tile.getX(), y));
        }
        // down of rook
        for (var y = tile.getY() + 1; y < 9; y++) {
            movableTileList.add(new Tile(tile.getX(), y));
        }

        return movableTileList;
    }
}
