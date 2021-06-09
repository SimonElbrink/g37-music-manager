package se.lexicon;

import java.util.Arrays;

public class SongStorage {
    //Field variable - Variable in Class
    private static String[] songTitles = new String[] {"Here Come the Sun", "Happy Day", "Java is On My Mind"};

    public static void main(String[] args) {


        System.out.println("Arrays.toString(songTitles) = " + Arrays.toString(songTitles));



        //Variable
        String songToAdd = "Mr. Blue Sky";

        //Using - Calling a method
        add(songToAdd);

        songToAdd = "You";
        add(songToAdd);




        String songToFind = "Java is On My Mind";
        find(songToFind);

        songToFind = "You";
        find(songToFind);

        //CRUD - Create, Read, Update, Delete

    }

    //Declare- Creating- Preparing a method
    public static boolean add(String songToAdd){ // Parameter is a reference to songTiles, but only available in method scope. (Can have different name.)

        // No duplicates allowed

        for (String songName :
                songTitles) {
            if (songName.equalsIgnoreCase(songToAdd)) {
                return false;
            }
        }

        // Add behavior

        //"Expanding" Array
        String[] expandedArray = Arrays.copyOf(songTitles, songTitles.length + 1);

        System.out.println("Arrays.toString(expandedArray) = " + Arrays.toString(expandedArray));

        //Added Element to The Array
        expandedArray[expandedArray.length -1] = songToAdd;

        //Replacing OG Array, with newly created and with an element.
        songTitles = expandedArray;

        System.out.println("Song added");
        System.out.println("Arrays.toString(songTitle) = " + Arrays.toString(songTitles));
        return true;

    }


    public static String find(String songToFind){
        //Find

        String songFound = null;

        //Look for name
        for (int i = 0; i < songTitles.length; i++) {

            if (songToFind.equalsIgnoreCase(songTitles[i])){
                songFound = songToFind;
                System.out.println("Found!");
                break;
            }else{
                // System.out.println("not Found");
            }
        }

        System.out.println("songFound = " + songFound);
        return songFound;
    }



}
