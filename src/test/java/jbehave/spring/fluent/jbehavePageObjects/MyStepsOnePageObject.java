package jbehave.spring.fluent.jbehavePageObjects;

import jbehave.spring.fluent.driverProvider.DriverProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyStepsOnePageObject {

    @Autowired
    private DriverProvider driverProvider;

    public void goToPage(String page) {
        driverProvider.getWebDriver().get(page);
    }
}
