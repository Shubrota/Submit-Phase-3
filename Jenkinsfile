#!groovy

pipeline 
{
    agent any
  stages 
  {
    stage("Build") 
    {
      steps 
      {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build')
    {
      agent any
      steps 
      {
        bat 'docker build -t shubrota/TaxiBooking:latest .'
      }
    }
  }
}