import org.openqa.selenium.WebDriver;
import pages.MainPage;
import org.junit.Test;
import pages.OrderPage;


public class SecondTesk extends BaseTest{
   @Test public void checkLogo() {

        MainPage objMainPage = new MainPage(driver);

        objMainPage.clickCookieButton();
        objMainPage.clickFirstOrderButton();

        OrderPage objOderPage = new OrderPage(driver);
        objOderPage.clickLogo();

        objMainPage.checkBotton();
    }
    @Test public void checkLogoYandex() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCookieButton();
        objMainPage.clickLogoYandex();

    }
}
