# logback-kafka-example
A tiny working example of using logback-kafka

## To Run
    sbt run
    
Will print something like the following to the `mytopic` kafka topic:

    {"message":"1","timestamp":1424443085897,"level":"INFO","logger":"KAFKA","hostname":"Colins-MBP.lan"}
    {"message":"2","timestamp":1424443085906,"level":"INFO","logger":"KAFKA","hostname":"Colins-MBP.lan"}
    {"message":"3","timestamp":1424443085906,"level":"INFO","logger":"KAFKA","hostname":"Colins-MBP.lan"}
    {"message":"4","timestamp":1424443085906,"level":"INFO","logger":"KAFKA","hostname":"Colins-MBP.lan"}
    {"message":"5","timestamp":1424443085906,"level":"INFO","logger":"KAFKA","hostname":"Colins-MBP.lan"}
