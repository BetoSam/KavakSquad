package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import conexoes.DriversFactory;
import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;
import pages.LojaPage;
import pages.MarcaPage;

public class TesteAondeEstamos extends DriversFactory {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MarcaPage mcPage = new MarcaPage();
	LojaPage ljPage = new LojaPage();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
		metodos.pausa(4000);
		metodos.clicar(el.abaOpcoes);
		metodos.clicar(el.aondeEstamos);
	}

	@After
	public void fecharNavegador() {
		driver.quit();
	}

	@Test
	public void AondeEstamos() {
		metodos.pausa(2000);
		metodos.clicar(el.kavakHub);
		metodos.pausa(3000);
		metodos.evidencias("evidencia kavak HUb");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping itaquera");
		metodos.pausa(3000);
		metodos.evidencias("evidencia Shopping itaquera");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping golden square");
		metodos.pausa(3000);
		metodos.evidencias("evidencia shopping golden square ");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping tucuruvi");
		metodos.pausa(3000);
		metodos.evidencias("evidencia shopping tucuruvi ");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping sp market");
		metodos.pausa(3000);
		metodos.evidencias("evidencia shopping sp market ");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("iguatemi campinas");
		metodos.pausa(3000);
		metodos.evidencias("evidencia iguatemi campinas ");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("nova america");
		metodos.pausa(3000);
		metodos.evidencias("evidencia nova america");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping barreiro");
		metodos.pausa(3000);
		metodos.evidencias("evidencia shopping barreiro");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("galeao edificio garagem t2");
		metodos.pausa(3000);
		metodos.evidencias("evidencia galeao edificio garagem t2");
		metodos.refresh();
		metodos.pausa(2000);
		ljPage.selecionarLojasPages("shopping plaza sul");
		metodos.pausa(3000);
		metodos.evidencias("evidencia shopping plaza sul");

	}
}
