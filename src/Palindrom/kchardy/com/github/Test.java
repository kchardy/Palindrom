package Palindrom.kchardy.com.github;
/**
 * @author kchardy
 */
public class Test {

    public static void main(String[] args) {


        System.out.println("Palindrom Bez rekurencji");

        System.out.println("null: "+Palindrom.czyPalindrom(null));
        System.out.println("\"\": "+Palindrom.czyPalindrom(""));
        System.out.println("kajak: "+ Palindrom.czyPalindrom("kajak"));
        System.out.println("kalka: "+ Palindrom.czyPalindrom("kalka"));
        System.out.println("zaradnydyndaraz: "+ Palindrom.czyPalindrom("zaradnydyndaraz"));
        System.out.println("comidałduchcudładimoc: " + Palindrom.czyPalindrom("comidałduchcudładimoc"));
        System.out.println("devillived: "+ Palindrom.czyPalindrom("devillived"));
        System.out.println("a: "+ Palindrom.czyPalindrom("a"));

        System.out.println("\nPalindrom z rekurencją");

        System.out.println("null: "+Palindrom.czyPalindrom(null));
        System.out.println("\"\": "+Palindrom.czyPalindrom(""));
        System.out.println("kajak: "+ Rekurencja.czyPalindrom("kajak"));
        System.out.println("kalka: "+ Rekurencja.czyPalindrom("kalka"));
        System.out.println("oko: "+ Rekurencja.czyPalindrom("oko"));
        System.out.println("Anna: "+ Rekurencja.czyPalindrom("Anna"));
        System.out.println("zaradnydyndaraz: "+ Rekurencja.czyPalindrom("zaradnydyndaraz"));
        System.out.println("devillived: "+ Rekurencja.czyPalindrom("devillived"));
        System.out.println("comidałduchcudładimoc: " + Rekurencja.czyPalindrom("comidałduchcudładimoc"));

    }
}
