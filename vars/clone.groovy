def call(sring url,sting branch) {
  pipeline {
    agent any

    stages {
        
        stage('Clone Repo') {
            steps {
                git url: "${url}" , branch: "${branch}
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                // Example: For Python
                bat 'echo Build step running...'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                // Example: Run test command
                bat 'echo Tests running...'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying the project..."
                bat 'echo Deploy step completed!'
            }
        }
    }
}

  
  
}
