package com.company;

public class Opgave7 {
    public static void main(String[] args) throws Exception {
        WordScarh wordScarh = new WordScarh();
        String[] list = {"word","hey","mom","many"};
        System.out.println(wordScarh.wordsherch(list,"hey"));
    }
}
class WordScarh{

    public int wordsherch(String[] list, String serchword) throws Exception{

        for (int i = 0; i < list.length; i++) {
            String currentSrting = list[i];
            if (currentSrting.equals(serchword)){

                return i+1;
            }

        }

        throw new Exception("String not found");
    }

}
