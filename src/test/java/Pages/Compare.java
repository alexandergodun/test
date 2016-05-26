package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Compare extends AbstractPage{


    public Compare(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void compare() throws InterruptedException {
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"����� BERKLEY Nanofil Lo-vis Green; �������� 50�.; 1278175 , ���.: Nanofil-Green-50\"]")).click();
        driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[3]/div[6]/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[24]")).click();
        driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[3]/div[6]/ul/li[2]/a/span[2]")).click();

        driver.findElement(By.xpath("//div[@id='mini-compare']/div/span/span[3]")).click();
        driver.findElement(By.cssSelector("button.button.btn-inline")).click();
    }
    public boolean isCompare(){
        return driver.findElement(By.className("page-title title-buttons")).getText().contains("��������� �������");
    }
}
