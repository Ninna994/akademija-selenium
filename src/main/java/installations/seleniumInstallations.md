## General Setup

* **Java** installed on your machine
  * Check if Java is installed in cmd - **java -version**
  * If not installed go to [Link](https://www.oracle.com/java/technologies/downloads/#java8) and install it
  * Go to Environment variables > Edit system environment variables > Environment Variables
  * In the top section click New
    * Variable name: JAVA_HOME
    * Variable value: C:\Program Files\Java\jdk1.8.0_51 (or whichever version you downloaded)
    * OK
  * Verify installation **after restarting computer**
* **Maven** installed
  * Software project management, central repository
  * Artifacts - files, usually JARs that get deployed to a Maven repository
  * GroupID - will identify project uniquely across all projects
  * Find the latest version of Maven in here - [Maven – Download Apache Maven](https://maven.apache.org/download.cgi)
  * Follow the instruction of download and setting up variables as per here
    - [How to install Maven on Windows - Mkyong.com](https://mkyong.com/maven/how-to-install-maven-in-windows/)
* **Git** installed
  * [Link](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) for instructions on how to
* **IntelliJ** Installed
  * Download Community version [link](https://www.jetbrains.com/idea/download/#section=windows)
  * Setting up Java SDK in IntelliJ
    * File>Project Structure > SDKs > +
    * JDK - look for location
    * Select location > Click Open > Ok > Apply/OK
* **SelectorsHub**
  * [Chrome Extension](https://chrome.google.com/webstore/detail/selectorshub/ndgimibanhlabgdgjcpbbndiehljcpfh?hl=en)
  * [Mozilla Extension](https://addons.mozilla.org/en-US/firefox/addon/selectorshub/)
  * use it in DevTools

## Selenium Specific

* Make new project - `File -> New -> Project -> Create from archetype -> maven-archetype-quickstart`
* Go to `pom.xml` file and install dependencies
  * [Selenium 4.5.2](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.5.2)
  * [TestNG 7.6.1](https://mvnrepository.com/artifact/org.testng/testng/7.6.1)
  * Refresh maven project - import dependencies
* Download chromedriver, geckodriver and edgedriver and put them inside `drivers/` folder.
  * Do not delete existing files, they are here as placeholders
  * Check browser versions and download matching version of driver
  * [Chromedriver download link](https://chromedriver.chromium.org/downloads)
  * [Edgedriver download link](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)
  * [Geckodriver download link](https://github.com/mozilla/geckodriver/releases)
