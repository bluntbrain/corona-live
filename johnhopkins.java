package com.internshala.javaapp;
import java.util.ArrayList;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class johnhopkins {

	public static void main(String[] args) throws IOException{
		String url = "https://www.mohfw.gov.in/";
		Document page = Jsoup.connect(url).userAgent("Mozilla").get();
		String indiaDataSelectorDeath = "body > div.main-section > div > div.contribution.col-sm-9 > div > div > div:nth-child(4) > div > span";
		String indiaDataSelectorActive = "body > div.main-section > div > div.contribution.col-sm-9 > div > div > div:nth-child(2) > div > span";
		String indiaDataSelectorRecovered = "body > div.main-section > div > div.contribution.col-sm-9 > div > div > div:nth-child(3) > div > span";
		String indiaDataSelectorMigrated = "body > div.main-section > div > div.contribution.col-sm-9 > div > div > div:nth-child(5) > div > span";


		Elements indiaDataDealth = page.select(indiaDataSelectorDeath);
		ArrayList<String> indiaDataDeath2 = new ArrayList<>();

		for(Element e:indiaDataDealth) {
			indiaDataDeath2.add((e.text()));
		}

		Elements indiaDataMigrated = page.select(indiaDataSelectorMigrated);
		ArrayList<String> indiaDataMigrated2 = new ArrayList<>();

		for(Element e:indiaDataMigrated) {
			indiaDataMigrated2.add((e.text()));
		}

		Elements indiaDataActive = page.select(indiaDataSelectorActive);
		ArrayList<String> indiaDataActive2 = new ArrayList<>();

		for(Element e:indiaDataActive) {
			indiaDataActive2.add((e.text()));
		}

		Elements indiaDataRecovered = page.select(indiaDataSelectorRecovered);
		ArrayList<String> indiaDataRecovered2 = new ArrayList<>();

		for(Element e:indiaDataRecovered) {
			indiaDataRecovered2.add((e.text()));
		}

		System.out.println(indiaDataDeath2);
		System.out.println(indiaDataRecovered2);
		System.out.println(indiaDataActive2);
		System.out.println(indiaDataMigrated2);


		//total will be sum of all variables


	}

}
