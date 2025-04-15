pipeline {
    agent {
        docker {
            image 'maven:3.8.8-openjdk-17'  // or whichever version you prefer
            args '-v /root/.m2:/root/.m2'   // optional: cache Maven dependencies
        }
    }

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
