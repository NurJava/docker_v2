package kz.bitlab.docker.services;

import kz.bitlab.docker.models.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService {
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems(){
        return items;
    }

    public void addItem(String itemName, int itemPrice){
        Item item = new Item();
        item.setId(items.size()+1L);
        item.setName(itemName);
        item.setPrice(itemPrice);
        items.add(item);
    }

}
