package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import pl.lublin.wsei.java.cwiczenia.TestInfografika;

public class Infografika {
    public String tytul;

    public Infografika(String item) {
    }

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("<tittle><!\\[CDATA\\[(.*)\\]\\]");
        CharSequence tekst = null;
        Matcher m = pat.matcher(tekst);
        String tytul;
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "";

        pat = Pattern.compile("<link>(.*)<link>");
        m = pat.matcher(tekst);
        String adresStrony;
        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";

        pat = Pattern.compile("media:thumbnail url=\"([^\"]*)\"");
        m = pat.matcher(tekst);
        String adresMiniaturki;
        if (m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(tekst);
        int szerokosc;
        if (m.find())
            szerokosc = Integer.parseInt(m.group(1));
        else
            szerokosc = 0;
    }
}
