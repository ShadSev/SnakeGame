package se.academy;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

/**
 *
 */

public class MovePlayer {
    private static void MovePlayer(Snake player, Terminal terminal) throws InterruptedException {

        Key key;
        do{
            Thread.sleep(5);
            key = terminal.readInput();
        }
        while(key == null);

        switch(key.getKind()) {
            case ArrowRight:
                if(player.x<29) {
                        player.x = player.x + 1;
                }
                break;
            case ArrowLeft:
                if(player.x>1) {
                        player.x = player.x - 1;
                }
                break;
            case ArrowUp:
                if(player.y>1) {

                        player.y = player.y - 1;
                }
                break;
            case ArrowDown:
                if(player.y<29) {
                        player.y = player.y + 1;
                }
                break;
        }
    }
}
