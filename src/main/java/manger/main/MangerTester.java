package manger.main;

import manger.content.ItemIngester;
import manger.content.Library;

/**
 * Created by sean.ryan on 4/21/17.
 */
public class MangerTester {

    private static String pathToFiles = "/Users/sean.ryan/Downloads/torrs";
    private static Library library;

    private static void establishLibrary(){

        library = ItemIngester.ingestEverythingFromDirectory(pathToFiles);

    }

}
