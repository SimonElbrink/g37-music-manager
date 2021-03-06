package se.lexicon;

import se.lexicon.data.SongStorage;
import se.lexicon.model.Album;
import se.lexicon.model.Song;

import static se.lexicon.data.SongStorage.*; // WildCard - imports every static method from SongStorage.

public class App 
{

        public static void main(String[] args) {

                //songStorageExamples();
                SongAndAlbumExample();

        }

        private static void SongAndAlbumExample() {
                //Using the relationships
                Album album1 = new Album("Abbey Road (Remastered)","2009-01-01");
                Song newSong = new Song("Here Come the Sun","The Beatles", 360, album1);
                Song newSong1 = new Song("Here Come the Sun","The Beatles", 360, album1);


                // Question regarding why we don't need to specify toString when printing Object.
                //Works the same when we want to print primitive, If toString have been implemented in Class.
                int num = 123;
                System.out.println(num);

                System.out.println(newSong);
                System.out.println(newSong.toString());


                //When we have implemented equals & HashCodes can we compare without using the methods, like toString?
                //No
                boolean bool = 10 >= 20;

                bool = newSong == newSong1;
                System.out.println("Objects are the same: " + bool);

                bool = newSong.equals(newSong1);
                System.out.println("Objects are the same: " + bool);


                Song newSong2 = new Song("Here Come the Sun","The Beatles", 500, album1);

                int hashCode = newSong.hashCode();
                System.out.println("hashCode = " + hashCode);

                int hashCode1 = newSong2.hashCode();
                System.out.println("hashCode2 = " + hashCode1);

                bool = hashCode == hashCode1;

                System.out.println("Objects are the same: " + bool);
        }

        private static void songStorageExamples() {
                //Variable
                String songToAdd = "Mr. Blue Sky";

                //Using - Calling a method
                SongStorage.addSongToStorage(songToAdd);

                songToAdd = "You";
                addSongToStorage(songToAdd);


                String songToFind = "Java is On My Mind";
                findTitle(songToFind);

                songToFind = "You";
                findTitle(songToFind);
        }
}
