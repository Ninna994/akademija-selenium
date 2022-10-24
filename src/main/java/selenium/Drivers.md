# Drivers - init

## Chrome driver

```java
    System.setProperty("webdriver.chrome.driver", "PATH");
    WebDriver driver = new ChromeDriver();
```

## Firefox driver

```java
    System.setProperty("webdriver.gecko.driver", "PATH");
    WebDriver driver = new FirefoxDriver();
```

## Edge driver

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

