package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Surf_Captain3 {
    public static void main(String[] args) {
        String[] SCurl = {
                "https://surfcaptain.com/forecast/san-onofre-california",
                "https://surfcaptain.com/forecast/trestles-california/",
                "https://surfcaptain.com/forecast/san-clemente-california/",
                "https://surfcaptain.com/forecast/dana-point-california/",
                "https://surfcaptain.com/forecast/laguna-beach-california/",
                "https://surfcaptain.com/forecast/newport-beach-california/",
                "https://surfcaptain.com/forecast/huntington-beach-california/",
                "https://surfcaptain.com/forecast/seal-beach-california/",
                "https://surfcaptain.com/forecast/oceanside-california/",
                "https://surfcaptain.com/forecast/carlsbad-california/"
        };

        try {
            for (int i = 0; i < SCurl.length; i++) {
                Document scConnect = Jsoup.connect(SCurl[i])
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").get();

                Element div = scConnect.getElementById("fcst-current-title");
                if (div != null) {
                    String text = div.text();
                   // System.out.println("Fetched text for location #" + i + ": " + text);

                    // Regular expression to match wave height patterns
                    Pattern pattern = Pattern.compile("(\\d+-\\d+\\+?|\\d+\\+?) ft");
                    Matcher matchedText = pattern.matcher(text);

                    if (matchedText.find()) {
                        String waveHeight = matchedText.group(1);
                        System.out.println("Current Wave height at location #" + i + ": " + waveHeight);
                    } else {
                        System.out.println("Wave height not found at location #" + i);
                    }
                } else {
                    System.out.println("Element not found at location #" + i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
