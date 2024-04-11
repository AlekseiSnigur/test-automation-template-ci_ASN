**Configuration**
1. Open the `src/test/resources/application.yaml` file.
2. Update github env variables

**Usage**
```
mvn clean test  
mvn allure:serve 
```

To run a specific test class using Maven, execute the following command in the terminal:

```
mvn clean test -Dtest=TestClassName

HW18
Added password generator to Random data generator
Added USERNAME and PASSWORD to GitHub secrets
1.1 - ready
1.2 - Could not add Xpath for expected result because of broken ENV
1.3 - is not completed because of broken ENV