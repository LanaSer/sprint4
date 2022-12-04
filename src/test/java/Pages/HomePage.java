package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
  public class HomePage {
    private WebDriver driver;
      public HomePage(WebDriver driver) {
         this.driver = driver;
     }
        private By upperOrder = By.className("Button_Button__ra12g"); // локатор для кнопки "Заказать"
        private By cookieButton = By.className("App_CookieButton__3cvqF"); // локатор для кнопки куки
        private By howMuch = By.id("accordion__heading-0"); // локатор для кнопки "Сколько стоит? Как оплатит?"
        private By iWantSomeScooters = By.id("accordion__heading-1"); // локатор для кнопки "Хочу сразу несколько самокатов! Так можно"
        private By rentalTimeCalculated = By.id("accordion__heading-2"); // локатор для кнопки "Как рассчитывается время аренды?"
        private By orderScooterToday= By.id("accordion__heading-3"); // локатор для кнопки "Можно ли заказать самокат прямо на сегодня?"
        private By extendReturnScooter= By.id("accordion__heading-4"); // локатор для кнопки "Можно ли продлить заказ или вернуть самокат раньше?"
        private By chargingScooter= By.id("accordion__heading-5"); // локатор для кнопки "Вы привозите зарядку вместе с самокатом?"
        private By goingMKAD = By.id("accordion__heading-7"); // локатор для кнопки "Я жизу за МКАДом, привезёте?"
     public void clickCookieButton(){
     driver.findElement(cookieButton).click();}// метод для нажатия на кнопку Куки
     public void clickUpperOrder() {
     driver.findElement(upperOrder).click();
     } // метод для нажатия на кнопку на  кнопку "Заказать"
    public void testAccordion0(){
        WebElement textOne = driver.findElement(howMuch);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(By.id("accordion__panel-0")).getText());
    }
     public void testAccordion1(){
         WebElement textOne = driver.findElement(iWantSomeScooters);
         ((JavascriptExecutor) driver).executeScript("arguments[1].scrollIntoView();", textOne);
         textOne.click();
         assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement ( By.id("accordion__panel-1")).getText());
     }
     public void testAccordion2() {
         WebElement textOne = driver.findElement(rentalTimeCalculated);
         ((JavascriptExecutor) driver).executeScript("arguments[2].scrollIntoView();", textOne);
         textOne.click();
         assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", driver.findElement(By.id("accordion__panel-2")).getText());
     }
     public void testAccordion3() {
         WebElement textOne = driver.findElement(orderScooterToday);
         ((JavascriptExecutor) driver).executeScript("arguments[3].scrollIntoView();", textOne);
         textOne.click();
         assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", driver.findElement(By.id("accordion__panel-3")).getText());
     }
      public void testAccordion4() {
          WebElement textOne = driver.findElement(extendReturnScooter);
          ((JavascriptExecutor) driver).executeScript("arguments[4].scrollIntoView();", textOne);
          textOne.click();
          assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", driver.findElement(By.id("accordion__panel-4")).getText());
      }
      public void testAccordion5() {
          WebElement textOne = driver.findElement(chargingScooter);
          ((JavascriptExecutor) driver).executeScript("arguments[5].scrollIntoView();", textOne);
          textOne.click();
          assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", driver.findElement(By.id("accordion__panel-5")).getText());
      }
      public void testAccordion6() {
          WebElement textOne = driver.findElement(chargingScooter);
          ((JavascriptExecutor) driver).executeScript("arguments[6].scrollIntoView();", textOne);
          textOne.click();
          assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", driver.findElement(By.id("accordion__panel-6")).getText());
      }
      public void testAccordion7() {
          WebElement textOne = driver.findElement(goingMKAD);
          ((JavascriptExecutor) driver).executeScript("arguments[6].scrollIntoView();", textOne);
          textOne.click();
          assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", driver.findElement(By.id("accordion__panel-7")).getText());
      }


 }

