#!groovy
pipeline {
    agent { any { image 'node:12.16.2' args '-p 3000:3000' } }
   stages {     
    stage('Maven Install') {
      agent {         
       docker {          
         image 'maven:3.5.0'         
     }       
  }       
  steps {
       sh 'mvn clean install'
       }
     }
   }
 }