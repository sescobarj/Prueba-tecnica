package com.co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementoSostenibilidad {

    public static final Target TITULO = Target.the("Título de Sostenibilidad")
            .located(By.xpath("//h1[contains(text(),'Sostenibilidad')]"));

    public static final Target BOTON_CONOCE_MAS = Target.the("Botón Conoce más")
            .located(By.xpath("//a[@class='btn btn-primary' and contains(text(),'Conoce más')]"));

}
