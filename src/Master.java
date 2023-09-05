import Utility.BaseDriver;
import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Driver;
import java.util.List;
import java.util.Set;


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
    @Test
    public void Test1(){
        driver.get("https://techno.study/tr");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement basvurButton = driver.findElement(By.xpath("//table[@role='presentation']"));
        basvurButton.click();

        WebElement nameText = driver.findElement(By.xpath("//input[@name='name']"));
        nameText.sendKeys("Test Mesut Komiser");

        WebElement mailText = driver.findElement(By.xpath("//input[@name='email']"));
        mailText.sendKeys("test_olayyeri@gmail.com");

        WebElement countryPhoneCode = driver.findElement(By.xpath("//span[@class='t-input-phonemask__select-code']"));
        countryPhoneCode.click();

        WebElement andorraPhoneCode = driver.findElement(By.xpath("//div[@data-phonemask-name='Andorra']"));
        andorraPhoneCode.click();

        WebElement phoneNumberText = driver.findElement(By.xpath("//input[@class='t-input t-input-phonemask']"));
        phoneNumberText.sendKeys("999999");

        WebElement countrySelect = driver.findElement(By.cssSelector("[name='country']"));
        Select countrySelectMenu = new Select(countrySelect);
        countrySelectMenu.selectByVisibleText("Andorra");

        WebElement courseSelect = driver.findElement(By.cssSelector("[name='course']"));
        Select courseSelectMenu = new Select(courseSelect);
        courseSelectMenu.selectByVisibleText("SDET Türkçe");

        WebElement gonderButton = driver.findElement(By.xpath("//button[@class='t-submit']"));
        js.executeScript("window.scrollBy(0, 10000);",gonderButton);

        WebElement surveySelect = driver.findElement(By.cssSelector("[name='survey']"));
        Select surveySelectMenu = new Select(surveySelect);
        surveySelectMenu.selectByVisibleText("Instagram");

        WebElement promoCodeText = driver.findElement(By.cssSelector("[name='promo code']"));
        promoCodeText.sendKeys("123456789");

        WebElement checkBox = driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
        checkBox.click();

        gonderButton.click();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='t-form-success-popup__text t-descr t-descr_sm']")));

        WebElement applyCond = driver.findElement(By.cssSelector("[class='t-form-success-popup__text t-descr t-descr_sm']"));
        Assert.assertTrue("Başvuru başarısız...", applyCond.getText().contains("Başvurunuz alınmıştır."));

        DriverKapat();
    }

    // Bu testimizde bütün kurslarımızın sayfasına gittik
    @Test
    public void Test2(){
        driver.get("https://techno.study/tr");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunction.wait(2);

        WebElement sdetCourse = driver.findElement(By.xpath("//div[@field='descr']//a[text()='SDET Yazılım Test Mühendisi']"));
        js.executeScript("arguments[0].scrollIntoView(true);", sdetCourse);
        MyFunction.wait(2);
        sdetCourse.click();

        bekle.until(ExpectedConditions.titleContains("SDET"));
        Assert.assertTrue("SDET linki çalışmadı...", driver.getTitle().contains("SDET"));
        MyFunction.wait(2);

        driver.navigate().back();
        bekle.until(ExpectedConditions.titleContains("IT kariyerine"));

        WebElement androidUygGel = driver.findElement(By.xpath("//div[@field='descr']//a[text()='Android Uygulama Geliştirme']"));
        js.executeScript("arguments[0].scrollIntoView(true);", androidUygGel);
        MyFunction.wait(2);
        androidUygGel.click();

        bekle.until(ExpectedConditions.titleContains("Android"));
        Assert.assertTrue("Android linki çalışmadı...", driver.getTitle().contains("Android"));
        MyFunction.wait(2);

        driver.navigate().back();
        bekle.until(ExpectedConditions.titleContains("IT kariyerine"));

        WebElement veriBilimi = driver.findElement(By.xpath("//div[@field='descr']//a[text()='Veri bilimi']"));
        js.executeScript("arguments[0].scrollIntoView(true);", veriBilimi);
        MyFunction.wait(2);
        veriBilimi.click();

        bekle.until(ExpectedConditions.titleContains("Veri bilimi"));
        Assert.assertTrue("Veri bilimi linki çalışmadı...", driver.getTitle().contains("Veri bilimi"));
        MyFunction.wait(2);

        driver.navigate().back();
        bekle.until(ExpectedConditions.titleContains("IT kariyerine"));

        WebElement mastersProgram = driver.findElement(By.xpath("//div[@field='descr']//a[@href='http://techno.study/masters']"));
        js.executeScript("arguments[0].scrollIntoView(true);", mastersProgram);
        MyFunction.wait(2);
        mastersProgram.click();

        bekle.until(ExpectedConditions.titleContains("Get Master's Degree"));
        Assert.assertTrue("Veri bilimi linki çalışmadı...", driver.getTitle().contains("Get Master's Degree"));
        MyFunction.wait(2);

        DriverKapat();
    }

    // Bu testimizde sosyal medya sayfalarımızın linkinin çalışıp çalışmadığının kontrolünü sağlayıyoruz.
    @Test
    public void Test3(){
        driver.get("https://techno.study/tr");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunction.wait(2);

        String technoStudyID = driver.getWindowHandle();

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        List<WebElement> socialLinks = driver.findElements(By.cssSelector("[aria-label='Social media links'] li a"));

        for (WebElement socialLink : socialLinks){
            js.executeScript("arguments[0].click();", socialLink);
        }

        Set<String> IDler = driver.getWindowHandles();

        for (String id : IDler){
            if (id.equals(technoStudyID)){
                continue;
            }
            driver.switchTo().window(id);
            MyFunction.wait(2);
            if (driver.getCurrentUrl().contains("facebook")){
                Assert.assertTrue("Faceebook linki çalışmıyor", driver.getCurrentUrl().contains("facebook"));
                driver.close();
            } else if (driver.getCurrentUrl().contains("instagram")) {
                System.out.println("Instagram linki çalışıyor");
                Assert.assertTrue("Instagram linki çalışmıyor", driver.getCurrentUrl().contains("instagram"));
                driver.close();
            } else if (driver.getCurrentUrl().contains("youtube")) {
                Assert.assertTrue("Youtube linki çalışmıyor", driver.getCurrentUrl().contains("youtube"));
                driver.close();
            } else if (driver.getCurrentUrl().contains("linkedin")) {
                Assert.assertTrue("Linkedin linki çalışmıyor", driver.getCurrentUrl().contains("linkedin"));
                driver.close();
            }
        }

        DriverKapat();
    }

    // Bu testimizde Kullanım şartları sayfasına erişip erişemediğimin testini sağlıyorum
    @Test
    public void Test4(){
        driver.get("https://techno.study/tr");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunction.wait(2);

        WebElement kullanimSartlari = driver.findElement(By.cssSelector("[class='t-checkbox__labeltext'] span"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunction.wait(2);
        // kullanimSartlari.click(); // selenium click ile denedim checkBox u işaretledi
        js.executeScript("arguments[0].click();", kullanimSartlari); // javascript ile de denedim fakat sonuç yine aynı
        // locator ını alırken şartlar yazısına herhangi bir link bağlanmadığını da gördüm

        Assert.assertTrue("Kullanım şartları sayfasına erişilemedi...", driver.getTitle().contains("Kullanım şartları"));

        DriverKapat();
    }
    
@Test
    public void Test5(){
    driver.get("https://techno.study/tr");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement sdetBtn=driver.findElement(By.cssSelector("div.t396__elem.tn-elem.tn-elem__5159634201661161478639 > a"));
    js.executeScript("arguments[0].scrollIntoView(false);",sdetBtn);
    MyFunction.wait(1);
    sdetBtn.click();
    WebElement dogrulama=driver.findElement(By.cssSelector("div.t228__leftside > div > a > img"));
    WebElement logo= driver.findElement(By.cssSelector("div.t228__leftside > div > a > img"));
    bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.t228__leftside > div > a > img")));
    Assert.assertTrue(logo.isEnabled());
    driver.navigate().back();

    WebElement android= driver.findElement(By.cssSelector("div.t396__elem.tn-elem.tn-elem__5159634201663336291315 > a"));
    js.executeScript("arguments[0].scrollIntoView(false);",android);
    MyFunction.wait(1);
    android.click();
    WebElement logo2= driver.findElement(By.cssSelector("div.t228__leftside > div > a > img"));
    bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.t228__leftside > div > a > img")));

    Assert.assertTrue(logo2.isEnabled());
    driver.navigate().back();

    WebElement veriBilimi=driver.findElement(By.cssSelector("div.t396__elem.tn-elem.tn-elem__5159634201490289915734 > a"));
    js.executeScript("arguments[0].scrollIntoView(false);",veriBilimi);
    MyFunction.wait(1);
    veriBilimi.click();
    WebElement logo3= driver.findElement(By.cssSelector("div.t228__leftside > div > a > img"));
    bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.t228__leftside > div > a > img")));
    Assert.assertTrue(logo3.isEnabled());
    driver.navigate().back();

    MyFunction.wait(1);
    driver.quit();

}
@Test
    public void Test6(){
        driver.get("https://techno.study/tr");
        WebElement logoBtn=driver.findElement(By.cssSelector("[class='t228__imglogo ']"));
        logoBtn.click();
        WebElement title=driver.findElement(By.cssSelector("head > title"));
        Assert.assertTrue(title.getText().contains("Sıfırdan başlayarak\n" +
                "6 ayda IT uzmanı olun."));
        MyFunction.wait(1);
        driver.quit();

}
}
