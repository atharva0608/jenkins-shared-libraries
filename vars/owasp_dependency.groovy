def call (){
  dependencyCheck additionalArguments: '--scan ./',odcInstallation: 'OWASP'
  depndencyCheckPublisher pattern: '++/dependency-checkreport.xml'
}
