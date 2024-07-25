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
	  call mvn clean install
      }
    }
    stage('Docker Build')
    {
      agent any
      steps 
      {
        call docker build -t shubrota/TaxiBooking:latest .
      }
    }
  }
}