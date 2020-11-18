package com.ebay.pruebas.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com")

public class ConsultarEbayPageObject extends PageObject {

	By txtArticulo = By.name("_nkw");
	By btnBuscar = By.id("gh-btn");
	By txtMensaje = By.xpath("//h1[contains(text(),' resultados para ')]");
	By txtPrecio = By.xpath("//span[normalize-space()='COP $1 916 606.63']");
	By btnResultado = By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a");
	By txtContenido = By.xpath("//*[@id=\"content1\"]/p[1]/span[2]");
	By btnAgregar = By.id("isCartBtn_btn");
	By btnCompletar = By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button");

	String resultado = null;
	String precio = null;
	String contenido = null;

	public void escribirArticulo(String buscar) {
		getDriver().findElement(txtArticulo).sendKeys(buscar);
	}

	public void clickEnBuscar() {
		getDriver().findElement(btnBuscar).click();
	}

	public void obtenerTextoDeMensaje() {
		assertThat(getDriver().findElement(txtMensaje).isDisplayed(), Matchers.is(true));
	}

	public String obtenerPrecio() {
		precio = getDriver().findElement(txtPrecio).getText();
		System.out.print(precio);
		return (precio);
	}

	public String clickEnResultado() {
		resultado = getDriver().findElement(btnResultado).getText();
		System.out.print(resultado);
		getDriver().findElement(btnResultado).click();
		return (resultado);
	}

	public void clickEnAgregar() {
		getDriver().findElement(btnAgregar).click();
	}

	public void clickCompletar() {
		getDriver().findElement(btnCompletar).click();
		// getDriver().quit();
	}
}