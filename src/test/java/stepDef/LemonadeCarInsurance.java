package stepDef;

import dataReader.ExcelConnection;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObject.CarInsurancePage;
import utility.BaseClass;
import utility.CommonUtility;

import java.io.IOException;


public class LemonadeCarInsurance {
    CarInsurancePage carInsurancePage;
    ExcelConnection excel = new ExcelConnection();

    @Given("User navigate to the Lemonade homepage")
    public void user_navigate_to_the_lemonade_homepage() {
        carInsurancePage = new CarInsurancePage(BaseClass.getDriver());
    }

    @Given("User click on the Check Our Prices button")
    public void user_click_on_the_check_our_prices_button() throws InterruptedException, IOException {
        carInsurancePage.clickCheckPrice();
        CommonUtility.screenshot();
        Thread.sleep(3000);
    }

    @Given("User click on Nope radio button and click on Next button")
    public void user_click_on_nope_radio_button_and_click_on_next_button() throws InterruptedException, IOException {
        carInsurancePage.clickNope();
        carInsurancePage.clickNext();
        CommonUtility.screenshot();
        Thread.sleep(3000);
    }


    @Given("User select the Car Insurance link")
    public void user_select_the_car_insurance_link() throws InterruptedException, IOException {
        //CommonUtility.scrollbyNumber();
        carInsurancePage.clickCar();
        CommonUtility.screenshot();
        Thread.sleep(3000);
        CommonUtility.scrollbyNumber();
        CommonUtility.screenshot();
    }
    @Given("User click on Next Button")
    public void user_click_on_next_button() throws InterruptedException, IOException {
        carInsurancePage.clickNext1();
        CommonUtility.screenshot();
        Thread.sleep(3000);

    }


    @When("user enters valid First Name")
    public void user_enters_valid_First_Name() throws InterruptedException, IOException {
        excel.excelRead();  // Ensure the workbook is opened
        String F_Name  = excel.getCellData(1, 0);  // Fetch First Name from Excel
        carInsurancePage.enterFirstName(F_Name);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }
//Invalid data
    @When("user enters invalid First Name")
    public void user_enters_invalid_first_name() throws IOException, InterruptedException {
        excel.excelRead();  // Ensure the workbook is opened
        String F_Name  = excel.getCellData(2, 0);  // Fetch First Name from Excel
        carInsurancePage.enterFirstName(F_Name);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user enters a valid Last Name")
    public void user_enters_valid_Last_Name() throws InterruptedException, IOException {
        String L_Name  = excel.getCellData(1, 1);  // Fetch Last Name from Excel
        carInsurancePage.enterLastName(L_Name);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user enters a invalid Last Name")
    public void user_enters_a_invalid_last_name() throws IOException, InterruptedException {
        String L_Name  = excel.getCellData(2, 1);  // Fetch Last Name from Excel
        carInsurancePage.enterLastName(L_Name);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user clicks on Next button")
    public void user_clicks_on_next_button() throws InterruptedException, IOException {
        carInsurancePage.clickNext2();
        CommonUtility.screenshot();
        Thread.sleep(5000);
    }

    @When("user enters valid Address")
    public void user_enters_valid_Address() throws InterruptedException, IOException {
        String address  = excel.getCellData(1, 2);
        System.out.println(address);
        carInsurancePage.enterStreetAddress(address);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user enters invalid Address")
    public void user_enters_invalid_address() throws IOException, InterruptedException {
        String address  = excel.getCellData(2, 2);
        System.out.println(address);
        carInsurancePage.enterStreetAddress(address);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user clicks on the Next button")
    public void user_clicks_on_the_next_button() throws InterruptedException, IOException {
        carInsurancePage.clickNext3();
        CommonUtility.screenshot();
        Thread.sleep(3000);
    }

    @When("user enters valid custom Address")
    public void user_enters_valid_custom_address() throws InterruptedException, IOException {
        String address  = excel.getCellData(3, 2);
        System.out.println(address);
        carInsurancePage.enterStreetAddress(address);
        CommonUtility.screenshot();
        Thread.sleep(2000);
        carInsurancePage.clickCustomStreetAddress();
    }

    @When("user enters details of valid custom Address")
    public void user_enters_details_of_valid_custom_address() throws InterruptedException, IOException {

        String address2 = excel.getCellData(4, 2);
        String city = excel.getCellData(4,4);
        String state = excel.getCellData(4,5);
        int zip = Integer.parseInt(excel.getCellData(4, 6)); // Convert to integer


        carInsurancePage.enterCustomAddress(address2,city,state,zip);

        CommonUtility.screenshot();
        Thread.sleep(2000);

    }

    @When("user clicks Next button")
    public void user_clicks_next_button() throws IOException, InterruptedException {
        carInsurancePage.clickNext4();
        CommonUtility.screenshot();
        Thread.sleep(3000);

    }

    @When("user clicks on Looks Good button")
    public void user_clicks_on_looks_good_button() throws IOException, InterruptedException {
        carInsurancePage.clickLooksGoodButton();
        CommonUtility.screenshot();
        Thread.sleep(3000);
    }


    @When("user has to enter valid Email")
    public void user_has_to_enter_valid_Email() throws InterruptedException, IOException {
        String Email  = excel.getCellData(1, 3);
        carInsurancePage.enterEmailAddress(Email);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user has to enter invalid Email")
    public void user_has_to_enter_invalid_email() throws IOException, InterruptedException {
        String Email  = excel.getCellData(2, 3);
        carInsurancePage.enterEmailAddress(Email);
        CommonUtility.screenshot();
        Thread.sleep(2000);
    }

    @When("user clicks on Let Me Know button")
    public void user_clicks_on_let_me_know_button() throws InterruptedException, IOException {
       carInsurancePage.clickButton();
        CommonUtility.screenshot();
        Thread.sleep(3000);
    }


    @Then("user clicks on Back Home button")
    public void user_clicks_on_back_home_button() throws IOException {

        carInsurancePage.clickBackHomeButton();
        CommonUtility.screenshot();
    }

}
