pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Smoke tests') {
                    steps {
                        sh 'mvn test -Dgroups=smoke'
                    }
                }
    }
}
