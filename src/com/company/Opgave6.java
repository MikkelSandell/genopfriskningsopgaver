package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Opgave6 {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.sort1();
    }



}

class Sort {

    public void sort1() {
        String[] ord = {"abekat", "musefælde", "ananas", "slut", "solskin"};
        Arrays.sort(ord);
        System.out.println("alfabetisk");
        System.out.println(Arrays.toString(ord));
        Arrays.sort(ord, Collections.reverseOrder());
        System.out.println("omvent alfabetisk");
        System.out.println(Arrays.toString(ord));
    }
}
