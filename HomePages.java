package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePages {
    @FindBy(id ="loginusername") private WebElement userName;
    @FindBy(id = "loginpassword")private WebElement passWord;
   // @FindBy(By.ByCssSelectorclass("btn btn-primary")).sendkey
    public void logIn(){
        userName.sendKeys(Browser.getPropertyValue("userName"));
        passWord.sendKeys(Browser.getPropertyValue("passWord"));
        //loginButton.click();
    }



}
