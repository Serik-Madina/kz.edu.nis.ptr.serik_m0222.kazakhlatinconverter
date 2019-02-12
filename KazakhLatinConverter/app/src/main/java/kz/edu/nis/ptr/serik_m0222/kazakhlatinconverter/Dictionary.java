package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.app.Activity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abdulmanova_D.ptr on 20.10.2017.
 */

public class Dictionary
{
    private static final String FILENAME = "dictionary.txt";

    public static ArrayList<String> getWordsAsArrayList(Activity act)
    {
        String wordsTxt = Tools.readFromFile(act, FILENAME);
        ArrayList<String> tmpWords = new ArrayList<>();
        Scanner sc = new Scanner(wordsTxt);
        while(sc.hasNextLine()) {
            tmpWords.add(sc.nextLine());
        }
        return tmpWords;
    }

    public static String getWordsAsString(Activity act)
    {
        return Tools.readFromFile(act, FILENAME);
    }

    public static boolean alreadyInList(Activity act, String kazakWord, String latinWord) {
        String word = kazakWord + " - " + latinWord;

        ArrayList<String> words = getWordsAsArrayList(act);

        for (int i = 0; i < words.size(); i++) {
            if(word.equals(words.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void addToFile(Activity act, String kazakWord, String latinWord) {
        Tools.appendToFile(act, FILENAME, kazakWord + " - " + latinWord);
    }

    public static void addToDictionary(Activity act, String kazakWord, String latinWord) {
        if(!alreadyInList(act, kazakWord, latinWord) && !kazakWord.equals("")) {
            addToFile(act, kazakWord, latinWord);
            Toast.makeText(act, "Менің сөздеріме қосылды", Toast.LENGTH_SHORT).show();
        }
    }

}
