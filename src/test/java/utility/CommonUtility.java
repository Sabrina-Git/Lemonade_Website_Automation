package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.util.Calendar;
import java.util.Date;

import java.io.File;
import java.io.IOException;

public class CommonUtility extends BaseClass{

    static JavascriptExecutor js;
    public CommonUtility() throws IOException, InterruptedException {
    }


    public static void screenshot() throws IOException {


        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        String timestamp = time.toString().replace(":","").replace(" ","");
        System.out.println(time);
        System.out.println(timestamp);
        TakesScreenshot ss = (TakesScreenshot)BaseClass.getDriver();
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation,new File("C:\\Users\\sabri\\IdeaProjects\\Automation_Lemonade\\src\\test\\ScreenShot\\"+timestamp+"Lemonadepage.png"));

    }

public static void ScrollHeight(){
    js = (JavascriptExecutor) getDriver();
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

}

public static void scrollbyNumber(){
    js = (JavascriptExecutor) getDriver();
    js.executeScript("window.scrollBy(0,700)");
}

public static void scrollIntoView(WebElement element){
        js = (JavascriptExecutor) getDriver();
        js.executeScript("argument[0].scrollIntoView();",element);
}
}

