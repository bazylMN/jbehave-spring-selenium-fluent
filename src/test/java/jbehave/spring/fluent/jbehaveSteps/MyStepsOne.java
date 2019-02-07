package jbehave.spring.fluent.jbehaveSteps;

import jbehave.spring.fluent.jbehavePageObjects.MyStepsOnePageObject;
import org.jbehave.core.annotations.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyStepsOne {

    @Autowired
    private MyStepsOnePageObject myStepsOnePageObject;

    @Given("I go to ${page} page")
    public void givenIGoToHttplocalhostPage(String page) {
        myStepsOnePageObject.goToPage(page);
    }
}
