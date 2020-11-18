package com.ebay.pruebas.steps;

//package com.ebay.pruebas.steps;
import com.ebay.pruebas.pageobjects.ConsultarEbayPageObject;

import net.thucydides.core.annotations.Step;
import com.ebay.pruebas.Utils.*;

public class ConsultarEbaySteps {

	ManejoExceptions excepciones = new ManejoExceptions();
	EscribirExcel escribirEnExcel = new EscribirExcel();
	ConsultarEbayPageObject ConsultarEbay = new ConsultarEbayPageObject();

	@Step

	public void manejoDeExcepciones() {
		excepciones.obtenerEstadoConexion();
	}

	@Step

	public void abrirAplicacionDeEbay() {
		ConsultarEbay.open();
	}

	@Step
	public void escribirBuscar(String buscar) {
		ConsultarEbay.escribirArticulo(buscar);
	}

	@Step
	public void clickEnBuscar() {
		ConsultarEbay.clickEnBuscar();
	}

	@Step
	public void obtenerMensaje() {
		ConsultarEbay.obtenerTextoDeMensaje();
	}

	@Step
	public void clickEnResultado() {
		escribirEnExcel.encabezadoExcel();
		escribirEnExcel.ingresarInformacio(ConsultarEbay.clickEnResultado(),"",ConsultarEbay.obtenerPrecio());
				
	}
	@Step
	public void clickEnAgregar() {
		ConsultarEbay.clickEnAgregar();
	}

	@Step
	public void clickEnCompletar() {
		ConsultarEbay.clickCompletar();
	}
}
