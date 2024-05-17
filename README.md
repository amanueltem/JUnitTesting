# JUnitTesting

This project demonstrates the TDD (Test-Driven Development) approach. The test case is written first before the code implementation.
`ChangeNumberTest.java` is written before `ChangeNumber.java` to validate the requirements.

## Cloning the Repository

```sh
git clone https://github.com/amanueltem/JUnitTesting
## How to Run 
# For Windows
javac -cp ".;junit-4.13.2.jar" ChangeNumberTest.java
java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ChangeNumberTest

# For Mac and Linux
javac -cp ".:junit-4.13.2.jar" ChangeNumberTest.java
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ChangeNumberTest
