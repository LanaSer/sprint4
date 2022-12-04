
import Pages.HomePage;
import Pages.Orden;
import Pages.Rental;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestScooter {
    @RunWith(Parameterized.class)

    public static class testOrden {
        private WebDriver driver;
        private String setName; // переменная для выбора имени
        private String setSurname; // переменная для выбора фамилии
        private String setAddress; // переменная для выбора адресса
        private String setMetro; // переменная для выбора станции метро
        private String setPhone; // переменная для выбора номера телефонна
        private String datepicker; // переменная для выбора даты
        private String timeframe;// переменая для выбора срока аренды
        private String setComments;//переменная для выбора комента

        public testOrden(String setName, String setSurname, String setAddress, String setMetro, String setPhone, String datepicker, String timeframe, String setComments) {
            this.setName = setName;
            this.setSurname = setSurname;
            this.setAddress = setAddress;
            this.setMetro = setMetro;
            this.setPhone = setPhone;
            this.datepicker = datepicker;
            this.timeframe = timeframe;
            this.setComments = setComments;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Маша", "Глаша", "Москва", "Черкизовская ", "89111111111", "07.12.2022", "двое суток", "Хочу желтый"},
                    {"Даша", "Даша", "Москва", "Преображенская площадь ", "89222222222", "10.12.2022", "четверо суток", "Спасибо"},
            };
        }

        @Test
        public void TestOrden() {
            WebDriver driver = new ChromeDriver();
            // драйвер для браузера WebDriver driver1 = new FirefoxDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/"); // переход на страницу тестового приложения
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            HomePage objHomePage = new HomePage(driver);
            objHomePage.clickCookieButton();
            objHomePage.clickUpperOrder();

            Orden objOrden = new Orden(driver);
            objOrden.setOrder(setName, setSurname, setAddress, setMetro, setPhone);
            Rental objRental = new Rental(driver);
            objRental.setRental(datepicker, timeframe, setComments);

        }

        @After
        public void closeDown() {
            // Закрой браузер
            driver.quit();
        }

    }

}
