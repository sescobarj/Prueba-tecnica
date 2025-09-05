package com.co.choucair.questions;

import com.co.choucair.ui.PaginaConoceMas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificarTituloConoceMas implements Question<Boolean> {

    public static VerificarTituloConoceMas esVisible() {
        return new VerificarTituloConoceMas();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(PaginaConoceMas.TITULO_POR_QUE_SOMOS_SOSTENIBLES, isVisible()).forNoMoreThan(10).seconds()
        );
        return PaginaConoceMas.TITULO_POR_QUE_SOMOS_SOSTENIBLES.resolveFor(actor).isVisible();
    }
}


