package com.ebay.pruebas.stepdefinitions;

import java.util.List;

import com.ebay.pruebas.models.Consulta;
import com.ebay.pruebas.steps.ConsultarEbaySteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ConsultarProductoEbay {

	@Steps
	ConsultarEbaySteps InicioConsulta;

	@Dado("^que estoy en la pagina de inicio ebay e ingreso la el articulo$")
	public void queEstoyEnLaPaginaDeInicioEbayEIngresoLaElArticulo() {
		InicioConsulta.abrirAplicacionDeEbay();
	}

	@Cuando("^selecciono la opcion buscar$")
	public void seleccionoLaOpcionBuscar(List<Consulta> listaConsulta) {
		InicioConsulta.escribirBuscar(listaConsulta.get(0).getBuscar());
		InicioConsulta.clickEnBuscar();
		InicioConsulta.clickEnResultado();
		InicioConsulta.clickEnAgregar();
		InicioConsulta.clickEnCompletar();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Entonces("^valido que aparezca el mensaje  (.*)$")
	public void validoQueAparezcaElMensaje(String arg1) {
		

	}

}
