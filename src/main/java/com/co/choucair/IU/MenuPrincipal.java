package com.co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPrincipal {

    public static final Target SECCION_ACERCA_DE_NOSOTROS = Target.the("Acerca de nosotros")
            .located(By.xpath("//a[contains(text(),'Acerca de nosotros')]"));

    public static final Target SUBSECCION_INFORMACION_CORPORATIVA = Target.the("Información Corporativa")
            .located(By.xpath("//a[contains(text(),'Información Corporativa')]"));

    public static final Target SECCION_SOSTENIBILIDAD = Target.the("Sostenibilidad")
            .located(By.xpath("//a[contains(text(),'Sostenibilidad')]"));
}



