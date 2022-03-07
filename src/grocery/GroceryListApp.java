package grocery;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import util.Input;

public class GroceryListApp {

    private static ArrayList<GroceryCategories> groceryList = new ArrayList<>();

    private static GroceryCategories beverages = new GroceryCategories();
    private static GroceryCategories dairy = new GroceryCategories();
    private static GroceryCategories frozen = new GroceryCategories();
    private static GroceryCategories meatAndFish = new GroceryCategories();
    private static GroceryCategories produce = new GroceryCategories();
    private static GroceryCategories snacks = new GroceryCategories();

    public static void groceryApp(){
        System.out.println("Would you like to create a new grocery list?");
        boolean confirmation = Input.yesNo();
        if(confirmation){
            System.out.println("Would you like to enter a new item:");
            boolean addItemConfirmation = Input.yesNo();
            if(addItemConfirmation){
                groceryCategorySelect();
            }
            groceryList.add(beverages);
            groceryList.add(dairy);
            groceryList.add(frozen);
            groceryList.add(meatAndFish);
            groceryList.add(produce);
            groceryList.add(snacks);
            finalList();
            appEnd();
        }
    }

    public static GroceryCategories addGroceryItem(GroceryCategories category){
        System.out.println("What is the item you want to add: ");
        String itemName = Input.getString();
        System.out.println("How many do you need: ");
        int quantity = Input.getInt();
        category.addItem(itemName, quantity);
        return category;
    }

    public static void finalList(){
        String[] categoryNames = {"Beverages", "Dairy", "Frozen", "Meat and Fish", "Produce", "Snacks"};

        System.out.println("How would you like to see your list:");
        System.out.printf("1: Everything%n2: Beverages%n3: Dairy%n4: Frozen%n5: Meat and Fish%n6: Produce%n7: Snacks%n8: Edit List%n9:Exit%n");
        int input = Input.getInt(1, 9);
        if(input == 1){
            fullListMaker();
            System.out.println();
            finalList();
        }else if(input == 2){
            System.out.println("Category: Beverages");
            listMaker(0);
            System.out.println();
            finalList();
        }else if(input == 3){
            System.out.println("Category: Dairy");
            listMaker(1);
            System.out.println();
            finalList();
        }else if(input == 4){
            System.out.println("Category: Frozen");
            listMaker(2);
            System.out.println();
            finalList();
        }else if(input == 5){
            System.out.println("Category: Meat and Fish");
            listMaker(3);
            System.out.println();
            finalList();
        }else if(input == 6){
            System.out.println("Category: Produce");
            listMaker(4);
            System.out.println();
            finalList();
        }else if(input == 7){
            System.out.println("Category: Snacks");
            listMaker(5);
            System.out.println();
            finalList();
        }else if(input == 8){
            editList();
            finalList();
        }
    }

//    public void printItems(GroceryCategories category){
//
//    }
    public static void groceryCategorySelect(){
        System.out.printf("Which category would you like to add an item to:%n1. Beverages%n2. Dairy%n3. Frozen%n4. Meat and Fish%n5. Produce%n");
        int choice = Input.getInt(0, 5);
        if(choice == 1){
            addGroceryItem(beverages);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }
        }else if(choice == 2){
            addGroceryItem(dairy);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }
        }else if(choice == 3){
            addGroceryItem(frozen);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }
        }else if(choice == 4){
            addGroceryItem(meatAndFish);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }
        }else if(choice == 5){
            addGroceryItem(produce);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }

        }else if(choice == 6){
            addGroceryItem(snacks);
            System.out.println("Would you like to add another item if not list will be finalized:");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                groceryCategorySelect();
            }
        }

    }

    public static void editList(){
        System.out.println("What would you like to do with your list:");
        System.out.printf("1: Edit Item%n2: Add Item%n3: Remove Item%n4: Clear List%n5: Return to list%n");
        int choice = Input.getInt(1, 5);
        if(choice != 5){
            if(choice == 1){
                int chosenCategory = categoryPicker();
                System.out.println("Please enter the item you would like to edit: ");
                String item = Input.getString();
                System.out.println("What is the new quantity that you want:");
                int quantity = Input.getInt();
                groceryList.get(chosenCategory).changeValue(item, quantity);
                System.out.println();
                editList();
            }else if(choice == 2){
                int chosenCategory = categoryPicker();
                System.out.println("Please enter the item you would like to add: ");
                String item = Input.getString();
                System.out.println("What is the quantity that you want:");
                int quantity = Input.getInt();
                groceryList.get(chosenCategory).addNewItem(item, quantity);
                System.out.println();
                editList();
            }else if(choice == 3){
                int chosenCategory = categoryPicker();
                System.out.println("Please enter the item you would like to remove: ");
                String item = Input.getString();
                groceryList.get(chosenCategory).removeItem(item);
                System.out.println();
                editList();
            }else if(choice == 4){
                System.out.println("Please enter the category you would like to clear: ");
                int chosenCategory = categoryPicker();
                groceryList.get(chosenCategory).clearList();
                System.out.println();
                editList();
            }
        }
    }

    public static int categoryPicker(){
        System.out.println("Which category do you want to pick: ");
        System.out.printf("1: Beverages%n2: Dairy%n3: Frozen%n4: Meat and Fish%n5: Produce%n6: Snacks%n");
        int num = Input.getInt(1, 6);
        if(num == 1){
            return 0;
        }else if(num == 2){
            return 1;
        }else if(num == 3){
            return 2;
        }else if(num == 4){
            return 3;
        }else if(num == 5){
            return 4;
        }
            return 5;
    }

    public static void fullListMaker(){
//        String[] categoryNames = {"Beverages", "Dairy", "Frozen", "Meat and Fish", "Produce", "Snacks"};
        for (GroceryCategories categories : groceryList) {
//            System.out.println(i);
//            System.out.printf("Category: %s%n", categoryNames[i]);
            List<String> itemList = categories.sort();
//            System.out.println("i loop");
            for (String item : itemList) {
                System.out.printf("Item: %s - Quantity %s%n", item, categories.getItemQuantity(item));
//                System.out.println("n loop");
            }
        }
    }

    public static void listMaker(int num){
        List<String> itemList = groceryList.get(num).sort();
        for (String item : itemList) {
            System.out.printf("Item: %s - Quantity %s%n", item, groceryList.get(num).getItemQuantity(item));
        }
    }
    public static void appEnd(){
        System.out.println("Thank you for using the app!");
    }
    public static void main(String[] args) {
        groceryApp();
    }
}















