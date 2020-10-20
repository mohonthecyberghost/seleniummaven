package com.waltonbd.WebPages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksPage extends BasePage {

	public BrokenLinksPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Broken Link Page Go Method
	 * 
	 * @throws IOException
	 * @throws Exception
	 * 
	 */
	public void verifyLinksPage() throws IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		Set<String> brokenLinkUrls = new HashSet<String>();

		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlconnection;
			httpURLConnection.setConnectTimeout(5000); // miliseconds
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() != 200) {
				brokenLinkUrls.add(linkURL);
			}

			httpURLConnection.disconnect();
		}

		System.err.println(brokenLinkUrls);

	}

	public void verifyImagesPage() throws IOException {

		List<WebElement> images = driver.findElements(By.tagName("img"));

		System.out.println(images.size());

		Set<String> brokenImages = new HashSet<String>();

		for (WebElement image : images) {
			String imageSrc = image.getAttribute("src");
			URL url = new URL(imageSrc);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000); // miliseconds
			httpURLConnection.connect();

			System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode());

//			
//			if (httpURLConnection.getResponseCode() != 200) {
//				brokenImages.add(imageSrc);
//				
//				
//			}

			httpURLConnection.disconnect();

		}

		System.err.println(brokenImages);

	}

	public void verifyImagesPageJSOUP() throws IOException {

		Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
		Elements images = doc.select("img");
		Set<String> brokenImages = new HashSet<String>();
		
		for (Element image : images) {
			String imageSrc = image.attr("src");

			URL url = new URL(imageSrc);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000); // miliseconds
			httpURLConnection.connect();
			
			System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode());

			if (httpURLConnection.getResponseCode() != 200) {
				brokenImages.add(imageSrc);

				System.out.println(imageSrc);
			}

			httpURLConnection.disconnect();

		}

		

		System.err.println(brokenImages);

	}

}
