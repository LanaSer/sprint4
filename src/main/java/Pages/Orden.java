package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Orden {
    private final WebDriver driver;

    public Orden(WebDriver driver){
        this.driver = driver;
    }
    private By name  = By.xpath("//input[@placeholder='* Имя']"); // локатор для поля ввода имени
    private By surname = By.xpath("//input[@placeholder='* Фамилия']"); // локатор для поля вввода фамилии
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); // локатор для поля ввода адрес
    private By metro = By.className("select-search__input"); // поле выбора метро
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); // локатор для поля ввода телефона
    private By nextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM") ;// локатор для кнопки "Дальше
    public void setName(String text) {
        driver.findElement(name).sendKeys(text); // метод для запонения поля Имя
    }
    public void setSurname(String text) {
        driver.findElement(surname).sendKeys(text);// метод для запонения поля Фамилия
    }
    public void setAddress(String text) {
        driver.findElement(address).sendKeys(text); // метод для запонения поля Адрес
    }
    public void setMetro(String text){
        driver.findElement(metro).sendKeys(text);
        WebElement elementMetro = driver.findElement(By.className("select-search__selekt"));
        elementMetro.click(); // метод для запонения поля Метро
    }
        public void setPhone(String text) {
            driver.findElement(phone).sendKeys(text); // метод для запонения поля телефон
        }
        public void clickNextButton() {
            driver.findElement(nextButton).click(); // метод для нажатия на кнопку Далее
        }
        public void setOrder(String myname, String usersurname, String myaddress, String mymetro, String myphone) {
            setName(myname);
            setSurname(usersurname);
            setAddress(myaddress);
            setMetro(mymetro);
            setPhone(myphone);
            clickNextButton();
        }

    }
