package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import conexoes.DriversFactory;
import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;
import pages.MarcaPage;

public class TesteNaveguePorMarcas extends DriversFactory {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MarcaPage mcPage = new MarcaPage();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
		metodos.pausa(4000);
		metodos.clicar(el.abaOpcoes);
		metodos.clicar(el.guiaDePrecos);
	}

	@After
	public void fecharNavegador() {
		driver.quit();
	}

	@Test
	public void astonMartins() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("aston martin");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia Aston Martins");

	}

	@Test
	public void bentley() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("bentley");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia Bentley");
	}

	@Test
	public void bmw() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("bmw");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia bmw");
	}

	@Test
	public void cadillac() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("cadillac");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia cadillac");
	}

	@Test
	public void chery() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("chery");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia chery");
	}

	@Test
	public void chevrolet() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("chevrolet");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia chevrolet");
	}

	@Test
	public void crysler() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("chrysler");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia chrysler");
	}

	@Test
	public void citroen() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("citroen");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia cintroen");
	}

	@Test
	public void dodge() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("dodge");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia dodge");
	}

	@Test
	public void ferrari() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("ferrari");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia ferrari");
	}

	@Test
	public void fiat() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("fiat");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia fiat");
	}

	@Test
	public void ford() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("ford");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia ford");
	}

	@Test
	public void geely() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("geely");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia geely");
	}

	@Test
	public void gmc() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("gmc");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia gmc");
	}

	@Test
	public void honda() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("honda");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia honda");
	}

	@Test
	public void hyundai() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("hyundai");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia hyundai");
	}

	@Test
	public void jac() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("jac");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia jac");
	}

	@Test
	public void jaguar() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("jaguar");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia jaguar");
	}

	@Test
	public void jeep() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("jeep");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia jeep");
	}

	@Test
	public void kia() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("kia");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia kia");
	}

	@Test
	public void lamborghini() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("lamborghini");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia lamborghini");
	}

	@Test
	public void landRover() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("land rover");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia Land Rover");
	}

	@Test
	public void lexus() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("lexus");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia lexus");
	}

	@Test
	public void lifan() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("lifan");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia lifan");
	}

	@Test
	public void lincoln() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("lincoln");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia lincoln");
	}

	@Test
	public void mercedesBenz() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("mercedes benz");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia mercedes Benz");
	}

	@Test
	public void mini() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("mini");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia mini");
	}

	@Test
	public void mitsubishi() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("mitsubishi");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia mitsubishi");
	}

	@Test
	public void nissan() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("nissan");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia nissan");
	}

	@Test
	public void pegeot() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("peugeot");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia peugeot");
	}

	@Test
	public void porsche() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("porsche");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia porsche");
	}

	@Test
	public void renault() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("renault");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia renault");
	}

	@Test
	public void rollsRoyce() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("rolls royce");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia Rools Royce");
	}

	@Test
	public void smart() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("smart");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia smart");
	}

	@Test
	public void ssangyong() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("ssangyong");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia ssangyong");
	}

	@Test
	public void subaru() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("subaru");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia subaru");
	}

	@Test
	public void suzuki() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("suzuki");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia suzuki");
	}

	@Test
	public void tac() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("tac");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia tac");
	}

	@Test
	public void tesla() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("tesla");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia tesla");
	}

	@Test
	public void toyota() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("toyota");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia toyota");
	}

	@Test
	public void troller() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("troller");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia troller");
	}

	@Test
	public void volkswagen() {

		metodos.pausa(3000);
		mcPage.selecionarMarcaspages("volkswagen");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia volkswagen");
	}

	@Test
	public void volvo() {

		metodos.pausa(2000);
		mcPage.selecionarMarcaspages("volvo");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia volvo");
	}
}
