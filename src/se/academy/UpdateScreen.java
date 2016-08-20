package se.academy;

import com.googlecode.lanterna.terminal.Terminal;

/**
 *
 */

public class UpdateScreen {

    private static void UpdateScreen(Snake player, Terminal terminal) throws InterruptedException {
        terminal.moveCursor(player.x, player.y);
        terminal.applyForegroundColor(70, 240, 40);
        terminal.putCharacter('O');
    }
}
