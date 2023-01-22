# efisheryProject
Automation script - efishery Project

**selenium-cucumber-java**
This repository contains a collection of efishery selenium-cucumber-java projects and libraries that demonstrate how to use the tool and develop automation script using the Cucumber-BDD framework with Java as programming language. 
It generate HTML and JSON reporters as well. It also generate screen shots for your tests if you enable it and also generate error shots for your failed test cases as well.

Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)
Maven (make sure .m2 class path is set)
Eclipse
Eclipse Plugins for : Maven & Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)

**Framework set up**
Fork / Clone repository from here or download zip and set it up in your local workspace.

**Run Some efishery Tests**
Open project in eclipse or another editor tools and navigate to the project directory 
Run as -> Maven test to run features and execute the tests.

To run features on specific browser: 
edit on : System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
change chromedriver.exe to another webdriver whatever you want.

Please note that browser drivers are included as part of this framework. 
The reason for inclusion is that the version of the selenium browser driver that is included matches the version of the browser I'm using as well as the version of the selenium server.
 If your browser version and browser driver version are different, please adjust them first

To run specific feature if you have multiple feature files use, change the mvn test "tags = { "@ExploreMusic" } / { "@PlayYoutubeMusic" } /  { "@SearchMusic" }
Reporters
Once you ran your tests you can generate the the reports. This framework selenium-cucumber-java uses test reporters to communicate pass/failure.


HTML Report:
To generate HTML report use mvn test -Dcucumber.options="–plugin html:target/cucumber-html-report.html","json:target/cucumber.json", "html:target/cucumber-reports""

