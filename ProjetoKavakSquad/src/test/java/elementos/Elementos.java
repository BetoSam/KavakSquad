package elementos;

import org.openqa.selenium.By;

public class Elementos {
	public By abaOpcoes = By.xpath("//button[@class='navbar-action btn-dropdown expand'][@data-cy='nav-about-us']");
	public By guiaDePrecos = By.xpath("//a[@class='navbar-action dropdown-item'][@href='/br/guia-de-precos-de-carros']");
	public By astonMartin = By.xpath("//a[@class='btn-accent btn-brand'][@href='/br/guia-de-precos-de-carros/marca-Aston_Martin']");
	public By aondeEstamos  =By.xpath("//a[@class='navbar-action dropdown-item'][@href='/br/locais']");
	public By kavakHub = By.xpath("//button[@class='btn-white-alt sc-kavak-button'][@data-cy='btn-hub-card-hub-kavak-city']");
	public By kavakItaquera = By.xpath("//kavak-button [@class='btn-see-details sc-kavak-button-h sc-kavak-button-s hydrated'][@data-cy-key='btn-hub-card-kavak-shopping-itaquera']");
	public By conversivel =By.xpath("//a[@class='btn-accent btn-body-type'][@href='/br/guia-de-precos-de-carros/tipo-Conversivel']");
	public By chCarros = By.xpath("//a[@data-cy='nav-main-menu-category-option'][@href='/br/blog/categorias/tudo-sobre-carros']");
	public By blog = By.xpath("//a[@class='navbar-action dropdown-item'][@href='/br/blog']");
}
