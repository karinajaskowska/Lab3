package pl.lublin.wsei.java.cwiczenia;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestInfografika {
    public static void main(String[] args) {
        String exItem = "\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Narodowy Spis Ludności i Mieszkań 2021]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Wed, 09 Mar 2022 08:59:00 +0100]]></pubDate>\n" +
                "\t\t\t<link>\"https://stat.gov.pl/infografiki-widzety/infografiki/infografika-narodowy-spis-ludnosci-i-mieszkan-2021,116,1.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-narodowy-spis-ludnosci-i-mieszkan-2021,116,1.html</guid>\n" +
                "\t\t\t<description><![CDATA[]]></description>\n" +
                "\t\t\t</item>";

        System.out.println("Infografika: ");

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.println("tytul: "+m.group(1));
        else
            System.out.println("Nie znaleziono tytułu ... ");

        Pattern xyz = Pattern.compile("<link>(.*)<link>");
         Matcher n = xyz.matcher(exItem);
        if (n.find())
            System.out.println("adres strony: "+n.group(2));
        else
            System.out.println("Nie znaleziono strony ... ");

        //Pattern qwe = Pattern.compile("<media:content url="([^"]*)"))

        Pattern qaz = Pattern.compile("media:thumbnail url=\"([^\"]*)\"");
        Matcher q = qaz.matcher(exItem);
        if (q.find())
            System.out.println("adres miniaturki: "+q.group(3));
        else
            System.out.println("Nie znaleziono miniaturki ... ");

        //Pattern pat = Pattern.compile("width=\"(.*)\" height");



    }
}