package GameBoardObjects;

public class Tile extends GameObject{

    protected int height;
    protected int width;

    public Tile(int row, int col) {

        super(row, col);
        this.height = 10;
        this.width = 10;

    }

    public  int getHeight(){
        return this.height;
    }
    public  int getWidth(){
        return this.width;
    }
}
