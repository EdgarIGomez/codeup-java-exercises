package grocery;

import java.awt.font.ShapeGraphicAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//
public class GroceryCategories {
private HashMap<String, Integer> category;

public GroceryCategories(){
        category = new HashMap<>();
        }
        public void addItem(String name, int quantity){
            this.category.put(name, quantity);
        }

public int getItemQuantity(String groceryItemName){
        return this.category.get(groceryItemName);
        }

public List<String> sort(){
        List<String> keys = new ArrayList<>(category.keySet());
        Collections.sort(keys);
        return keys;
        }
}
