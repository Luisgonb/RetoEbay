package com.ebay.pruebas.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com")

public class ConsultarEbayPageObject extends PageObject {

	By txtArticulo =  By.name("_nkw");
	By btnBuscar =  By.id("gh-btn");
	By txtMensaje =  By.xpath("//h1[contains(text(),' resultados para ')]");
	By btnResultado = By.xpath("//h3[contains(text(),'Bicicleta de montaña/bicicleta nueva velocidad ® hombres/mujeres neumático grasa Marcos MTB 26\" Completo suspensi')]");
	By txtPrecio = By.id("mm-saleDscPrc"); 
	By txtContenido =By.xpath("//*[@id=\"content1\"]/p[1]/span[2]/text()");
	By btnAgregar = By.id("isCartBtn_btn");
	By btnCompletar =By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button");
		
	public void escribirArticulo(String buscar) {
		getDriver().findElement(txtArticulo).sendKeys(buscar);
	}

	public void clickEnBuscar() {
		getDriver().findElement(btnBuscar).click();
	}
	
	public void obtenerTextoDeMensaje() {
		String testResultado = getDriver().findElement(txtMensaje);
		System.out.print(testResultado);
		assertThat(getDriver().findElement(txtMensaje).isDisplayed(), Matchers.is(true));
	}
		
	
	
	public void clickEnResultado() {
		getDriver().findElement(btnResultado).click();
		
	}
	public void clickEnAgregar() {
		getDriver().findElement(btnAgregar).click();
	}
	public void clickCompletar() {
		getDriver().findElement(btnCompletar).click();
	//	getDriver().quit();
	}
}