package jbehave.spring.fluent;

import jbehave.spring.fluent.jbehaveSteps.MyStepsOne;
import jbehave.spring.fluent.jbehaveSteps.MyStepsTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class StepsContext {

    @Autowired
    public MyStepsOne myStepsOne;
    @Autowired
    public MyStepsTwo myStepsTwo;
}
