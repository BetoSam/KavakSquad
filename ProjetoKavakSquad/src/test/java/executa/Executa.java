package executa;

import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		String url = "https://www.kavak.com/br";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webDriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory","jdk-http-client");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
	
	
	

