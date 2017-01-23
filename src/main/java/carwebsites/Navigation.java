package carwebsites;

import org.openqa.selenium.WebDriver;

/**
 * Created by kngunjiri on 1/23/2017.
 */
public class Navigation extends Functions{
//    instances
    private String baseUrl;
    private WebDriver driver;

//    methods
    public Navigation(WebDriver driver, String baseUrl) {
        this.baseUrl = baseUrl;
        this.driver = driver;
    }
}

