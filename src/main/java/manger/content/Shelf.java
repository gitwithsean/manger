package manger.content;

import java.util.ArrayList;

/**
 * Created by sean.ryan on 4/14/17.
 */
public class Shelf {

    private String shelfName;
    ArrayList<Item> items;

    public Shelf(String shelfName){
        this.shelfName = shelfName;
        this.items = new ArrayList<Item>();
    }

}
