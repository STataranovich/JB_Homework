package Task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static void main(String[]args){
        Item item1 = new Item("Bread", 5);
        Item item2 = new Item("Milk", 2);
        Item item3 = new Item("Butter", 4);

        List<Item> itemlist = new ArrayList<Item>();
        itemlist.add(item1);
        itemlist.add(item1);
        itemlist.add(item2);
        itemlist.add(item3);

        pokupka(itemlist);
    }

    public static void pokupka(List<Item> list){
        System.out.println(list);
    }
}
