# Drivers - init

* **_!!!!! IMPORTANT NOTE from 11.2022.!!!!!_** 
  * After Selenium launched update 4.6.0 it is no longer mandatory step to write `System.setProperty('webdriver.x.driver', 'PATH'')` because it comes with WebDriver Manager that handles this for us. Reference [link](https://www.selenium.dev/blog/2022/introducing-selenium-manager/)
* All drivers should be inside **drivers** folder in root. _Drivers should not be pushed to git and should be updated regularly._

## Chrome driver

* [Download link](https://chromedriver.chromium.org/downloads)

```java
    System.setProperty("webdriver.chrome.driver", "PATH");
    WebDriver driver = new ChromeDriver();
```

## Firefox driver

* [Download link](https://github.com/mozilla/geckodriver/releases)

```java
    System.setProperty("webdriver.gecko.driver", "PATH");
    WebDriver driver = new FirefoxDriver();
```

## Edge driver

* [Downlaod link](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)

```java
    System.setProperty("webdriver.edge.driver", "PATH");
    WebDriver driver = new EdgeDriver();
```

## Chrome headless

```java
    ChromeOptions options = new ChromeOptions();
     options.addArguments("headless");
     //execute in Chrome driver
     System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"PATH;
     driver = new ChromeDriver(options);
```

