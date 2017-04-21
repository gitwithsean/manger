package manger.content;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Slf4j
public class ItemIngester {

    public static Library ingestEverythingFromDirectory(String directory){
        Library lib = new Library("Initial Library");
        Shelf onlyShelf = new Shelf("Initial Shelf");

        try(Stream<Path> paths = Files.walk(Paths.get(directory))) {
            paths.forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    log.info("Adding file: " );
                    Item newItem = new Item("Name", filePath.toString());

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lib;
    }

    public static void ingestSingleItem(String path){

    }

}
