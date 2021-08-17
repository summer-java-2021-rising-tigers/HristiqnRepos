package GameBoardObjects;

import java.awt.Graphics;

public abstract class GameObject {

    protected int row;
    protected int col;

    public GameObject(int row, int col) {

        this.row    = row;
        this.col    = col;

    }

    public abstract void render(Graphics g);

}
