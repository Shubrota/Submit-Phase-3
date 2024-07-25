#!groovy

pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent any {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      agent any
      steps {
        sh 'docker build -t shubrota/TaxiBooking:latest .'
      }
    }
  }
}