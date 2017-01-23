package carwebsites.autotrader;

import carwebsites.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by kngunjiri on 1/21/2017.
 */
public class HomePageTest {
//    instance fields
    private Homepage autoHP;
    private HomepageSelector autoSelector;

//    static fields

//    methods
    @BeforeClass(alwaysRun = true)
    private void setUp() {
        this.autoHP = new Homepage();
        this.autoSelector = new HomepageSelector();
    }

    @Test
    public void shouldNavigateToHomePage(){

    }
}
