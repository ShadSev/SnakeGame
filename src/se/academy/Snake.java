package se.academy;

/**
 *
 */


import java.util.Random;

public class Snake {
    public int x;
    public int y;
    public int directionX;
    public int directionY;

    public Snake() {
        Random rand = new Random();
        this.x = rand.nextInt(28)+1;
        this.y = rand.nextInt(28)+1;
    }
    public void setDirectionY(int y)  {
        this.directionY=y; }
    public void setDirectionX(int x) {
        this.directionX=x;
    }
}
