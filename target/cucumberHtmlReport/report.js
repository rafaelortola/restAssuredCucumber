$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/GET.feature");
formatter.feature({
  "name": "Realizar um GET para busca de dados de pessoas",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validar dados do cliente com sucesso",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeTestGet"
    }
  ]
});
formatter.step({
  "name": "que o usuário informe um id \u003cid\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "submeto a requisição para a api fazer um GET",
  "keyword": "When "
});
formatter.step({
  "name": "a API retorna status de sucesso \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "deve assumir no campo name o valor \"\u003cnome\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "statusCode",
        "nome"
      ]
    },
    {
      "cells": [
        "1548",
        "200",
        "Usuario Teste Delete"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar dados do cliente com sucesso",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeTestGet"
    }
  ]
});
formatter.step({
  "name": "que o usuário informe um id 1548",
  "keyword": "Given "
});
formatter.match({
  "location": "GetSteps.informarId(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto a requisição para a api fazer um GET",
  "keyword": "When "
});
formatter.match({
  "location": "GetSteps.submeterRequisicao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a API retorna status de sucesso 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"a API retorna status de sucesso 200\" matches more than one step definition:\n  \"^a API retorna (.*?)$\" in PostSteps.retornaStatusSucessoPOST(Integer)\n  \"^a API retorna status de sucesso (.*?)$\" in GetSteps.retornaStatusSucessoGET(Integer)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:80)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "deve assumir no campo name o valor \"Usuario Teste Delete\"",
  "keyword": "And "
});
formatter.match({
  "location": "GetSteps.validaDadosDeRetornoCampoName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validar dados do cliente com insucesso 404 - not found",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeTestGet"
    }
  ]
});
formatter.step({
  "name": "que o usuário informe um id \u003cid\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "submeto a requisição para a api fazer um GET",
  "keyword": "When "
});
formatter.step({
  "name": "a API retorna status de insucesso",
  "keyword": "Then "
});
formatter.step({
  "name": "deve exibir a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "mensagem"
      ]
    },
    {
      "cells": [
        "1498",
        "Resource not founb"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar dados do cliente com insucesso 404 - not found",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeTestGet"
    }
  ]
});
formatter.step({
  "name": "que o usuário informe um id 1498",
  "keyword": "Given "
});
formatter.match({
  "location": "GetSteps.informarId(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto a requisição para a api fazer um GET",
  "keyword": "When "
});
formatter.match({
  "location": "GetSteps.submeterRequisicao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a API retorna status de insucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "PostSteps.retornaStatusSucessoPOST(Integer)"
});
formatter.result({
  "error_message": "cucumber.deps.com.thoughtworks.xstream.converters.ConversionException: Couldn\u0027t convert \"status de insucesso\" to an instance of: [class java.lang.Integer, int]\n---- Debugging information ----\n-------------------------------\r\n\tat cucumber.runtime.xstream.ConverterWithFormat.transform(ConverterWithFormat.java:31)\r\n\tat cucumber.runtime.xstream.ConverterWithNumberFormat.transform(ConverterWithNumberFormat.java:18)\r\n\tat cucumber.runtime.xstream.ConverterWithNumberFormat.transform(ConverterWithNumberFormat.java:8)\r\n\tat cucumber.api.Transformer.fromString(Transformer.java:91)\r\n\tat cucumber.deps.com.thoughtworks.xstream.converters.SingleValueConverterWrapper.fromString(SingleValueConverterWrapper.java:41)\r\n\tat cucumber.runtime.ParameterInfo.convert(ParameterInfo.java:164)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:74)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\n\tat ✽.a API retorna status de insucesso(src/test/java/Features/GET.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "deve exibir a mensagem \"Resource not founb\"",
  "keyword": "And "
});
formatter.match({
  "location": "GetSteps.validaMensagemRetorno404NotFound(String)"
});
formatter.result({
  "status": "skipped"
});
});