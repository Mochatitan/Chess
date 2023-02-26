package chess.Pieces;

import java.awt.Point;
import java.util.ArrayList;
import chess.Piece;
import chess.Tile;

public class Bishop extends Piece {

    public Bishop(boolean white, Tile initTile) {
        super(white, "Bishop.png", initTile);

    }

    @Override
    public ArrayList<Tile> movableTiles(Tile tile) {
        // TODO Auto-generated method stub
        ArrayList<Tile> movableTileList = new ArrayList<Tile>();
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        boolean upLeft = true;
        boolean upRight = true;
        boolean downLeft = true;
        boolean downRight = true;
        // up left of bishop
        while (upLeft == true) {
            movableTileList.add(new Tile(tile.getX() - a, tile.getY() + a));
            if ((tile.getX() - a == 1) || (tile.getY() + a == 8)) {
                upLeft = false;
            }
            a++;
        }
        // up right of bishop
        while (upRight == true) {
            movableTileList.add(new Tile(tile.getX() + b, tile.getY() + b));
            if ((tile.getX() + b == 8) || (tile.getY() + b == 8)) {
                upRight = false;
            }
            b++;
        }
        // // down left of bishop
        while (downLeft == true) {
            movableTileList.add(new Tile(tile.getX() - c, tile.getY() - c));
            if ((tile.getX() - c == 1) || (tile.getY() - c == 1)) {
                downLeft = false;
            }
            c++;
        }
        // // down right of bishop
        while (downRight == true) {
            movableTileList.add(new Tile(tile.getX() + d, tile.getY() - d));
            if ((tile.getX() + d == 8) || (tile.getY() - d == 1)) {
                downRight = false;
            }
            d++;
        }

        return movableTileList;
    }

}
