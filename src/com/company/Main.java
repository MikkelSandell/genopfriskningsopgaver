package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String word = "hej";
        ArrayList<String> words = new ArrayList();
        words.add("dav");
        words.add("hej");
        words.add("vinter");
        Opgave1 o = new Opgave1();
        System.out.println(o.doesArraylistContainString(word,words));

    }


}

class Opgave1 {
    public boolean doesArraylistContainString(String word, ArrayList<String> words) {
        return words.contains(word);
    }
}


