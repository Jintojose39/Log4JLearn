# Log4jLearning

This repository demonstrates how to integrate **Apache Log4j** with **Selenium WebDriver** for effective logging in Java automation projects.

## 📌 Overview

Logging is a critical part of test automation to track execution steps, debug failures, and audit test results. This project uses **Log4j 2** with **Selenium** to provide a clean, structured logging mechanism.

---

## 📁 Project Structure

log4jlearning/
│
├── src/
│ └── main/
│ └── java/
│ └── com/log4jlearning/
│ └── SeleniumTest.java
│
├── src/
│ └── main/
│ └── resources/
│ └── log4j2.xml
│
├── logs/
│ └── selenium-test.log # Generated after test run
│
├── pom.xml
└── README.md


---

## ⚙️ Technologies Used

- Java
- Selenium WebDriver
- Log4j 2
- Maven

---

## 🛠 Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/your-username/log4jlearning.git
cd log4jlearning
2. Configure WebDriver
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
3. Build the project
mvn clean install
4. Run the test
mvn exec:java -Dexec.mainClass="com.log4jlearning.SeleniumTest"

🧪 Sample Output
Console logs: Test execution steps

File logs: Saved in logs/selenium-test.log

12:01:05.123 [main] INFO  com.log4jlearning.SeleniumTest - Starting test...
12:01:06.789 [main] DEBUG com.log4jlearning.SeleniumTest - Navigating to example.com
...

