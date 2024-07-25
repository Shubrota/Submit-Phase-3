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
	cd C:\Shubrota\caltech\phase 4\Submit-Phase-3\TaxiBooking
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