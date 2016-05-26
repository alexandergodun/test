package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Subscribe extends AbstractPage{


    public Subscribe(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void subscribe(String username,String password)
    {
        driver.findElement(By.linkText("�����")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.cssSelector("a[title=\"������ �������\"]")).click();
        driver.findElement(By.cssSelector("div.col-2 > div.box > div.box-title > a")).click();
        driver.findElement(By.id("subscription")).click();
        driver.findElement(By.cssSelector("div.buttons-set > button.button")).click();
    }

    public boolean isSubscribe(){
        boolean sendMessageInIsTrue=false;
        if ((driver.findElement( By.className("success-msg")).getText().contains("�������� ���������."))||(driver.findElement( By.className("success-msg")).getText().contains("�������� �������."))) sendMessageInIsTrue = true;
        return  sendMessageInIsTrue;

    }

}
