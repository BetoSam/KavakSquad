package teste;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;
import pages.CarrosDoCatalogoPage;
import pages.LojaPage;
import pages.MarcaPage;

public class TesteBlog {

	

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
		metodos.clicar(el.blog);
	}
	@Test
	public void conhecaNossosCarros() {
	metodos.pausa(1000);	
	metodos.clicar(el.chCarros);
	}
	
}
