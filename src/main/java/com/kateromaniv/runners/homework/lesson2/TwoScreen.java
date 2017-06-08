package com.kateromaniv.runners.homework.lesson2;

/*Created by katr on 08.06.2017.
 */
public class TwoScreen extends BaseScreen{

    String getTitle() {
        String user = "Manager";
        return setUsername(user);
    }

    @Override
    public String goBack(){
        return "You can not go back";
    }

    private int stringSize(){
        return goBack().length();
    }

    public String response (){
        String theResponse = "";
        if (!getTitle().equals("This user is Super Admin"))
            theResponse = "Permissiona can not be given to" + getTitle()
                .replace("This user is", "");
        return theResponse;
    }

    public static void main(String[] args) {
        TwoScreen screen = new TwoScreen();
        System.out.println(screen.goBack());
        System.out.println("Give the Super Admin permissions");
        System.out.println(screen.response());

    }
}
