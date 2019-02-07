package jbehave.spring.fluent.jbehavePageObjects;

import jbehave.spring.fluent.driverProvider.DriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.FluentWebElement;
import org.seleniumhq.selenium.fluent.FluentWebElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyStepsTwoPageObject {

    @Autowired
    private DriverProvider driverProvider;

    private static final String COOKIES_ACCEPTANCE_TEXT = "PRZECHODZĘ DO SERWISU";
    private final By BUTTON = By.cssSelector("button");

    public void clickCookiesButtonIfExists() {
        FluentWebElements elements = driverProvider.getFluentWebDriver().buttons(BUTTON);
        clickOneFromElementsWithText(elements, COOKIES_ACCEPTANCE_TEXT);
    }

    public String getUrl() {
        return driverProvider.getFluentWebDriver().url().toString();
    }

    private void clickOneFromElementsWithText(FluentWebElements elements, String text) {
        for (FluentWebElement element : elements) {
            boolean hasText = element.getText().toString().contains(text);
            if (hasText) {
                element.click();
                break;
            }
        }
    }
}
