package pages;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class LojaPage extends DriversFactory {

	public void selecionarLojasPages(String lojaSelecionada) {
		if (lojaSelecionada.equalsIgnoreCase("shopping itaquera")) {
			lojaSelecionada = "shopping-itaquera";
		}
		if (lojaSelecionada.equalsIgnoreCase("shopping golden square")) {
			lojaSelecionada = "shopping-golden-square";
		}
		if (lojaSelecionada.equalsIgnoreCase("shopping tucuruvi")) {
			lojaSelecionada = "shopping-tucuruvi";
		}
		if (lojaSelecionada.equalsIgnoreCase("shopping sp market")) {
			lojaSelecionada = "shopping-sp-market";
		}
		if (lojaSelecionada.equalsIgnoreCase("iguatemi campinas")) {
			lojaSelecionada = "iguatemi-campinas";
		}
		if (lojaSelecionada.equalsIgnoreCase("nova america")) {
			lojaSelecionada = "nova-américa";
		}
		if (lojaSelecionada.equalsIgnoreCase("shopping barreiro")) {
			lojaSelecionada = "via-shopping-barreiro";
		}
		if (lojaSelecionada.equalsIgnoreCase("galeao edificio garagem t2")) {
			lojaSelecionada = "galeao-edifício-garagem-t2";
		}

		if (lojaSelecionada.equalsIgnoreCase("shopping plaza sul")) {
			lojaSelecionada = "shopping-plaza-sul";
		}
		driver.findElement(By.xpath(
				"//kavak-button [@class='btn-see-details sc-kavak-button-h sc-kavak-button-s hydrated'][@data-cy-key='btn-hub-card-kavak-"
						+ lojaSelecionada + "']"))
				.click();
	}
}
