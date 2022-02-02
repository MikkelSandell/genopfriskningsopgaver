package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Opgave5 {
    public static void main(String[] args) {
    ProperCase p = new ProperCase();
        System.out.println(Arrays.toString(p.properCase("HeJ med dig")));
    }
}

class ProperCase{

    public String[] properCase(String sætning){
        String [] array = sætning.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >3 && !Objects.equals(array[i], array[i].toUpperCase())){
                String bogstave = array[i].substring(0,1).toUpperCase();
                String restord = array[i].substring(1).toLowerCase();
                array[i] = bogstave +restord;
            } else if (array[i].length() <= 3 && !Objects.equals(array[i], array[i].toUpperCase())){
                array[i] = array[i].toLowerCase();
            }
        }


        return array;


    }
}
