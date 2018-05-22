package Palindrom.kchardy.com.github;
/**
 * @author kchardy
 */
public class Palindrom {
    /**
     * metoda sluzy do sprawdzania czy podany tekst jest palindromem
     * @param tekst przykladowe slowo
     * @return true albo false
     */
    public static Boolean czyPalindrom(String tekst)
    {
        Boolean wynik = true;

        if(tekst == null)
            return null;

        if(tekst.length()==0)
            return null;

        for(int i = 0, j = tekst.length()-1; i <=j; i++, j--)
        {
            if(Character.toLowerCase(tekst.charAt(i)) == Character.toLowerCase(tekst.charAt(j)))
                wynik = true;
            else
            {
                wynik = false;
                break;
            }
        }
        return wynik;
    }
}
