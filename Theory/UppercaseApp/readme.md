//run inside UPPERCASEAPP folder
mvn clean package
//runs the server
java -cp target/UppercaseApp-1.0-SNAPSHOT.jar mugdad1.UppercaseServer
//runs the client (must be in diffrent termnal)
java -cp target/UppercaseApp-1.0-SNAPSHOT.jar mugdad1.UppercaseClient
