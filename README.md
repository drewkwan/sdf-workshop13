## Workshop 13

* Run the spring boot app

Linux/Macos
'''
mvn spring-boot:run -Dspring-boot:run.arguments=--dataDir=/opt/tmp/data
'''
Windows
'''
mvn spring-boot: run -Dspring-boot:run.arguments=--dataDir=C:/data
'''
* Incorporate test started dependencies
'''
'''
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <version>2.7.1</version>
    <scope>test</scope>
</dependency>
'''

* In order to execute test cases
'''
mvn test
'''

'''