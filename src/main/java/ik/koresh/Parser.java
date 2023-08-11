package ik.koresh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Parser {
    public String hideWord="";
    public String word;
    {
        try {
            word = getWord();
            generateHideWord();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> record() throws FileNotFoundException {
        File file = new File("russian_nouns.txt");
        Scanner scanner = new Scanner(file);
        List<String> words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }
        return words;
    }

    public String getWord() throws FileNotFoundException {
        List<String> words = record();
        return words.get(new Random().nextInt(words.size() + 1));
    }

    private void generateHideWord(){
        char ch = '*';
        for(int i=0; i < word.length(); i++){
            hideWord += ch;
        }
    }

}
