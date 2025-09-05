package com.co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AvisoPrivacidad {
    public static final Target BOTON_ENTENDIDO = Target.the("Botón Entendido del aviso de privacidad")
            .located(By.xpath("//button[@id='btn-aceptar-cookies']"));
}

