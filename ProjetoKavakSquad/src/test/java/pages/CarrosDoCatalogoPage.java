package pages;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class CarrosDoCatalogoPage extends DriversFactory {

	public void selecionarModeloCarros(String carroSelecionado) {
		if (carroSelecionado.equalsIgnoreCase("conversivel")) {
			carroSelecionado = "Conversivel";
		}
		if (carroSelecionado.equalsIgnoreCase("coupe")) {
			carroSelecionado = "Coupe";
		}
		if (carroSelecionado.equalsIgnoreCase("hatch back")) {
			carroSelecionado = "Hatch_Back";
		}
		if (carroSelecionado.equalsIgnoreCase("van")) {
			carroSelecionado = "Van";
		}
		if (carroSelecionado.equalsIgnoreCase("minivan")) {
			carroSelecionado = "Minivan";
		}
		if (carroSelecionado.equalsIgnoreCase("seda")) {
			carroSelecionado = "Seda";
		}
		if (carroSelecionado.equalsIgnoreCase("suv")) {
			carroSelecionado = "SUV";
		}
		if (carroSelecionado.equalsIgnoreCase("pick-up")) {
			carroSelecionado = "Pick-Up";
		}
		if (carroSelecionado.equalsIgnoreCase("wagon")) {
			carroSelecionado = "Wagon";
		}
		driver.findElement(By.xpath("//a[@class='btn-accent btn-body-type'][@href='/br/guia-de-precos-de-carros/tipo-"
				+ carroSelecionado + "']")).click();

	}
}
