package com.co.choucair.tasks;

import com.co.choucair.ui.ElementoSostenibilidad;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAConoceMas implements Task {

    public static IrAConoceMas click() {
        return instrumented(IrAConoceMas.class);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementoSostenibilidad.BOTON_CONOCE_MAS)
        );
    }
}
