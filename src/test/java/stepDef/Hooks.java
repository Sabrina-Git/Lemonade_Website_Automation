package stepDef;

import utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {



    @Before (order = 1)
    public void launchApp () throws IOException,InterruptedException {
        BaseClass.setDriver();
        //BaseClass.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Before (order = 2)
    public void before2(){

    }

    @After (order = 1)
    public void tearDown(){

        BaseClass.getDriver().close();
    }

    @After (order = 2)
    public void after2(){

    }

}
