import Pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

 public class TestHomePage {
    private WebDriver driver;
    public void setDriver(WebDriver driver) {
         this.driver = driver;
     }
    @Test
    public void TestAccordion() {
        WebDriver driver = new ChromeDriver();
        // драйвер для браузера WebDriver driver1 = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/"); // переход на страницу тестового приложения
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        HomePage objHomePage = new HomePage(driver);
        objHomePage.testAccordion0();
        objHomePage.testAccordion1();
        objHomePage.testAccordion2();
        objHomePage.testAccordion3();
        objHomePage.testAccordion4();
        objHomePage.testAccordion5();
        objHomePage.testAccordion6();
        objHomePage.testAccordion7();
    }
    @After
    public void closeDown() {
        // Закрой браузер
        driver.quit();
    }
 }



