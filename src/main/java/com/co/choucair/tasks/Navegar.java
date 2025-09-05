package com.co.choucair.tasks;

import com.co.choucair.ui.MenuPrincipal;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar {

    public static Task aSeccion(String seccion) {
        return Task.where("{0} navega a la sección " + seccion,
                Click.on(MenuPrincipal.SECCION_ACERCA_DE_NOSOTROS)
        );
    }

    public static Task aSubSeccion(String subSeccion) {
        return Task.where("{0} accede a " + subSeccion,
                Click.on(MenuPrincipal.SUBSECCION_INFORMACION_CORPORATIVA)
        );
    }

    public static Task aSostenibilidad(String sostenibilidad) {
        return Task.where("{0} ingresa a la sección " + sostenibilidad,
                Click.on(MenuPrincipal.SECCION_SOSTENIBILIDAD)
        );
    }
}

