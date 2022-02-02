package com.company;

import java.util.ArrayList;

public class Opgave2 {
    public static void main(String[] args) {
    Bog b = new Bog(32,"hops way",1997);
    Biblioteket c = new Biblioteket();
        System.out.println(c.Biblioteket(b));

    }
}
class Bog{
    int ISBN;
    String title;
    int reliseYear;

    public Bog (int ISBN, String title, int reliseYear){
        this.ISBN = ISBN;
        this.title = title;
        this.reliseYear = reliseYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getReliseYear() {
        return reliseYear;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReliseYear(int reliseYear) {
        this.reliseYear = reliseYear;
    }



    @Override
    public String toString() {
        return "ISBN = " + ISBN + "\ntitle= " + title + "\nreliseYear= " + reliseYear;
    }
}
    class Biblioteket {
        ArrayList<Bog> bogs = new ArrayList<>();

        public boolean Biblioteket(Bog bog) {

            bogs.add(new Bog(32, "hops way", 1997));
            bogs.add(new Bog(45, "hops way 2", 1999));
            bogs.add(new Bog(77, "hops way 3", 2001));

            for (int i = 0; i < bogs.size(); i++) {
                if (bogs.get(i).ISBN == bog.ISBN) {
                    return true;
                }
            }
            return false;
        }
    }
