package com.kateromaniv.runners.homework.lesson2;

/*Created by katr on 08.06.2017.
 */
abstract class BaseScreen {
    private String username;
    public String APPNAME = "MyApp";

    abstract String getTitle();

    public String goBack(){
        return "You rolled back the screen";
    }

    public String setUsername (String username){
        return "This user is " + this.username;
    }
}
