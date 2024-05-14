Feature: Purchase products at opencart

  @successful

  Scenario Outline: Proceso de compra
    #Agregar dos productos y luego visualizar en el carrito
    Given user abre el sitio web de pruebas
    When selecciono un producto a comprar
    Then agrego el producto al carrito del usuario
    And visualizo el carrito

    #Formulario de compras y finalizar
    When ingreso datos <name> <country> <city> <credit_card> <month> <year>
    Then veo formulario

    Examples:
      | name | country | city | credit_card | month | year |
      | david| ecuador | quito| 12345678900 | enero | 2024 |





