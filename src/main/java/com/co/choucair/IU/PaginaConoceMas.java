package com.co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConoceMas {

    public static final Target TITULO_POR_QUE_SOMOS_SOSTENIBLES = Target.the("Título ¿Por qué somos sostenibles?")
            .located(By.xpath("//h1[@class='titulo' and contains(text(),'¿Por qué somos sostenibles')]"));
}
