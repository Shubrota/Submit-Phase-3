pipeline {
    agent any

    

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/Shubrota/Submit-Phase-3.git'

               

               

                 bat "/mvn  clean package"
            }

            
        }
    }
}
