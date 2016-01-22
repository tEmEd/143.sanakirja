package sanakirja;

public class Main {

    public static void main(String[] args) {
        MuistavaSanakirja sanakirja = new MuistavaSanakirja("src/sanat.txt");
        boolean asdasd = sanakirja.lataa();

        if (asdasd) {
            System.out.println("sanakirjan lataaminen onnistui");
        }

        sanakirja.lisaa("apina", "monkey");
        sanakirja.lisaa("banaani", "banana");
        sanakirja.lisaa("apina", "apfe");

        System.out.println(sanakirja.kaanna("apina"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("alla oleva"));
    
    }
}
