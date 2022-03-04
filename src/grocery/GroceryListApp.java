package grocery;

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
        }
        finalList();
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
        groceryList.add(beverages);
        groceryList.add(dairy);
        groceryList.add(frozen);
        groceryList.add(meatAndFish);
        groceryList.add(produce);
        groceryList.add(snacks);
        for(int i = 0; i < groceryList.size(); i++){
//            System.out.println(i);
            System.out.printf("Category: %s%n", categoryNames[i]);
            List<String> itemList = groceryList.get(i).sort();
//            System.out.println("i loop");
            for (String item : itemList) {
                System.out.printf("Item: %s - Quantity %s%n", item, groceryList.get(i).getItemQuantity(item));
//                System.out.println("n loop");
            }
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

    public static void main(String[] args) {
        groceryApp();
    }
}















