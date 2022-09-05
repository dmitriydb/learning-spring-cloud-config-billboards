pipeline {
    agent any

    stages {

        stage('Pulling from repo') {
            steps {
                cleanWs()
                bat 'git clone https://github.com/dmitriydb/learning-spring-cloud-config-billboards'
            }
        }

        stage('Build') {
            steps {
                dir("learning-spring-cloud-config-billboards") {
                    bat 'mvn clean install'
                }

            }
        }

        stage('Production') {
            steps {
                dir("learning-spring-cloud-config-billboards") {
                    bat 'docker compose rm -svf'
                    bat 'docker compose up --build --force-recreate -d'
                }
            }
        }

    }
}
