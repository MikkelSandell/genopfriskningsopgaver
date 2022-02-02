package com.company;

public class Opgave4 {
    public static void main(String[] args) {
       Shape s = new Shape();
       s.builder(5,"H");
    }
}

class Shape {

    public void builder(int længde, String tegn) {
        for (int i = 0; i < længde; i++) {
            for (int j = 0; j < længde; j++) {
                System.out.print(tegn +"  ");
            }
            System.out.println();
        }
    }
}
