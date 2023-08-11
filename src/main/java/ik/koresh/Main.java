package ik.koresh;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        System.out.println(game.wordFull);
        System.out.println(game.hideWordFul);

        while (true){
            if (game.gallows.getCount() == 6) {
                System.out.println("The game is lost");
                return;
            }
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);
            game.findLetter(letter);

            System.out.println(game.hideWordFul);

            String wCh = new String(game.hideWordFul);
            if (wCh.indexOf('*') == -1){
                System.out.println("Win!!!");
                return;
            }
        }
    }
}