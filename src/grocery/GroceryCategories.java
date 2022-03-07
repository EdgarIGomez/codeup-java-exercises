package grocery;

import java.awt.font.ShapeGraphicAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//
public class GroceryCategories {
private HashMap<String, Integer> category;

public GroceryCategories() {
        category = new HashMap<>();
}
public void addItem(String name, int quantity){
            this.category.put(name, quantity);
        }

public int getItemQuantity(String groceryItemName){
        return this.category.get(groceryItemName);
        }

public void changeValue(String name, int num){
        this.category.replace(name, num);
}

public void removeItem(String name){
        this.category.remove(name);
}

public void addNewItem(String name, int num){
        this.category.putIfAbsent(name, num);
}

public void clearList(){
        this.category.clear();
}

public List<String> sort(){
        List<String> keys = new ArrayList<>(category.keySet());
        Collections.sort(keys);
        return keys;
        }
}
