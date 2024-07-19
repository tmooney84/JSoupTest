/*package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Surf_Captain2 {
    public static void main(String[] args) {
        String[] SCurl = new String[10];
        SCurl[0] = "https://surfcaptain.com/forecast/san-onofre-california";
        SCurl[1] = "https://surfcaptain.com/forecast/trestles-california/";
        SCurl[2] = "https://surfcaptain.com/forecast/san-clemente-california/";
        SCurl[3] = "https://surfcaptain.com/forecast/dana-point-california/";
        SCurl[4] = "https://surfcaptain.com/forecast/laguna-beach-california/";
        SCurl[5] = "https://surfcaptain.com/forecast/newport-beach-california/";
        SCurl[6] = "https://surfcaptain.com/forecast/huntington-beach-california/";
        SCurl[7] = "https://surfcaptain.com/forecast/seal-beach-california/";
        SCurl[8] = "https://surfcaptain.com/forecast/oceanside-california/";
        SCurl[9] = "https://surfcaptain.com/forecast/carlsbad-california/";

        try {
            for (int i = 0; i < 10; i++) {
                Document scConnect = Jsoup.connect(SCurl[i])
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").get();

                Element div = scConnect.getElementById("fcst-current-title");
                if (div != null) {
                    String text = div.text();

                    // Regular expression to match wave height patterns
                    Pattern pattern = Pattern.compile("(\\d+-\\d+\\+?|d+) ft");
                    Matcher matcher = pattern.matcher(text);

                    if (matcher.find()) {
                        String waveHeight = matcher.group(1);
                        System.out.println("Current Wave height at location #" + i + " " + waveHeight);
                    } else {
                        System.out.println("Wave height not found.");
                    }
                } else {
                    System.out.println("Element not found.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
/*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

Document scConnect1 = Jsoup.connect(SCurl[0])
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").get();

        Element div1 = scConnect1.getElementById("summary-ampm-txt cell auto");
        for (Element number : div1) {
            String text = div1.text();

            // Regular expression to match wave height patterns
            Pattern pattern = Pattern.compile("(\\d+-\\d+\\+?|d+) ft");
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                String waveHeight = matcher.group(1);
                System.out.println("Current Wave height at location #" + "0" + " " + waveHeight);
            } else {
                System.out.println("Wave height not found.");
            }
        }
    }
}  */