package jbehave.spring.fluent.driverProvider;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeforeAfterHelper {

    @Autowired
    private DriverProvider driverProvider;
    @Autowired
    private TakesScreenshots takesScreenshots;

    @BeforeStories
    public void before() {
        driverProvider.clearCookies();
    }

    @AfterScenario(uponOutcome = AfterScenario.Outcome.FAILURE)
    public void deleteCookiessWhenFailed() {
        driverProvider.clearCookies();
        takesScreenshots.saveScreenshotTo();
    }

    @AfterStories
    public void afterStories1(){
        driverProvider.end();
    }
}
