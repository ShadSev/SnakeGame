package se.academy;

import java.util.Random;

/**
 *
 */

public class Food {
    public int x;
    public int y;

    public Food() {
        Random rand = new Random();
        this.x = rand.nextInt(28)+1;
        this.y = rand.nextInt(28)+1;
    }
}
