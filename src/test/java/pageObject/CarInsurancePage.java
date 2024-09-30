package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.BaseClass;

import java.time.Duration;
import java.util.List;

public class CarInsurancePage {

    public CarInsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "gtm_button_main_check_prices")
    WebElement checkButton;

    public void clickCheckPrice() {
        checkButton.click();
    }

    @FindBy(xpath = "//label[@class='input-radio no_account']")
    WebElement nopeRadioButton;

    public void clickNope() {
        nopeRadioButton.click();
    }

    @FindBy(xpath = "//button[@form='questions_form']")
    WebElement nextButton;

    public void clickNext() {
        nextButton.click();
    }

    @FindBy(xpath = "//input[@data-testid='car-checkbox']")
    WebElement carCheckBox;

    public void clickCar() {

        Actions actions = new Actions(BaseClass.getDriver());
        actions.moveToElement(carCheckBox, 5, 5).click().perform();
    }

    @FindBy(xpath = "//button[@class='sc-idOhPF MultiProductSelection__StyledButton-sc-9kfjwf-2 jcqURW irUhDI']")
    WebElement nextButton1;

    public void clickNext1() {
        nextButton1.click();
    }


    @FindBy(name = "first_name")
    WebElement firstName;

    public void enterFirstName(String F_Name) {
        firstName.sendKeys(F_Name);
    }

    @FindBy(name = "last_name")
    WebElement lastName;

    public void enterLastName(String L_Name) {
        lastName.sendKeys(L_Name);

    }


    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement nextButton2;

    public void clickNext2() {
        nextButton2.click();
    }

    //These are xpath for address field
    //div[@class='sc-bBXqnf jA-dTyk text-container']
    //div[@class='sc-dwqbIM kSqbOa']
    // sc-bdfBwQ sc-gsTCUz sc-dcwrBW kpQYKR fWhbWC vDTBn
    //sc-bdfBwQ sc-gsTCUz bAmOHC jntpXd'
    //div[@class='sc-bdfBwQ sc-gsTCUz sc-dcwrBW kpQYKR fWhbWC vDTBn']
    //input[@placeholder='STREET ADDRESS, CITY, STATE']
    //input[@class='sc-kfzAmx jWsYDH']
    @FindBy(xpath = "//div[@class='sc-bBXqnf jA-dTyk text-container']")
    WebElement streetAddress;

//These are all xpath for dropdown of address field
    //  @FindBy(css = "li.sc-iuAqxS.jDyGBW")
    //input.sc-kfzAmx.jWsYDH
    //  @FindBy(css = " li[value='Roosevelt Ave, Queens, NY, USA']")
    // li[value='Roosevelt Ave, Queens, NY, USA'] pre:nth-child(1)
// li[value='Roosevelt Ave, Queens, NY, USA']
    //@FindBy(css = " li[value='Roosevelt Ave, Queens, NY, USA'] pre:nth-child(1)")
    // @FindBy(css="li[value='Roosevelt Ave, Queens, NY, USA'] span")
    //*[@id="root"]/div/div[1]/main/div/div/div/form/div[1]/div[1]/div[2]/div[1]/ul/li[1]/span
    // @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/main/div/div/div/form/div[1]/div[1]/div[2]/div[1]/ul/li[1]/span")



   @FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/main/div/div/div/form/div[1]/div[1]/div[2]/div[1]/ul/li[1]")
    List <WebElement> dropdown;

//     @FindBy(xpath="//li[@value='Roosevelt Ave, Corona, Queens, NY, USA']")
  // WebElement dropdown;
//    @FindBy(css = "li[value='Roosevelt Ave, Queens, NY, USA']")
//    WebElement dropdown;



public void enterStreetAddress(String S_address) throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(streetAddress));
        streetAddress.click();
        Thread.sleep(3000);
        Actions actions = new Actions(BaseClass.getDriver());
        actions.moveToElement(streetAddress, 5, 5).sendKeys(S_address).build().perform();
 ;
        Thread.sleep(4000);
        for (WebElement drop:dropdown)
        {
            if(drop.getText().equalsIgnoreCase("Roosevelt Ave, Queens, NY, USA"))
            {
            actions.moveToElement(drop, 215, 26).click().build().perform();
                Thread.sleep(3000);
            }
        }
    }

    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement nextButton3;

    public void clickNext3() throws InterruptedException {

        nextButton3.click();
        Thread.sleep(2000);

    }


    //These are xpath for custom address field
//@FindBy(xpath="//a[@class='sc-bdfBwQ.sc-gsTCUz.Address__NoResult-sc-1dqewd0-0.kJtLJH.juqkhF.iJnsat']\n")
//@FindBy(css= "a.sc-bdfBwQ.sc-gsTCUz.Address_NoResult-sc-1dqewd0-0")
//@FindBy(xpath = "//a[contains(text(),\"can't find my address\")]")
        //@FindBy(xpath = "//div[@class='sc-bdfBwQ.sc-gsTCUz.sc-gUUzQN.kpQYKR.bQdGzy.bCeCTm']")
    @FindBy(xpath = "//ul[@class='sc-bdfBwQ sc-gGTGfU sc-licaXj kpQYKR gYzgVP dFTVoZ']")
WebElement customAddress;

    public void clickCustomStreetAddress() {

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(customAddress));
        wait.until(ExpectedConditions.elementToBeClickable(customAddress));

        Actions actions = new Actions(BaseClass.getDriver());
        actions.moveToElement(customAddress).click().perform();

    }


    @FindBy(name="street_and_number")
    WebElement streetAndNumber;

    @FindBy(name="city")
    WebElement enterCity;

    @FindBy(css="input.sc-kfzAmx.xiQTw")
    WebElement enterState;

    @FindBy(css="li.sc-iuAqxS.jDyGBW")
    WebElement clickState;

    @FindBy(name="postal_code")
    WebElement enterZipCode ;

    public void enterCustomAddress(String address2 , String city, String state, int zip) throws InterruptedException {

        Actions actions = new Actions(BaseClass.getDriver());

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(streetAndNumber));
        streetAndNumber.click();
        Thread.sleep(3000);

        actions.moveToElement(streetAndNumber, 5, 5).sendKeys(address2).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(enterCity));
        enterCity.click();
        Thread.sleep(3000);

        actions.moveToElement(enterCity, 5, 5).sendKeys(city).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(enterState));
        enterState.click();
        Thread.sleep(3000);
        actions.moveToElement(enterState, 5, 5).sendKeys(state).build().perform();
        actions.moveToElement(enterState, 111, 26).click(clickState).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(enterZipCode));
        enterZipCode.click();
        Thread.sleep(3000);

        actions.moveToElement(enterZipCode, 5, 5).sendKeys(String.valueOf(zip)).build().perform();

        Thread.sleep(2000);

    }

    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement nextButton4;

    public void clickNext4() {
       nextButton4.click();
 }


    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement looksGoodButton;

    public void clickLooksGoodButton() {
        looksGoodButton.click();
    }

    @FindBy(name = "invitation_email")
    WebElement emailAddress;

    public void enterEmailAddress(String E_address){
        emailAddress.sendKeys(E_address);
    }


    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement letMeKnowButton;

    public void clickButton(){
        letMeKnowButton.click();
    }

    @FindBy(xpath = "//div[@class='sc-bdfBwQ AnimatedButton__Wrapper-sc-1cjtkjm-1 kpQYKR iiFUwn']")
    WebElement backHomeButton;

    public void clickBackHomeButton(){
        backHomeButton.click();
    }

}
