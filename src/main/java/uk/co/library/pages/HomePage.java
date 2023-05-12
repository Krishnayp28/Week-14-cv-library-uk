package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;


    public void acceptCookies() throws InterruptedException {
        Thread.sleep(800);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
        Reporter.log("Accept All Cookies : ");
        CustomListeners.test.log(Status.PASS, "Accept All Cookies.");
    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter Job Title:" + jobTitle.toString());
        sendTextToElement(this.jobTitle, jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter Job Title :" + jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter Location:" + location.toString());
        sendTextToElement(this.location, location);
        CustomListeners.test.log(Status.PASS, "Enter location :" + location);
    }

    public void selectDistance(String distance) {
        Reporter.log("Select Distance :" + distanceDropDown.toString());
        sendTextToElement(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "Select Distance :" + distanceDropDown);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("click On More Search Option :" + moreSearchOptions.toString());
        clickOnElement(moreSearchOptions);
        CustomListeners.test.log(Status.PASS, "click On More Search Option :" + moreSearchOptions);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter MinSalary:" + minSalary.toString());
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Enter MinSalary :" + minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter MaxSalary :" + maxSalary.toString());
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter MaxSalary  :" + maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select Salary Type:" + salaryDropDown.toString());
        selectByVisibleTextFromDropDown(salaryDropDown, sType);
        CustomListeners.test.log(Status.PASS, "Select Salary Type :" + salaryDropDown);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select Job Type:" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "Select Job Type :" + jobTypeDropDown);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("click On Find Jobs Button :" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "click On Find Jobs Button :" + findJobsBtn);
    }
}
