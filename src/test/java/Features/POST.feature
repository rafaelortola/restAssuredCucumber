#language:en
Feature: Realizar um POST para criação de novos usuários

  @smokeTestPost
  Scenario Outline: Validar criação de novo usuário com sucesso
    Given que eu solicite a criacao de um usuario
    And que o usuário informe um nome '<nome>'
    And que informo um email gerado automaticamente
    And que o usuario informe um genero '<genero>'
    And que o usuario informe um status '<status>'
    When submeto a requisição para a api fazer um POST
    Then a API retorna 200
    Examples:
      |nome                |genero|status |
      |alexDADAS           |Female|Active |

  @smokeTestPost
  Scenario Outline: Validar crítica para usuário já existente
    Given que eu solicite a criacao de um usuario
    And que o usuário informe um nome '<nome>'
    And que o usuario informe um email '<email>'
    And que o usuario informe um genero '<genero>'
    And que o usuario informe um status '<status>'
    When submeto a requisição para a api fazer um POST
    Then a API retorna 200
    Examples:
      |nome                |email                    |genero|status |
      |alex_das_123        |123yalex@gmail.com       |Female|Active |

  @smokeTestPostt
  Scenario Outline: Validar crítica de campos vazios
    Given que eu solicite a criacao de um usuario
    And que o usuário informe um nome "<nome>"
    And que o usuario informe um email "<email>"
    And que o usuario informe um genero "<genero>"
    And que o usuario informe um status "<status>"
    When submeto a requisição para a api fazer um POST
    Then a API retorna 200
    And deve exibir a seguinte mensagem "<mensagem>"

    Examples:
      |nome          |email                |genero|status |mensagem      |
      |TESTE         |teste@teste.com.br   |      |Active |can't be blank|
      |TESTE         |teste@teste.com.br   |Female|       |can't be blank|
