package metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
}
	
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).click();
}
	public void evidencias(String evidencia) {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File srcDest = new File("./evidencias/" + evidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, srcDest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
}public void refresh(){
	driver.navigate().refresh();
	Actions actionObject = new Actions(driver);
	actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();


}
	
	

}