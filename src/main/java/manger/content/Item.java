package manger.content;

/**
 * Created by sean.ryan on 4/14/17.
 */
public class Item {

    private String name;
    private String pathToFile;
    private boolean previouslyDownloaded;

    public Item(String name, String pathToFile){
        this.previouslyDownloaded = false;
        this.name = name;
        this.pathToFile = pathToFile;
    }

}
