import Utility.BaseDriver;
import com.sun.jdi.request.ExceptionRequest;
import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Master extends BaseDriver {
    @Test
    public void Tecno(){
        driver.get("https://techno.study/tr/");

        // Ana Sayfada ki Drop Down Menüsünün Kontrolü
        WebElement kurslar= driver.findElement(By.cssSelector("[class='t-menu__link-item t966__tm-link']"));;
        Actions aksiyonlar=new Actions(driver);
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.wait(1);

        //SDET
       WebElement sdet= driver.findElement(By.xpath("//*[@id=\"rec516093139\"]/div/div/div[3]/div/div[1]/div/a/div/div[2]/div[1]"));
       sdet.click();
       bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rec516026334\"]/div/div/div[3]/div")));
       WebElement sdetDogrulama=driver.findElement(By.xpath("//*[@id=\"rec516026334\"]/div/div/div[3]/div"));
       Assert.assertTrue(sdetDogrulama.getText().contains("Yazılım Test Mühendisi"));
       MyFunction.wait(1);
       driver.navigate().back();

       bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='t-menu__link-item t966__tm-link']")));
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.wait(1);

        //ANDROİD
       WebElement android= driver.findElement(By.xpath("//*[@id=\"rec516093139\"]/div/div/div[3]/div/div[2]/div/a/div/div[2]/div[1]"));
       android.click();
       WebElement androidDogrulama=driver.findElement(By.xpath("//*[@id=\"rec516045955\"]/div/div/div[3]/div/p/strong"));
       bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rec516045955\"]/div/div/div[3]/div/p/strong")));
       Assert.assertTrue(androidDogrulama.getText().contains("Android uygulama geliştirme"));
       MyFunction.wait(1);
       driver.navigate().back();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='t-menu__link-item t966__tm-link']")));
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.wait(1);

        //Veri Bilimi
        WebElement veri=driver.findElement(By.xpath("//*[@id=\"rec516093139\"]/div/div/div[3]/div/div[3]/div/a/div/div[2]/div[1]"));
        veri.click();
        WebElement veriDogrulama=driver.findElement(By.xpath("//*[@id=\"rec516068355\"]/div/div/div[3]/div"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rec516068355\"]/div/div/div[3]/div")));
        Assert.assertTrue(veriDogrulama.getText().contains("Veri Bilimi Bootcamp"));
        MyFunction.wait(1);
        driver.navigate().back();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='t-menu__link-item t966__tm-link']")));
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.wait(1);

        //Job Center
        WebElement job=driver.findElement(By.xpath("//*[@id=\"rec516093139\"]/div/div/div[3]/div/div[4]/div/a/div/div[2]/div[1]"));
        job.click();
        WebElement jobDogrulama=driver.findElement(By.xpath("//*[@id=\"rec624635120\"]/div/div/div[5]/div"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rec624635120\"]/div/div/div[5]/div")));
        Assert.assertTrue(jobDogrulama.getText().contains("Yeni Bir Fırsat:\n" +
                "Almanya'da Yaşayanlara Ücretsiz Teknoloji Bootcamp Eğitimleri!"));
        MyFunction.wait(1);
        driver.navigate().back();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='t-menu__link-item t966__tm-link']")));
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.wait(1);

        //Master's Program
        WebElement master=driver.findElement(By.xpath("//*[@id=\"rec516093139\"]/div/div/div[3]/div/div[5]/div/a/div"));
        master.click();
        WebElement masterDogrulama=driver.findElement(By.xpath("//*[@id=\"rec492157753\"]/div/div/div[3]/h1/strong"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rec492157753\"]/div/div/div[3]/h1/strong")));
        Assert.assertTrue(masterDogrulama.getText().contains("Master's Degree"));
        MyFunction.wait(1);
        driver.navigate().back();

        MyFunction.wait(2);
        driver.quit();
    }
    @Test
    public void Giris(){
        //Campus Login Butonu Kontrolü
        driver.get("https://techno.study/tr/");
        WebElement loginBtn=driver.findElement(By.cssSelector("[class='t228__right_buttons_but']+div>a>table>tbody>tr>td"));
        loginBtn.click();
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='login-form']")));
        Assert.assertTrue(By.cssSelector("[id='login-form']").equals("[id='login-form']"));
        driver.navigate().back();
        MyFunction.wait(2);
        driver.quit();
    }

}
