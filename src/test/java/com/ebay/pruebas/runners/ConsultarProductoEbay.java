package com.ebay.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\ebay\\pruebas\\features\\ConsultarProductoEbay.feature",
glue="com.ebay.pruebas.stepdefinitions",
snippets=SnippetType.CAMELCASE)

public class ConsultarProductoEbay {

}
