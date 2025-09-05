@sostenibilidad
Feature: Navegación a sección de Sostenibilidad

  Scenario: Usuario accede a la sección de ¿Por qué somos sostenibles?
    Given el usuario abre el sitio web de Banistmo
    When navega a la sección "Acerca de nosotros"
    And accede a "Información Corporativa"
    And ingresa a la sección "Sostenibilidad"
    And el usuario hace clic en el botón Conoce más
    Then el usuario debería estar en la página de ¿Por qué somos sostenibles?

