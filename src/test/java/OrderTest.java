import org.junit.Test;
import pages.MainList;
import pages.MainPage;
import pages.OrderPage;
import pages.Rentpage;

import static org.junit.Assert.assertTrue;
public class OrderTest extends BaseTest{
    @Test
    public void OrderingByFirstOrderButton() {

        MainPage objMainPage = new MainPage(driver);
        objMainPage.checkBotton();
        objMainPage.clickCookieButton();
        objMainPage.clickFirstOrderButton();

        OrderPage objOderPage = new OrderPage(driver);

        objOderPage.sendClientFirstName("Мария");
        objOderPage.sendClientSecondName("Николаева");
        objOderPage.sendDeliveryAddress("Питер, Кораблестроителей, 56");
        objOderPage.selectMetroStation("Марьина Роща");
        objOderPage.sendDeliveryClientPhoneNumber("555555555555");
        objOderPage.clickNextButton();


        Rentpage objRentPage = new Rentpage(driver);

        objRentPage.sendRentalDate("02.05.2026");
        objRentPage.setRentalTime();
        objRentPage.clickCheckBoxColourBlackPearl();
        objRentPage.sendComment("что то !");
        objRentPage.clickOrderButton();
        objRentPage.clickOrderButtonYes();


        boolean isDisplayed = new Rentpage(driver).isModalOrderWindowDisplayed();
        assertTrue("Ошибка", isDisplayed);
    }

    @Test
    public void sOrderingByFirstrOrderButton() {

        MainList objMainList = new MainList(driver);

        objMainList.scrollPageToEndOfList();

        MainPage objMainPage = new MainPage(driver);

        objMainPage.clickCookieButton();
        objMainPage.clickSecondtOrderButton();


        OrderPage objOderPage = new OrderPage(driver);

        objOderPage.sendClientFirstName("Мария");
        objOderPage.sendClientSecondName("Карпова");
        objOderPage.sendDeliveryAddress("Новый, Тереза, 11");
        objOderPage.selectMetroStation("Сокольники");
        objOderPage.sendDeliveryClientPhoneNumber("777777777777");
        objOderPage.clickNextButton();


        Rentpage objRentPage = new Rentpage(driver);

        objRentPage.sendRentalDate("09.05.2025");
        objRentPage.setRentalTime();
        objRentPage.clickCheckBoxColourGreyDespair();
        objRentPage.sendComment("Очень жду!");
        objRentPage.clickOrderButton();
        objRentPage.clickOrderButtonYes();
        boolean isDisplayed = new Rentpage(driver).isModalOrderWindowDisplayed();
        assertTrue("Ошибка...", isDisplayed);
    }
}
