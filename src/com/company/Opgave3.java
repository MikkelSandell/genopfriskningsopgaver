package com.company;

import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        slåGræsset g = new slåGræsset();
        Scanner c = new Scanner(System.in);
        System.out.print("indtast nuvæede højde: ");
        double nuværendeHøjde = c.nextDouble();
        System.out.print("indtast max højde: ");
        double maxHøjde = c.nextDouble();
        System.out.println("dage til at græset skal slås " + g.dagtilslågræs(nuværendeHøjde,maxHøjde));

    }
}
class slåGræsset{

    public int dagtilslågræs(double højde, double maxhøjde){
        int counter = 1;
        while ( højde < maxhøjde){
            counter++;
            højde = højde + 0.8;
            if (maxhøjde <= højde)
                return counter;
        }
        return counter;
    }
}