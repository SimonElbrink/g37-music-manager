package se.lexicon.data;

import java.util.Arrays;

public class SongStorage {
    //Field variable - Variable in Class
    private static String[] songTitles = new String[] {"Here Come the Sun", "Happy Day", "Java is On My Mind"};

    public static int getSize(){
        return songTitles.length;
    }

    protected static void setSongTitles(String[] songTitles){
        SongStorage.songTitles = songTitles;
    }

    public static void clearSongs(){
        SongStorage.songTitles = new String[0];
    }


    //Declare- Creating- Preparing a method
    public static boolean addSongToStorage(String songToAdd){

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


    public static String findTitle(final String songToFind){
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

    public static String[] findAllTitles(){
        String[] songList = Arrays.copyOf(songTitles, songTitles.length);
        return songList;
    }

    public static String[] findTitleContaining(String songNameLike){

        String[] matchingElements = new String[0];

        for (String name :
                songTitles) {
            if (name.contains(songNameLike)) {
                matchingElements = addElementToArray(matchingElements, name);
            }
        }

        return matchingElements;
    }


    /**
     * This method adds an specified element to specified Array.
     * @param sourceArray array to expand and add to.
     * @param elementToAdd element to add in the array.
     * @return the new array with added element.
     */
    private static String[] addElementToArray(String[] sourceArray, String elementToAdd){

        sourceArray = Arrays.copyOf(sourceArray, sourceArray.length);
        sourceArray[sourceArray.length -1] = elementToAdd;

        return sourceArray;
    }

    private static int indexOf(String[] source, String elementToFind){

        int found = -1;

        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(elementToFind)){
                found = i;
                break;
            }

        }
        return found;
    }



}
