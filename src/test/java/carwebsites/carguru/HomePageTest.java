package carwebsites.carguru;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by kngunjiri on 1/21/2017.
 */
public class HomePageTest {
    //    instance fields
    private Homepage carguruHP;
    private HomepageSelector carguruSelector;

//    static fields

    //    methods
    @BeforeClass(alwaysRun = true)
    private void setUp() {
        this.carguruHP = new Homepage();
        this.carguruSelector = new HomepageSelector();
    }

    @Test
    public void shouldNavigateToHomePage(){

    }

}
