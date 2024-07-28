pipeline {
    agent any

    

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/Shubrota/Submit-Phase-3.git'

               

               

                 bat "C:/Shubrota/caltech/phase 4/Submit-Phase-3/mvn  clean package"
            }

            
        }
    }
}
