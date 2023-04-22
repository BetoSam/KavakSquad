package pages;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class MarcaPage extends DriversFactory {

	public void selecionarMarcaspages(String marcaSelecionada) {
		if (marcaSelecionada.equalsIgnoreCase("aston martin")) {
			marcaSelecionada = "Aston_Martin";
		}
		if (marcaSelecionada.equalsIgnoreCase("audi"))
			marcaSelecionada = "Audi";
		if (marcaSelecionada.equalsIgnoreCase("bentley"))
			marcaSelecionada = "Bentley";
		if (marcaSelecionada.equalsIgnoreCase("bmw"))
			marcaSelecionada = "Bmw";

		if (marcaSelecionada.equalsIgnoreCase("cadillac"))
			marcaSelecionada = "Cadillac";
		if (marcaSelecionada.equalsIgnoreCase("chery"))
			marcaSelecionada = "Chery";
		if (marcaSelecionada.equalsIgnoreCase("chevrolet"))
			marcaSelecionada = "Chevrolet";
		if (marcaSelecionada.equalsIgnoreCase("chrysler"))
			marcaSelecionada = "Chrysler";
		if (marcaSelecionada.equalsIgnoreCase("citroen"))
			marcaSelecionada = "Citroen";
		if (marcaSelecionada.equalsIgnoreCase("dodge"))
			marcaSelecionada = "Dodge";
		if (marcaSelecionada.equalsIgnoreCase("ferrari"))
			marcaSelecionada = "Ferrari";
		if (marcaSelecionada.equalsIgnoreCase("fiat"))
			marcaSelecionada = "Fiat";
		if (marcaSelecionada.equalsIgnoreCase("ford"))
			marcaSelecionada = "Ford";
		if (marcaSelecionada.equalsIgnoreCase("geely"))
			marcaSelecionada = "Geely";
		if (marcaSelecionada.equalsIgnoreCase("gmc"))
			marcaSelecionada = "Gmc";
		if (marcaSelecionada.equalsIgnoreCase("honda"))
			marcaSelecionada = "Honda";
		if (marcaSelecionada.equalsIgnoreCase("hyundai"))
			marcaSelecionada = "Hyundai";
		if (marcaSelecionada.equalsIgnoreCase("jac"))
			marcaSelecionada = "Jac";
		if (marcaSelecionada.equalsIgnoreCase("jaguar"))
			marcaSelecionada = "Jaguar";
		if (marcaSelecionada.equalsIgnoreCase("jeep"))
			marcaSelecionada = "Jeep";
		if (marcaSelecionada.equalsIgnoreCase("kia"))
			marcaSelecionada = "Kia";
		if (marcaSelecionada.equalsIgnoreCase("lamborghini"))
			marcaSelecionada = "Lamborghini";
		if (marcaSelecionada.equalsIgnoreCase("land rover"))
			marcaSelecionada = "Land_Rover";
		if (marcaSelecionada.equalsIgnoreCase("lexus"))
			marcaSelecionada = "Lexus";
		if (marcaSelecionada.equalsIgnoreCase("lifan"))
			marcaSelecionada = "Lifan";
		if (marcaSelecionada.equalsIgnoreCase("lincoln"))
			marcaSelecionada = "Lincoln";
		if (marcaSelecionada.equalsIgnoreCase("mercedes benz"))
			marcaSelecionada = "Mercedes_Benz";
		if (marcaSelecionada.equalsIgnoreCase("mini"))
			marcaSelecionada = "Mini";
		if (marcaSelecionada.equalsIgnoreCase("mitsubishi"))
			marcaSelecionada = "Mitsubishi";
		if (marcaSelecionada.equalsIgnoreCase("nissan"))
			marcaSelecionada = "Nissan";
		if (marcaSelecionada.equalsIgnoreCase("peugeot"))
			marcaSelecionada = "Peugeot";
		if (marcaSelecionada.equalsIgnoreCase("porsche"))
			marcaSelecionada = "Porsche";
		if (marcaSelecionada.equalsIgnoreCase("renault"))
			marcaSelecionada = "Renault";
		if (marcaSelecionada.equalsIgnoreCase("rolls royce"))
			marcaSelecionada = "Rolls-Royce";
		if (marcaSelecionada.equalsIgnoreCase("smart"))
			marcaSelecionada = "Smart";
		if (marcaSelecionada.equalsIgnoreCase("ssangyong"))
			marcaSelecionada = "Ssangyong";
		if (marcaSelecionada.equalsIgnoreCase("subaru"))
			marcaSelecionada = "Subaru";
		if (marcaSelecionada.equalsIgnoreCase("suzuki"))
			marcaSelecionada = "Suzuki";
		if (marcaSelecionada.equalsIgnoreCase("tac"))
			marcaSelecionada = "TAC";
		if (marcaSelecionada.equalsIgnoreCase("tesla"))
			marcaSelecionada = "Tesla";
		if (marcaSelecionada.equalsIgnoreCase("toyota"))
			marcaSelecionada = "Toyota";
		if (marcaSelecionada.equalsIgnoreCase("troller"))
			marcaSelecionada = "Troller";
		if (marcaSelecionada.equalsIgnoreCase("volkswagen"))
			marcaSelecionada = "Volkswagen";
		if (marcaSelecionada.equalsIgnoreCase("volvo"))
			marcaSelecionada = "Volvo";
		{

			driver.findElement(By.xpath("//a[@class='btn-accent btn-brand'][@href='/br/guia-de-precos-de-carros/marca-"
					+ marcaSelecionada + "']")).click();
		}
	}
}
