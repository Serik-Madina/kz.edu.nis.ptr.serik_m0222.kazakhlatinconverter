package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.app.Activity;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * Created by Abdulmanova_D.ptr on 11.10.2017.
 */

public class Tools
{
    public static void writeToFile(Activity act, String filename, String writeText)
    {
        try {
            FileOutputStream fos = act.openFileOutput(filename, act.MODE_PRIVATE);
            fos.write(writeText.getBytes());
            fos.close();
            //Toast.makeText(act, "Writing success", Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            //Toast.makeText(act, "Writing fail", Toast.LENGTH_SHORT).show();
        }
    }

    public static void appendToFile(Activity act, String filename, String writeText)
    {
        try {
            FileOutputStream fos = act.openFileOutput(filename, act.MODE_APPEND);
            fos.write((writeText+"\n").getBytes());
            fos.close();
            //Toast.makeText(act, "Writing success", Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            //Toast.makeText(act, "Writing fail", Toast.LENGTH_SHORT).show();
        }
    }

    public static String readFromFile(Activity act, String filename)
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(act.openFileInput(filename)));
            String line;
            String txt = "";
            while(( line = br.readLine()) != null )
            {
                txt += line + "\n";
            }

            br.close();
            //Toast.makeText(act, "Reading success" + txt, Toast.LENGTH_SHORT).show();
            return txt;

        }
        catch(Exception ex)
        {
            System.out.println(ex);
            //Toast.makeText(act, "Reading fail", Toast.LENGTH_SHORT).show();
        }
        return "";
    }

    public static String convertKazToLatin(String in)
    {
        String tmp = "";
        for (int i = 0; i < in.length(); i++) {
            tmp += convertKazCharToLatChar("" + in.charAt(i));
        }
        return tmp;
    }

    private static String convertKazCharToLatChar(String in)
    {
        switch(in)
        {
            case "Ә": return "Á";
            case "І": return "I";
            case "Ң": return "Ń";
            case "Ғ": return "Ǵ";
            case "Ү": return "Ú";
            case "Ұ": return "U";
            case "Қ": return "Q";
            case "Ө": return "Ó";
            case "Һ": return "H";
            case "Й": return "I";
            case "Ц": return " ";
            case "У": return "Ý";
            case "К": return "K";
            case "Е": return "E";
            case "Н": return "N";
            case "Г": return "G";
            case "Ш": return "Sh";
            case "Щ": return " ";
            case "З": return "Z";
            case "Х": return "H";
            case "Ъ": return " ";
            case "Ф": return "F";
            case "Ы": return "Y";
            case "В": return "V";
            case "А": return "A";
            case "П": return "P";
            case "Р": return "R";
            case "О": return "O";
            case "Л": return "L";
            case "Д": return "D";
            case "Ж": return "J";
            case "Э": return " ";
            case "Я": return " ";
            case "Ч": return "Ch";
            case "С": return "S";
            case "М": return "M";
            case "И": return "I";
            case "Т": return "T";
            case "Ь": return " ";
            case "Б": return "B";
            case "Ю": return " ";
            case "ә": return "á";
            case "і": return "i";
            case "ң": return "ń";
            case "ғ": return "ǵ";
            case "ү": return "ú";
            case "ұ": return "u";
            case "қ": return "q";
            case "ө": return "ó";
            case "һ": return "h";
            case "й": return "i";
            case "ц": return " ";
            case "у": return "ý";
            case "к": return "k";
            case "е": return "e";
            case "н": return "n";
            case "г": return "g";
            case "ш": return "sh";
            case "щ": return " ";
            case "з": return "z";
            case "х": return "h";
            case "ъ": return " ";
            case "ф": return "f";
            case "ы": return "y";
            case "в": return "v";
            case "а": return "a";
            case "п": return "p";
            case "р": return "r";
            case "о": return "o";
            case "л": return "l";
            case "д": return "d";
            case "ж": return "j";
            case "э": return " ";
            case "я": return " ";
            case "ч": return " ";
            case "с": return "s";
            case "м": return "m";
            case "и": return "i";
            case "т": return "t";
            case "ь": return " ";
            case "б": return "b";
            case "ю": return "ю";
            case " ": return " ";

        }
        return "";
    }
}
