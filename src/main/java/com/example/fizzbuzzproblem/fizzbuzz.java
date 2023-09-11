package com.example.fizzbuzzproblem;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class fizzbuzz {
    public static List<String> fizzBuzz(int n) {      //Der Rückgabewert ist als List<String> initialisiert worden und die Methode enthält einen int Parameter n
        List<String> result = new ArrayList<>();       //Hier wird die Ergebnisliste erstellt

        for (int x = 1; x <= n; x++) {                        //Die Schleife beginnt bei x = 1 und endet wenn x = n erreicht hat bei einer Inkrementation von 1

            if (x % 3 == 0 && x % 5 == 0) {            //"FizzBuzz" wird der Liste hinzugefügt falls x durch 3 und 5 teilbar ist
                result.add("FizzBuzz");
            } else if (x % 3 == 0) {                      //"Fizz" wird der Liste hinzugefügt falls x durch 3 teilbar ist.
                result.add("Fizz");
            } else if (x % 5 == 0) {                       //"Buzz" wird der Liste hinzugefügt falls x durch 5 teilbar ist.
                result.add("Buzz");
            } else {
                result.add(Integer.toString(x));       //die nächste Zahl wird der Liste hinzugefügt falls die oberen Fälle nicht zutreffen
            }
        }
        String json = new Gson().toJson(result);       //hier ändern wir das Format der Liste zum JsonFormat mittels der GSON Bibliothek
        return Collections.singletonList(json);        //zuletzt wird die Liste im JsonFormat ausgegeben
    }

    public static void main(String[] args) {

        //Hier habe ich verschiedene Testfälle zur überprüfung der Methode verfasst

        int testNegative5 = -5; //leere Rückgabe erwartet
        int test0 = 0;          //leere Rückgabe erwartet
        int test3 = 3;          //fizz test
        int test5 = 5;          //buzz test
        int test15 = 15;        //fizzbuzz test
        int test100 = 100;      //test mit einer größeren Zahl zur Veranschaulichung

        System.out.print(fizzBuzz(test100));
    }

}
