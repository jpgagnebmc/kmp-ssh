pipeline {
    agent any
    tools {
        gradle "gradle-7.0"
        jdk "jdk-11.0.9"
    }
    options { disableConcurrentBuilds() }

    stages {
        stage('Clean') {
            steps {
                withGradle {
                    sh 'gradle clean build'
                }
            }
        }
    }
}
