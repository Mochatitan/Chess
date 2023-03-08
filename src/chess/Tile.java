package chess;

public class Tile {
    private int tileX;
    private int tileY;

    public Tile(int x, int y) {
        tileX = x;
        tileY = y;
    }

    public int getX() {
        return tileX;
    }

    public void setX(int newX) {
        tileX = newX;
    }

    public int getY() {
        return tileY;
    }

    public void setY(int newY) {
        tileY = newY;
    }

    public int getDrawX() {
        return tileX - 1;
    }

    public int getDrawY() {
        return 8 - tileY;
    }

    public boolean isEqualTo(Tile tileTwo){
        if((this.getX() == tileTwo.getX()) && (this.getY() == tileTwo.getY())){
            return true;
        }
        return false;
    }
}
