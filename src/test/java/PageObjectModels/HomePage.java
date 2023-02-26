package PageObjectModels;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    WebDriver driver;


    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "loginBtn")

    WebElement LoginBtn;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    public  void Login(String Uname, String Ppassword) {

        username.sendKeys("johnjohn.6");
        password.sendKeys("Jh898989");
        LoginBtn.click();
    }

}




