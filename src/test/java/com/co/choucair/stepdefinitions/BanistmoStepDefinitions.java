package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.CerrarAvisoPrivacidad;
import com.co.choucair.tasks.Navegar;
import com.co.choucair.tasks.IrAConoceMas;
import com.co.choucair.questions.VerificarTituloConoceMas;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class BanistmoStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario abre el sitio web de Banistmo")
    public void abrirSitioWeb() {
        OnStage.theActorCalled("Sergio").wasAbleTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"),
                CerrarAvisoPrivacidad.cerrar()
        );
    }

    @When("navega a la sección {string}")
    public void navegarASeccion(String seccion) {
        OnStage.theActorInTheSpotlight().attemptsTo(Navegar.aSeccion(seccion));
    }

    @And("accede a {string}")
    public void accederAInformacion(String subSeccion) {
        OnStage.theActorInTheSpotlight().attemptsTo(Navegar.aSubSeccion(subSeccion));
    }

    @And("ingresa a la sección {string}")
    public void ingresarASostenibilidad(String sostenibilidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(Navegar.aSostenibilidad(sostenibilidad));
    }

    @And("el usuario hace clic en el botón Conoce más")
    public void clickEnConoceMas() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrAConoceMas.click());
    }

    @Then("el usuario debería estar en la página de ¿Por qué somos sostenibles?")
    public void validarRedireccion() {
        OnStage.theActorInTheSpotlight().should(seeThat(VerificarTituloConoceMas.esVisible()));
    }
}





