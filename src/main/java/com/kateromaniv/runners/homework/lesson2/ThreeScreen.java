package com.kateromaniv.runners.homework.lesson2;

import java.util.ArrayList;
import java.util.Random;

/*Created by katr on 08.06.2017.
 */
public class ThreeScreen extends BaseScreen{
    private String user;
    private String password;
    private String title;

    String getTitle() {
        return APPNAME;
    }

    public ThreeScreen() {
        user = "Power User";
    }

    private ThreeScreen(int a){
        this();
        this.password = String.valueOf(passwordGenerator(a));
    }

    private ArrayList passwordGenerator (int a){
        Random rn = new Random();
        ArrayList <Integer> password = new ArrayList<Integer>();
        for (int i = 0; i<5; i++){
            password.add(rn.nextInt(9));
        } return password;
    }

    public String logIn (int a){
        ThreeScreen screen = new ThreeScreen(a);
        return "Your username is " + screen.user + " and your password is " + screen.password
                .replace("[","")
                .replace("]","");
    }

    public static void main(String[] args) {
        int a = 5;
        ThreeScreen screen = new ThreeScreen();
        System.out.println(screen.getTitle());
        System.out.println(screen.logIn(a));
    }

}
