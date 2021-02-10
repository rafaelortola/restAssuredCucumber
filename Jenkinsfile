pipeline {
    agent any
      stages {
        stage ('Executando Testes') {
         steps {
          git branch: 'main', url: 'https://github.com/rafaelortola/restAssuredCucumber.git'
          bat 'mvn test'
          }
        }
      }
    }

