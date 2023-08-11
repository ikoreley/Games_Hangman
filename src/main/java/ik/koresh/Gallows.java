package ik.koresh;

import java.util.Scanner;

public class Gallows {

    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public String[] scaffold = {
            "_____   ",
            "|    |  ",
            "|       ",
            "|       ",
            "|       ",
            "|_      ",};
    public String[] hangedManFull = {
            "|    O",
            "|   /|\\",
            "|   / \\"
    };
    public String[] hangedMan = {
            "|    O  ",
            "|   /   ",
            "|   / \\",
            "|   /|\\",
            "|   /   ",
            "|   / \\",

    };

    public void setScaffold(){
        if (count == 0)
            scaffold[2] = hangedMan[count];
        if (count == 1 | count == 2 | count == 3)
            scaffold[3] = hangedMan[count];
        if (count == 4 | count == 5)
            scaffold[4] = hangedMan[count];
        count++;
    }

    public void getScaffold(){
        for (String s : scaffold) {
            System.out.println(s);
        }
    }

}
