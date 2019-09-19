package io.prakash;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Junit5Demo {

	public void open(String URL) {
		System.setProperty("webdriver.ie.driver", "lib" + File.separator + "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get(URL);
	}

	public int div(int a, int b) {
		return a / b;
	}
}
