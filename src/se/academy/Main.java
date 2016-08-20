package se.academy;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

import static com.googlecode.lanterna.input.Key.Kind.*;


public class Main {

    private static Terminal terminal;

    public static void main(String[] args) throws InterruptedException {
        terminal = TerminalFacade.createTerminal(System.in,
                System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        Snake player = new Snake();


        while (true) {
            terminal.clearScreen();
            UpdateScreen(player, terminal);
            MovePlayer(player, terminal);
//           terminal.moveCursor(0,0);
        }

    }

    private static void UpdateScreen(Snake player, Terminal terminal) throws InterruptedException {
        terminal.moveCursor(player.x, player.y);
        terminal.applyForegroundColor(70, 240, 40);
        terminal.putCharacter('O');
        terminal.moveCursor(0,0);
    }

    private static void MovePlayer(Snake player, Terminal terminal) throws InterruptedException {
        Thread.sleep(500);
        Key key;
        key = terminal.readInput();

        if(key==null) {
            player.setDirectionY(player.directionY);
            player.setDirectionX(player.directionX);
        }
        else {
        switch(key.getKind()) {
            case ArrowRight:
                player.setDirectionX(1);
                player.setDirectionY(0);
                break;
            case ArrowLeft:
               player.setDirectionX(-1);
                player.setDirectionY(0);
                break;
            case ArrowUp:
               player.setDirectionY(-1);
                player.setDirectionX(0);
                break;
            case ArrowDown:
                player.setDirectionY(1);
                player.setDirectionX(0);
                break;
           }
        }
        player.x+=player.directionX;
        player.y+=player.directionY;
    }


              }


