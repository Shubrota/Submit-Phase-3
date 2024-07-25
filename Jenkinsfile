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
        bat 'mvn clean install'
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