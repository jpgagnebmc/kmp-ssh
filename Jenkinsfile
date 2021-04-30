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
                    sh 'gradle clean'
                }
            }
        }

        stage('jvmTest') {
            steps {
                withGradle {
                    sh 'gradle nativeTest --stacktrace'
                }
            }
        }
        stage('jsTest') {
            steps {
                withGradle {
                    sh 'gradle nativeTest --stacktrace'
                }
            }
        }
        stage('nativeTest') {
            steps {
                withGradle {
                    sh 'gradle nativeTest --stacktrace'
                }
            }
        }
    }
}
