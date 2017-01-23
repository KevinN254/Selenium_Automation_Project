package carwebsites;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;

/**
 * Created by kngunjiri on 1/23/2017.
 */
public class Functions {

//    static fields
    protected static WebDriver driver;

//    methods
    public void setUpDriver(){
        WebDriver driver = new ChromeDriver();
    }


}
