pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven {
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        stage('Smoke tests') {
                    steps {
                        withMaven{
                        sh 'mvn test -Dgroups=smoke'
                        }
                    }
                }
    }
}
