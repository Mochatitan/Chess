package chess.Pieces;

import java.awt.Point;
import java.util.ArrayList;
import chess.Piece;
import chess.Tile;

public class Queen extends Piece {
    public Queen(boolean white, Tile initTile) {
        super(white, "Queen.png", initTile);

    }

    @Override
    public ArrayList<Tile> movableTiles(ArrayList<Tile> takenList) {
        // TODO Auto-generated method stub
        ArrayList<Tile> movableTileList = new ArrayList<Tile>();
        ArrayList<Tile> removeList = new ArrayList<Tile>();
        for(int col = 0; col < 9;col++){
            for(int row = 0; row < 9;row++){
                movableTileList.add(new Tile(row, col));
            }
        }
        

        for (Tile movingToTile : movableTileList) {
            if ((movingToTile.getX() == 0) || (movingToTile.getX() == 9) || (movingToTile.getY() == 0)
                    || (movingToTile.getY() == 9)) {
                removeList.add(movingToTile);
            }
        }

        for (Tile tileA : movableTileList) {
            for (Tile tileB : takenList) {
                if ((tileA.getX() == tileB.getX()) && (tileA.getY() == tileB.getY())) {
                    removeList.add(tileA);
                }
            }
        }
        removeList.add(this.getTile());
        movableTileList.removeAll(removeList);
        return movableTileList;
    }
}
