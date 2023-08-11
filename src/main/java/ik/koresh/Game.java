package ik.koresh;

import java.io.FileNotFoundException;

public class Game {
    Parser word = new Parser();
    Gallows gallows = new Gallows();

    char[] wordFull = word.word.toCharArray();
    char[] hideWordFul = word.hideWord.toCharArray();

    public void findLetter(char letter) {
        boolean flag = false;
        for (int i = 0; i < word.word.length(); i++) {
            if (wordFull[i] == letter) {
                hideWordFul[i] = letter;
                flag = true;
            }
        }
        if (!flag) {
            gallows.setScaffold();
            gallows.getScaffold();
        }
    }
}
