package GroceryList;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {
    public static Input input = new Input();

    public static ArrayList<String> mainList= new ArrayList<>();
    public static ArrayList<String> produceList = new ArrayList<>();
    public static ArrayList<String> bakeryList = new ArrayList<>();
    public static ArrayList<String> seafoodList = new ArrayList<>();
    public static ArrayList<String> drinksList = new ArrayList<>();


    public static void creating() {
        boolean createList = input.yesNo("Would you like to start creating your grocery list?");
        if (createList) {
            makeList();
        }
    }

    public static void makeList() {

    }
}
