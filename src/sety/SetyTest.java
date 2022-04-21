package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    // w zbiorach elementy sa unikalne i nie sa indeksowane

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        //fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());


        //iterowanie po elementach zbioru jest takie samo jak w liscie
    }
}
