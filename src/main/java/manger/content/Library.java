package manger.content;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Shelf> shelves;

    public Library(String libName){
        this.libraryName = libName;
        shelves = new ArrayList<Shelf>();
    }

    public void addShelf(Shelf shelf){
        shelves.add(shelf);
    }

    public ArrayList<Shelf> getAllShelves(){
        return shelves;
    }

}
