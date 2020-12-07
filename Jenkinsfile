pipeline {
    agent any
    
    tools { 
        maven 'maven' 
        jdk 'jdk' 
    }
     
    stages {
  
        stage('build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('Sonar 8.5') {
                
                    withMaven(maven : 'maven') {
                        bat 'mvn clean package sonar:sonar'
                    }
                }
            }
        }
        
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
        stage('Test Stage') {
            steps {
                    withMaven(maven : 'maven'){
                        bat'mvn test'
                    }                          
            }
        }

 

 

 

    }
    
}