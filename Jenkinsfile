pipeline {
	agent any
	
	stages {
		stage('Compile Stage'){
			
			steps{
				withMaven(maven : 'maven_3_5_0'){
					sh 'mvn clean compile'
				}
			}
		}
		
		stage('Testing Stage'){
			steps{
				withMaven(maven : 'maven_3_5_0'){
					sh 'mvn test'
				}
			}
		}
		post {
	        always {
	            emailext attachLog: true, body: 'Esito pip 2', subject: 'Esito', to: 'gigetto2022@gmail.com'
	        }
	    }
	}
}