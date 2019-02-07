package jbehave.spring.fluent.driverProvider;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class TakesScreenshots {

    @Autowired
    private DriverProvider driverProvider;

    private final String PATH = "reports/jbehave/screenshots/failed-scenario-";

    public boolean saveScreenshotTo() {
        if (driverProvider.getWebDriver() instanceof TakesScreenshot) {
            byte[] bytes = ((TakesScreenshot) driverProvider.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            String path = PATH + System.currentTimeMillis() + ".png";
            try {
                IOUtils.write(bytes, new FileOutputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            System.out.println("Screenshot cannot be taken with " + driverProvider.getWebDriver().getClass().getName());
            return false;
        }
    }
}
