Feature: Realizar um GET para busca de dados de pessoas

  @smokeTestGet
  Scenario Outline: Validar dados do cliente com sucesso
    Given que o usuário informe um id <id>
    When submeto a requisição para a api fazer um GET
    Then a API retorna status de sucesso <statusCode>
    And deve assumir no campo name o valor "<nome>"
    Examples:
    |id    |statusCode |nome                |
    |1548  |200        |Usuario Teste Delete|

  @smokeTestGet
  Scenario Outline: Validar dados do cliente com insucesso 404 - not found
    Given que o usuário informe um id <id>
    When submeto a requisição para a api fazer um GET
    Then a API retorna status de insucesso
    And deve exibir a mensagem "<mensagem>"
    Examples:
      |id    |mensagem           |
      |1498  |Resource not founb |