package com.co.choucair.tasks;

import com.co.choucair.ui.AvisoPrivacidad;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarAvisoPrivacidad implements Task {

    public static CerrarAvisoPrivacidad cerrar() {
        return instrumented(CerrarAvisoPrivacidad.class);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AvisoPrivacidad.BOTON_ENTENDIDO)
        );
    }
}
