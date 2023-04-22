package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import conexoes.DriversFactory;
import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;
import pages.CarrosDoCatalogoPage;
import pages.LojaPage;
import pages.MarcaPage;

public class DescubraOsCarrosDoNssoCatálogoPorCategoria extends DriversFactory {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MarcaPage mcPage = new MarcaPage();
	LojaPage ljPage = new LojaPage();
	CarrosDoCatalogoPage carPage = new CarrosDoCatalogoPage();

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
	public void modeloConversivel() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("conversivel");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia conversivel");
	}
	@Test
	public void modeloCoupe() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("coupe");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia coupe");
	}
	@Test
	public void modeloHatchback() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("hatch back");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia hatch back");
	}@Test
	public void modeloVan() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("van");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia van");
	}@Test
	public void modeloMinivan() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("minivan");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia minivan");
	}@Test
	public void modeloSeda() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("seda");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia Seda");
	}@Test
	public void modeloSuv() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("suv");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia suv");
	}@Test
	public void modeloPickUp() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("pick-up");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia pick-up");
	}@Test
	public void modeloWagon() {
		metodos.pausa(2000);
		carPage.selecionarModeloCarros("wagon");
		metodos.pausa(5000);
		metodos.evidencias("Evidencia wagon");
	}
	
}
	
	
	
	
	
	

