package com.internshala.javaapp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws IOException{
        String url = "https://www.worldometers.info/coronavirus/#countries";
        Document page = Jsoup.connect(url).userAgent("Mozilla").get();
        String worldDataSelector = "#maincounter-wrap > div";
        String indiaDataSelector = "#main_table_countries_today > tbody:nth-child(2) > tr:nth-child(41)";


        Elements worldDataElements = page.select(worldDataSelector);
        ArrayList<String> worldDataTitles = new ArrayList<>();

        for(Element e:worldDataElements) {
            worldDataTitles.add(e.text());
        }

        System.out.println(worldDataTitles);

        Elements indiaDataElements = page.select(indiaDataSelector);
        ArrayList<String> indiaDataTitles = new ArrayList<>();

        for(Element e:indiaDataElements) {
            indiaDataTitles.add(e.text());
        }

        System.out.println(indiaDataTitles);


    }

}
