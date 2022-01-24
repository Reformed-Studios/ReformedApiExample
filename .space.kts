

job("Build with maven") {
    container(displayName = "Build with maven", image = "maven:3-openjdk-17-slim") {
     
        shellScript {
        	content = """
            mvn clean install
            mvn clean package
            """
        }
        
    }
}
