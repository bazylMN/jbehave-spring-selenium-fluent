package jbehave.spring.fluent.assertions;

import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class StepsAssertions {

    public void asssertPage(String currentPage, String page) {
        Assert.assertTrue(currentPage, currentPage.contains(page));
    }
}
