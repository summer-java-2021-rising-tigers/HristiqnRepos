package GameBoardObjects;

public abstract class GameObject {

    protected int row;
    protected int col;

    public GameObject(int row, int col) {

        this.row    = row;
        this.col    = col;

    }

}
