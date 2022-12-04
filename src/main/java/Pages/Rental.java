package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rental { private final WebDriver driver;
    public Rental(WebDriver driver){
        this.driver = driver;
    }

    private final By datepicker = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN"); // поле когда привести самокат
    private final By timeframe = By.className("Dropdown-placeholder"); // поле срок аренды
    private final By scooterBlack= By.id("black"); // поле выбора черного самоката
    private final By scooterGrey= By.id("grey"); // поле выбора серого самоката
    private final By comments= By.className("Input_Input__1iN_Z Input_Responsible__1jDKN"); // коментарии для курьера
    private final By backButton = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i"); // локатор для кнопки "назад"
    private final By forwardButton = By.className("Button_Button__ra12g Button_Middle__1CSJM"); // локатор для кнопки  "вперед"


    private final By noButton = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i"); // локатор для кнопки "Нет"
    private final By yesButton = By.className("Button_Button__ra12g Button_Middle__1CSJM"); // локатор для кнопки "Да"

    public void setDatepicker(String mydate) {
        driver.findElement(datepicker).sendKeys(mydate);
    } // метод выбора даты

    public void setTimeframe(String ignoredTime) {
        driver.findElement(timeframe).click();
    }// метод выбора количества дней
    public void setScooterBlack() {
        driver.findElement(scooterBlack).click();
    } // метод для выбора черного самоката
    public void setScooterGrey(){
        driver.findElement(scooterGrey).click();
    } // метод для выбора серого самоката
    public void setComments(String mycomments) {
        driver.findElement(comments).sendKeys(mycomments);
    }// метод для написания коментария

    public void clickBackButton() {
        driver.findElement(backButton).click();
    }//метод для нажатия на кнопку кнопку "назад"
    public void clickForwardButton() {
        driver.findElement(forwardButton).click();
    } //метод для нажатия на кнопку кнопку "вперед"
    public void clickNoButton() {
        driver.findElement(noButton).click();
    } //метод для нажатия на кнопку на еще одну кнопку "Нет"
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    } //метод для нажатия на кнопку на еще одну кнопку Да

    public void setRental(String date, String ignoredTime, String comments) {
        setDatepicker(date);
        setTimeframe(ignoredTime);
        setScooterGrey();
        setComments(comments);
        clickForwardButton();
        clickYesButton();

    }

}
