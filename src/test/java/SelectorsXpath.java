import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phonebookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://telranedu.web.app/home");
        //WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
        // //*[@href='/about']
        // //*[text()='ABOUT']
        btnAbout.click();
        //SelectorsCss.pause(3);
        pause(3);

        WebElement btnLogin = driver.findElement(By.xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        int i = new Random().nextInt(1000);
        fieldEmail.sendKeys("qafisgfo"+i+"@gmail.com");
        pause(3);

        WebElement fieldPassword = driver.findElement(By.xpath("//*[@name='password']"));
        fieldPassword.sendKeys("Password123!");
        pause(3);

        WebElement btnRegistration = driver.findElement(By.xpath("//*[@name='registration']"));
        btnRegistration.click();
        pause(3);
        WebElement btnSignOut = driver.findElement(By.xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pause(3);

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());
    }

    @Test
    public void iLcarroXpathTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ilcarro.web.app/search");

        WebElement linkLogin = driver.findElement(By.xpath("//a[text()='Log in']"));
        linkLogin.click();
        pause(3);

        WebElement fieldEmail = driver.findElement(By.xpath("//input[@id='email']"));
        fieldEmail.click();
        fieldEmail.sendKeys("123qwe!@gmail.com");
        pause(3);

        WebElement fieldPassword = driver.findElement(By.xpath("//input[@id='password']"));
        fieldPassword.click();
        fieldPassword.sendKeys("123Qwerty!#");
        pause(3);

        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();
        pause(3);

        WebElement btnOk = driver.findElement(By.xpath("//button[@class='positive-button ng-star-inserted']"));
        btnOk.click();
        pause(3);

        WebElement btnLogout = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
        btnLogout.click();
        pause(3);

        pause(10);

    }

    @Test
    public void iLCarroXpathTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        WebElement btnLogin = driver.findElement(By
                .xpath("//a[@ng-reflect-router-link='login']"));
        btnLogin.click();
        pause(3);
        // BYclassName "ng-dirty"
        // Xpath //*[@class='ng-dirty ng-valid ng-touched']
        WebElement fieldEmail = driver.findElement(By
                .xpath("//input[@id='email']"));
        fieldEmail.sendKeys("sima_simonova370@gmail.com");
        pause(3);
        WebElement fieldPassword = driver.findElement(By
                .xpath("//*[@formcontrolname='password']"));
        //   //form/div[last()]/input  вниз к ребенку
        fieldPassword.sendKeys("BSas124!");
        pause(3);
        WebElement btnYalla = driver.findElement(By
                .xpath("//button[text()='Y’alla!']"));
        //  //button[start-with(text(),'Y’a')]
        btnYalla.click();
        pause(3);
        WebElement btnOk = driver.findElement(By
                .xpath("//button[@class='positive-button ng-star-inserted']"));
        btnOk.click();
        pause(3);
        WebElement btnLogout = driver.findElement(By
                .xpath("//a[contains(text(), 'Logout')]"));
        btnLogout.click();
        pause(3);
        driver.quit();
        //  //input[@id='password']/../.. вверх по дереву
        pause(10);
    }


    public void pause(int time){
        try {
            Thread.sleep(time *1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
