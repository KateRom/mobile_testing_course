package com.kateromaniv.runners.homework.lesson2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/*Created by katr on 08.06.2017.
 */
public class OneScreen extends BaseScreen{
    private String username = "Super Admin";
    private HashSet<String> scElements = new HashSet<String>();

    String getTitle() {
        return setUsername(username);
    }


    private HashSet<String>  scElements (){
        scElements.add("head");
        scElements.add("body");
        scElements.add("div");
        scElements.add("a");
        scElements.add("button");
        scElements.add("script");
        return scElements;
    }

    public HashMap idForElement (HashSet<String> scElement) {
        Random rn = new Random();
        HashMap<Integer, String> idForElement = new HashMap<Integer, String>();
        int a = 0;
        for (String element : scElement) {
            a++;
            idForElement.put(a, element);

        }
        return idForElement;
    }

    public static void main(String[] args) {
        OneScreen screen = new OneScreen();
        System.out.println(screen.getTitle());
        System.out.println(String.valueOf(screen.idForElement(screen.scElements())));
    }
}
