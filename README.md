# JBehave-spring-selenium-fluent template
#### with JBehave-core, JBehave-spring, SpringAnnotatedEmbedderRunner.class, fluentSelenium (https://github.com/SeleniumHQ/fluent-selenium) and drivers provider (Selenium WebDriver) for:
* ##### chrome
* ##### firefox
* ##### chrome headless
* ##### iexplorer

### Prerequisites
* gradle
* JBehave Support plugin for IntelliJ
* JBehave Step Generator for IntelliJ
* chromedriver.exe (put it into project root)- chrome is set as default browser
* geckodriver.exe (put it into project root)- is needed for newer FF versions
* IEDriverServer.exe (put it into project root)- is needed for newer FF versions

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### Customise JBehave tests
* add your .story files with scenarios
* create custom steps class / steps classes with @Component and @Autowired annotations for page objects class / classes
* generate steps- in .story file press 'alt+enter' shortcut and choose 'Generate BDD step into class' option  into created steps class / steps classes
* create custom page objects classes with methods and with @Component and @Autowired annotations for driver provider
* create assertions classes with methods and @Component annotation
* add created custom steps classes into StepsContext class with @Autowired annotations
* delete example .story files, steps classes, page objects classes and assertion classes

### How to run tests:
#### With gradle command:

###### To run JBehave tests with custom runTests task and with default browser, type:
 * 'runTests'

###### To run JBehave tests with custom runTests task and with chosen browser, type:
 * '-Dbrowser=chrome runTests'
 * '-Dbrowser=firefox runTests'
 * '-Dbrowser=chromeHeadless runTests'
 * '-Dbrowser=iexplorer runTests'

###### To run JBehave tests with default browser, type:
* 'clean test'

###### To run JBehave tests with chosen browser, type:
* 'clean -Dbrowser=chrome test'
* 'clean -Dbrowser=firefox test'
* 'clean -Dbrowser=chromeHeadless test'
* 'clean -Dbrowser=iexplorer test'

#### With IDE (JUnit):
* run StoriesRunner class
* or run only method with @Test annotation in StoriesRunner class

### Reports and screenshots
Reports are placed in 'reports' directory, including screenshots of failed scenarios.
To run report in browser, open 'reports\jbehave\view\reports.html' file and choose browser.
To see screenshots locally, go to 'reports\jbehave\screenshots directory

### Gradle custom tasks
* runTests
* copyStylesForReports
* deleteJBehaveReports
