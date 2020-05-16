pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Test') {
      environment {
        CI = 'true'
      }
      steps {
        sh 'mvn clean install'
      }
    }

  }
}