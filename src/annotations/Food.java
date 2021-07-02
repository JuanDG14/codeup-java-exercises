package annotations;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;
public interface Food {



    String[] groceryCats = {

            "Dairy, Eggs & Cheese",
            "Deli",
            "Frozen Foods",
            "Meat & Seafood",
            "Produce"
    };

    Input input = new Input();

    Scanner sc = new Scanner(System.in);

    HashMap<String, HashMap<String, Integer>> gList = new HashMap<>();

    static void makeIt() {
        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
            makeGroceryList();
        }
    }

    static void makeGroceryList() {
        do {
            System.out.println("Which category would you like to choose from?");
            for (int i = 0; i < groceryCats.length; ++i) {
                System.out.println(i + 1 + ". " + groceryCats[i]);
            }

            int userNum = input.getInt(1, groceryCats.length);
            String userChoice = groceryCats[userNum - 1];
            System.out.println(userChoice);

            if (!gList.containsKey(userChoice)) {
                addCat(userChoice);
            }

            HashMap<String, Integer> selectedCat = gList.get(userChoice);

            do {
                addItemOrUpdateItemVal(selectedCat);
                System.out.println("Would you like to add another item from " + userChoice);
            } while (input.yesNo());

            System.out.println("Would you like to add more to the list?");
        } while (input.yesNo());

        System.out.println(gList);
    }

    static void addItemOrUpdateItemVal(HashMap<String, Integer> items) {
        System.out.println("What item would you like to add?");
        String userInpItem = sc.nextLine();
        System.out.println("How many " + userInpItem + " would you like to add?");
        int userNum = input.getInt();
        if (items.containsKey(userInpItem)) {
            int oldVal = items.get(userInpItem);
            items.replace(userInpItem, oldVal + userNum);
        } else {
            items.put(userInpItem, userNum);
        }
    }

    static void addCat(String key) {
        if (!gList.containsKey(key)) {
            gList.put(key, new HashMap<>());
        }
    }


    public static void main(String[] args) {
        makeIt();

    }
}