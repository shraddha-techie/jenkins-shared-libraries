// vars/myPipeline.groovy
def call(String url, String branch) {
    pipeline {
        agent any

        stages {
            
            stage('Clone Repo') {
                steps {
                    echo "Cloning repository..."
                    git url: "${url}", branch: "${branch}"
                }
            }

            stage('Build') {
                steps {
                    echo "Building the project..."
                    // Replace this with actual build commands if needed
                    bat 'echo Build step running...'
                }
            }

            stage('Test') {
                steps {
                    echo "Running tests..."
                    // Replace this with actual test commands
                    bat 'echo Tests running...'
                }
            }

            stage('Deploy') {
                steps {
                    echo "Deploying the project..."
                    // Replace this with actual deploy commands
                    bat 'echo Deploy step completed!'
                }
            }
        }
    }
}
