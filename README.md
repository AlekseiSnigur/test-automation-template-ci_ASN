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

HW17
| N | Case name                                               | Result | Automated |
|---|---------------------------------------------------------|--------|-----------|
| 1 | Success login with valid data                           |        | N         |
| 2 | Login with empty Username and Password fields           |        | N         |
| 3 | Login with correct Login field and empty Password field |        | N         |
| 4 | Login with empty Login field and correct Password field |        | N         |
| 5 | Login with wrong username and correct password          |        | N         |
| 6 | Login with correct username and wrong password          |        | N         |

Elements and Xpath fot Tallinn Delivery login page:
| Element                 | Xpath                                       |
|-------------------------|---------------------------------------------|
| Main page redirect link | //*[@data-name="mainPage-link"]             |
| Username  input field   | //*[@data-name="username"]                  |
| Password input field    | //*[@data-name="password"]                  |
| Sign in button          | //*[@data-name="signIn-button"]             |
| EN button               | //*[@id="root"]/div/div[2]/div/button[1]    |
| RU button               | //*[@id="root"]/div/div[2]/div/button[2]    |

Xpath for html link:
| Element                                                  | Xpath                                       |
|----------------------------------------------------------|---------------------------------------------|
| Contains name                                            | //td[@class="td3"][not(contains(p,'Name'))] |
| Start with following attribute: "Amount"                 | //tr/td/p[starts-with(.,'$')]               |
| <tr> element that contains <td> elements with "John Doe" | //tr/td/p[contains(.,"John Doe")]           |