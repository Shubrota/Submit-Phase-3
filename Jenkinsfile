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
	call mvn install -f c:\Shubrota\caltech\phase 4\Submit-Phase-3\TaxiBooking\pom.xml
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