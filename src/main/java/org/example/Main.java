package org.example;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

       //downloading the target website with an HTTP GET request
        Document doc= Jsoup.connect("https://quotes.toscrape.com/")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").get();
// getting the ".quote" HTML element
        Elements quotes = doc.getElementsByClass("quote");
// Iterating through each quote element
        for (Element quote : quotes) {
            // Extracting the text of the quote
            String quoteText = quote.select(".text").text();

            // Extracting the author of the quote
            String author = quote.select(".author").text();

            // Printing the quote and author
            System.out.println("Quote: " + quoteText);
            System.out.println("Author: " + author);
            System.out.println();
      /*  Document doc= Jsoup.connect("https://surfcaptain.com/forecast/trestles-california")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").get(); */

        // selecting all <div> HTML elements
      /*  Elements divs = doc.getElementsByTag("div");
        System.out.println(divs.toString());  */
    }
}}