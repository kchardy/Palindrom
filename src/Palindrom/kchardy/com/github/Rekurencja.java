package Palindrom.kchardy.com.github;


/**
 * @author kchardy
 */

public class Rekurencja {
    /**
     * metoda sluzy do sprawdzania czy podany tekst jest palindromem za pomoca rekurencji
     * @param tekst przykladowe slowo
     * @return true albo false
     */
    public static Boolean czyPalindrom(String tekst)
    {
        if(tekst == null || tekst.equals("")) return null;
        String nowy = "" ;
        if(Character.toLowerCase(tekst.charAt(0)) == Character.toLowerCase(tekst.charAt(tekst.length()-1)))
        {
            nowy = tekst.substring(1,tekst.length()-1);
            if(nowy.length()>2)
                return czyPalindrom(nowy);
            else
                return true;
        }
        else
            return false;
    }
}
