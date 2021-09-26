package org.Argos.Hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.Argos.DriverFactory.DriverFactory;

public class Hook extends DriverFactory {

    DriverFactory df = new DriverFactory();

    @Before
    public void SetUp() {

        df.OpenBrowser();
    }

    @After
    public void TearDown() {
        df.CloseBrowser();

    }

}
