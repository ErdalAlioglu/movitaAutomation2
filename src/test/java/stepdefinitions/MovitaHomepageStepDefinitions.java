package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Objects;


public class MovitaHomepageStepDefinitions {

    MovitaPage movita = new MovitaPage();
    WebElement dropdownMenubutton;
    Select select;




    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr:9045/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasita_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());

    }

    //

    @And("User hover over Dropdown on the right corner to switch language")
    public void user_clicks_forEnglish() {
        ReusableMethods.hover(movita.dropdownMenubutton);


    }



    @And("clicks on the language button")
    public void user_clicks_on_the_Language_Button() {
        movita.dropdownMenubutton.click();

    }

    @Then("clicks on English on the dropdown menu")
    public void user_clicks_on_english_button() {
        ReusableMethods.waitForVisibility(movita.logo_eng, 3000);
        movita.logo_eng.click();

    }
    @And("Verify if Mobile Vehicle Traking System is displayed")
    public void verify_if_mobile_vehivle_traking_system_displayed(){

        ReusableMethods.waitForVisibility(movita.tum_sector_eng, 10000);
        Assert.assertTrue(movita.tum_sector_eng.isDisplayed());
        System.out.println("movita.tum_sector_eng = " + movita.tum_sector_eng);
    }

    @Then("clicks on Turkish on the dropdown menu")
    public void clicksOnTurkishOnButton() {
        ReusableMethods.waitForVisibility(movita.logo_turk,5);
        movita.logo_turk.click();
    }
    @Then("user hovers over rota_optimizasyon and verifies color change")
    public void hover_over_rota_optimizasyon(){
        String color_before= movita.rota_optimizasyon.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.rota_optimizasyon);

        String color_after=movita.rota_optimizasyon.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }
    @And("verifies rota_optimizasyon clickable")
    public void clickable(){
        ExpectedConditions.elementToBeClickable(movita.rota_optimizasyon);

    }
    @Then("user verifies rota string")
    public void verify_string(){
        String expected_rota_text="ROTA OPTIMIZASYONU";
        String s=movita.rota_optimizasyon.getText();
        Assert.assertEquals(expected_rota_text,s);

    }
    @Then("user hovers over uygulamalar and verifies color change")
    public void verify_color(){
        String color_before= movita.uygulamalar.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.uygulamalar);
        String color_after=movita.uygulamalar.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
    }
    @And("verifies uygulamalar clickable")
    public void clickable_uygulamalar(){
        ExpectedConditions.elementToBeClickable(movita.uygulamalar);


    }
    @Then("verify uygulamalar string")
    public void verify_uygulamalar_string(){
        String expected="UYGULAMALAR";
        String actual=movita.uygulamalar.getText();
        Assert.assertEquals(expected,actual);

    }

    @Then("user hovers over kilavuz and verifies color change")
    public void user_hovers_over_kilavuz_and_verifies_color_change() {
        String color_before= movita.kilavuz.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.kilavuz);
        String color_after=movita.kilavuz.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies kilavuz clickable")
    public void user_verifies_kilavuz_clickable() {
        ExpectedConditions.elementToBeClickable(movita.kilavuz);
    }
    @Then("verifies kilavuz string")
    public void verify_kilavuz_string() {
        String expected="KILAVUZ";
        String actual=movita.kilavuz.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over iletisim and verifies color change")
    public void user_hovers_over_iletisim_and_verifies_color_change() {
        String color_before= movita.iletisim.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.iletisim);
        String color_after=movita.iletisim.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies iletisim clickable")
    public void user_verifies_iletisim_clickable() {
        ExpectedConditions.elementToBeClickable(movita.iletisim);

    }
    @Then("verify iletisim string")
    public void verify_iletisim_string() {
        String expected="İLETİŞİM";
        String actual=movita.iletisim.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over giris and verifies color change")
    public void user_hovers_over_giris_and_verifies_color_change() {
        String color_before= movita.giris.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris);
        String color_after=movita.giris.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies giris clickable")
    public void user_verifies_giris_clickable() {
        ExpectedConditions.elementToBeClickable(movita.giris);

    }
    @Then("verify giris string")
    public void verify_giris_string() {
        String expected="GİRİŞ YAP";
        String actual=movita.giris.getText();
        Assert.assertEquals(expected,actual);

    }


    @Then("some_wait")
    public void some_wait() {
        ReusableMethods.waitFor(3);
    }


    @And("User hover over Dropdown on the right corner to switch languagetr")
        public void user_clicks_forTurkish() {
        ReusableMethods.hover(movita.logo_turk);


    }

    @Given("user navigates to {string}page")

    public void user_navigates_to_page(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty(movita));


    }


    @And("scroll down to {string}")
    // First step
    public void scroll_down_to(String element) throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(10000);

    }

    @Given("verify neden takip sistemi is displayed")
    public void verify_neden_takip_sistemi_is_displayed()  {
        String arananKelime = "NEDEN TAKİP SİSTEMİ";
        String sonucKelime = movita.takip.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        //  Thread.sleep(3000);

    }

    @Given("verify tse belgeli cihazlar is displayed")
    public void verify_tse_belgeli_cihazlar_is_displayed()  {
        String arananKelime = "TSE BELGELİ CİHAZLAR";
        String sonucKelime = movita.tse_belgeli_cihaz.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        //   Thread.sleep(3000);


    }
    @Given("verify ücretsiz inceleyin is  displayed")
    public void verify_ucretsiz_inceleyin_is_displayed() {
        String arananKelime = "ÜCRETSİZ İNCELEYİN";
        String sonucKelime = movita.ucretsiz_incele.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }

    @Given("verify yazilim ve teknolo gelistirme displayed")
    public void verifyYazilimVeTeknoloGelistirmeDisplayed() {
        String arananKelime = "Yazılım ve Teknoloji Geliştirme";
        String sonucKelime = movita.yazilim_gelistime.getText().toUpperCase();

        System.out.println("sonucKelime = " + arananKelime);


    }
    @Given("verify araç takip sistemi displayed")
    public void verify_arac_takip_sistemi_displayed() {

        String arananKelime = "ARAÇ TAKİP SİSTEMİ";
        String sonucKelime = movita.arac_takip.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify öne çıkan özelliklerimiz is displayed")
    public void verify_one_cikan_ozelliklerimiz_is_displayed() {

        String arananKelime = "ÖNE ÇIKAN ÖZELLİKLERİMİZ";
        String sonucKelime = movita.one_cikan_ozellikler.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify kolay erisim is displayed")
    public void verify_kolay_erisim_is_displayed() {

        String arananKelime = "KOLAY ERİŞİM";
        String sonucKelime = movita.kolay_erisim.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }

    @And("verify teknik_destek is displayed")
    public void verifyTeknik_destekIsDisplayed() throws InterruptedException {
        String arananKelime = "TEKNİK DESTEK";
        String sonucKelime = movita.teknik.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        Thread.sleep(3000);

    }
    @Given("verify sektore yönelik cözümler is displayed")
    public void verify_sektore_yonelik_cozumler_is_displayed() {


        String arananKelime = "SEKTÖRLERE YÖNELİK ÇÖZÜMLER";
        String sonucKelime = movita.sektore_yonelik_cozumler.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @And("hover over and verify arrow's color changed")
    public void hoverOverAndVerifyArrowSColorChanged() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);



    }

    @Then("click on arrow")
    public void clickOnArrow() {
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }

    @Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayed")
    public void verifyTümSektörlereHitapEdenÇözümlerIsDisplayed() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }


    @And("scroll down to {string} text")
    public void scrollDownToText(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(6000);
    }

    @Then("click on {string}")
    public void clickOn(String element) {
        ReusableMethods.clickWithTimeOut(movita.hakımızda_devamoku,6000);

    }

    @Then("verify Hakkımızda is displayed")
    public void verifyHakkımızdaIsDisplayed() {
        String arananKelime = "HAKKIMIZDA HAKKINDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @And("scroll down to  {string} text")
    public void scrollDownToText1(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(6000);
    }

    @Then("clickon {string}")
    public void clickon(String element) {
        ReusableMethods.clickWithTimeOut(movita.misyonumuz_devamoku,10000);

    }

    @Then("verify Hakkımızda_misyon is displayed")
    public void verifyHakkımızda_misyonIsDisplayed() throws InterruptedException {
        String arananKelime = "MİSYONUMUZ HAKKIMIZDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        Thread.sleep(6000);

    }


    @Then("verify Hakkımızda_ekibimiz is displayed")
    public void verifyHakkımızda_ekibimizIsDisplayed() {
        String arananKelime = "EKİBİMİZ HAKKIMIZDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @Then("clickonN {string}")
    public void clickonn(String element) {
        ReusableMethods.clickWithTimeOut(movita.ekibimiz_devamoku,6000);
    }
    //button renkler değişimi bölümü
    @And("hover over and verify hakımızda_devamoku color changedD")
    public void hoverOverAndVerifyHakımızda_devamokuColorChangedD() {

        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @And("hover over and verify misyonumuz_devamoku color changedD")
    public void hoverOverAndVerifyMisyonumuz_devamokuColorChangedD() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @And("hover over and verify ekibimiz_devamoku color changedD")
    public void hoverOverAndVerifyEkibimiz_devamokuColorChangedD() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }

    @And("go Tüm Sektörlere Hitap Eden Çözümler")
    public void goTümSektörlereHitapEdenÇözümler() throws InterruptedException {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }



    @And("hover over and verify arrowD's color changedD")
    public void hoverOverAndVerifyArrowSColorChangedD() {

        String color_before = movita.arrowD.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrowD);
        ReusableMethods.waitForVisibility(movita.arrowD, 5000);

        String color_after = movita.arrowD.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);



    }

    @Then("click on arrowD")
    public void clickOnArrowD() {
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }

    @Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayedD")
    public void verifyTümSektörlereHitapEdenÇözümlerIsDisplayedD() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,3000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }

    @And("back page")
    public void navigate_back_to() {
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

}

    @Given("Kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));

    }

    @When("anasayfada {string} butonuna tiklar")
    public void anasayfadaButonunaTiklar(String girisYap) {
        movita.girisYap.click();
    }

    @And("kullanici adi ve sifre  alanlarini gorur")
    public void kullanıcıAdiVeSifreAlanlariniGorur() {
        Assert.assertTrue(movita.username.isDisplayed());
        Assert.assertTrue(movita.password.isDisplayed());
    }

    @And("Movita Vasita Izleme Takip Sistemi yazisini ve onun uzerinde  Movita logosunu gorur")
    public void movitaVasitaIzlemeTakipSistemiYazisiniVeOnunUzerindeMovitaLogosunuGorur() {
        Assert.assertTrue(movita.logo.isDisplayed());
        Assert.assertTrue(movita.logoAltiYazi.isDisplayed());
    }

    @And("Mavi renk uzerinde Giris Yap butonu oldugunu gorur")
    public void maviRenkUzerindeGirisYapButonuOldugunuGorur() {
        Assert.assertTrue(movita.girisyapYazisi.isDisplayed());

    }

    @And("Giris Yap butonunun uzerinde Sifrenizi mi Unuttunuz? linkini gorur")
    public void girisYapButonununUzerindeSifreniziMiUnuttunuzLinkiniGorur() {
        Assert.assertTrue(movita.forgetPassword.isDisplayed());

    }



    @Then("Anasayfaya Don yazisini ve ← ikonunu gorur")
    public void anasayfayaDonYazisiniVeIkonunuGorur() {
        ReusableMethods.waitForVisibility(movita.anasayfayaDon, 5);
        Assert.assertTrue(movita.anasayfayaDon.isDisplayed());


    }

    @And("ikona \\(←) tikladigi zaman anasayfaya yonlendirilir")
    public void ikonaTikladigiZamanAnasayfayaYonlendirilir() {
        movita.anasayfayaDon.click();

    }

    @And("footer kismindaki yaziyi gorur")
    public void footerKismindakiYaziyiGorur() {
        Assert.assertTrue(movita.footer.isDisplayed());

    }

    @And("{string} kismina hover over yapinca yazinin renginin maviden yesile dondugunu gorur")
    public void kisminaHoverOverYapincaYazininRengininMavidenYesileDondugunuGorur(String renkDegisimi)  {
        String color_before= movita.forgetPassword.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.forgetPassword);
        ReusableMethods.waitForVisibility(movita.forgetPassword,3);

        String color_after=movita.forgetPassword.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }

    @And("{string} kisminin clickable oldugunu gorur")
    public void kismininClickableOldugunuGorur(String clickable) throws InterruptedException {

        ExpectedConditions.elementToBeClickable(movita.forgetPassword);
    }


//////// Login sayfasındaki ‘Şifrenizi mi Unuttunuz?’ sayfasının görünümü ve işlevselliği//////
    //////ENGİN AKGÜL////
@Then("giris yap tıkla")
public void giris_yap_tıkla() {
    ReusableMethods.clickWithTimeOut(movita.giris,10000);
}

    @Then("sifrenizi mi unuttunuz mu tıkla")
    public void sifreniziMiUnuttunuzMuTıkla() {

        ReusableMethods.clickWithTimeOut(movita.sifrenizi_unuttunuzmu,30000);

    }

    @Then("logo dogrulama")
    public void logo_dogrulama() {
        Assert.assertTrue(movita.movita_logo.isDisplayed());

    }

    @Then("sifre yenileme text dogrulama")
    public void sifre_yenileme_text_dogrulama() {
        String aranan = "Movita Şifre Yenileme";
        String sonuc = movita.SifreYenileme.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Yenileme başlığı = " + aranan);
    }

    @Then("kullanıcı adı giris alanı")
    public void kullanıcı_adı_giris_alanı() {
        String aranan = "Kullanıcı Adı Girişi Alanı";
        String sonuc = movita.kullanıcıAdı.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Kullanıcı Alanı = " + aranan);

    }

    @Then("telefon giris alanı")
    public void telefon_giris_alanı() throws InterruptedException {
        String aranan = "Telefon Girişi Alanı";
        String sonuc = movita.telefon.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Telefon Alanı = " + aranan);
        Thread.sleep(3000);

    }

    @Then("sifre degistir buttonu")
    public void sifre_degistir_buttonu() throws InterruptedException {
        String aranan = "Şifre Değiştir butonu";
        String sonuc = movita.sifre_degistir.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("şifre değiştir buttonu = " + aranan);
        Thread.sleep(3000);
    }

    @Then("foother dogrulama")
    public void foother_dogrulama() throws InterruptedException {
        String aranan = "Copyright © 2017 Movita , Bütün Hakları Saklıdır.";
        String sonuc = movita.foother.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("foother sonucu = " + aranan);
        Thread.sleep(5000);


    }

    @And("giris ekranı  hover over ve tıkla")
    public void girisEkranıHoverOverVeTıkla() {
        String color_before= movita.giris_ekranı.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris_ekranı);
        String color_after=movita.giris_ekranı.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
        ReusableMethods.clickWithTimeOut(movita.giris_ekranı,10000);

    }

    @Then("ana sayfaya dön")
    public void ana_sayfaya_dön() {
        ReusableMethods.clickWithTimeOut(movita.ana_sayfaya_dön,30000);

    }
    @When("kullanici sayfayi asagi indirir ve dorduncu sectionda durur")
    public void kullanici_sayfayi_asagi_indirir_ve_dorduncu_sectionda_durur() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(5000);

    }

    @Then("kullanici verilen String ve sayisal verileri dogrular")
    public void kullanici_verilen_string_ve_sayisal_verileri_dogrular() {

        System.out.println(movita.satirKod900K.getText());
        System.out.println(movita.memnunMusteri1500.getText());
        System.out.println(movita.yillikDeneyim5.getText());
        System.out.println(movita.cozumler20.getText());
        System.out.println(movita.mobilMovitaText.getText());


    }

    @Then("kullanici arrow sign üzerinde hoverover yapar")
    public void kullanici_arrow_sign_üzerinde_hoverover_yapar() {
        ReusableMethods.clickWithTimeOut(movita.arrow, 300);
    }

    @Then("kullanici arrow sign üzerinde renk degisikligini dogrular")
    public void kullanici_arrow_sign_üzerinde_renk_degisikligini_dogrular() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 500);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }

    @Then("kullanici arrow sign tiklar")
    public void kullanici_arrow_sign_tiklar() {
        movita.arrow.click();
    }

    @Then("kullanici arrow sign tiklayinca verilen stringi dogrular")
    public void kullanici_arrow_sign_tiklayinca_verilen_stringi_dogrular() {
        ReusableMethods.waitForVisibility(movita.hitapedencozümler, 100);
        Assert.assertTrue("Tüm Sektörlere Hitap Eden Çözümler", movita.hitapedencozümler.isDisplayed());

    }

    //MQA -33

    @When("kullanici sayfayi asagi indirir ve besinci sectionda durur")
    public void kullanici_sayfayi_asagi_indirir_ve_besinci_sectionda_durur() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(2000);
    }

    @Then("kullanici cozumler kisminda bulunan sekiz bolume hover over yapar ve strigleri verify eder")
    public void kullanici_cozumler_kisminda_bulunan_sekiz_bolume_hover_over_yapar_ve_strigleri_verify_eder() {


        Assert.assertTrue(movita.taksi_ve_ozel_araclar.isDisplayed());
        Assert.assertTrue(movita.minibus_ve_midibus.isDisplayed());
        Assert.assertTrue(movita.sehirlerarasi_otobusler.isDisplayed());
        Assert.assertTrue(movita.zirhli_tasima_araclari.isDisplayed());
        Assert.assertTrue(movita.okul_servisleri.isDisplayed());
        Assert.assertTrue(movita.belediye_ve_halkotobusu.isDisplayed());
        Assert.assertTrue(movita.yuk_ve_esya_tasiyan_araclar.isDisplayed());
        Assert.assertTrue(movita.guvenlik_kuvvetleri_araclari.isDisplayed());
    }


    @Then("kullanici {string} uzerine hover over yapar arkaplan renk degisimini verify eder")
    public void kullanici_uzerine_hover_over_yapar_arkaplan_renk_degisimini_verify_eder(String string) {
        String color_before = movita.yediden_yetmise.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.yediden_yetmise);
        ReusableMethods.waitForVisibility(movita.yediden_yetmise, 500);

        String color_after = movita.yediden_yetmise.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }

    @Then("kullanici {string} yazini click eder {string} stringini verify eder")
    public void kullanici_yazini_click_eder_stringini_verify_eder(String string, String string2) {
        movita.yediden_yetmise_clk.click();
        Assert.assertTrue(movita.yediden_yetmise_string.isDisplayed());
        movita.anasayfa.click();

    }
    @Given("kullanici movita sayfasına gider")
    public void kullanici_movita_sayfasına_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }

    @Then("kullanici ekranda verilen stringi verify eder")
    public void kullanici_ekranda_verilen_stringi_verify_eder() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }
    //MQA-63
    @Then("kullanici giris yap butonunu tikla")
    public void kullanici_giris_yap_butonunu_tikla() {
        movita.Giris_yap.click();
    }
    @Then("kullanici sifrenizi mi unuttunuz textlinkini görmeli")
    public void kullanici_sifrenizi_mi_unuttunuz_textlinkini_görmeli() {
        movita.sifrenizi_mi_unuttunuz.isDisplayed();
    }
    @Then("kullanici sifrenizi mi unuttunuz textlinkini tikla")
    public void kullanici_sifrenizi_mi_unuttunuz_textlinkini_tikla() {
        movita.sifrenizi_mi_unuttunuz.click();
    }
    @Then("kullanici sifre yenileme için kullanıcı adı ve telefon numarası girilecek textbox görmeli")
    public void kullanici_sifre_yenileme_için_kullanıcı_adı_ve_telefon_numarası_girilecek_textbox_görmeli() {
        movita.username_textbox.isDisplayed();
        movita.telefon_textbox.isDisplayed();
    }
    @Then("Kullanici veya telefon numarasını hatalı gir")
    public void kullanici_veya_telefon_numarasını_hatalı_gir() throws InterruptedException {
        movita.telefon_textbox.sendKeys("45345435435");
        movita.sifre_degistir_button.click();
        Thread.sleep(2000);

    }
    @Then("kullanici Lütfen kullanıcı adınızı veya telefon numaranızı doğru girdiğinizden emin olunuz mesajini almaliyim")
    public void kullanici_lütfen_kullanıcı_adınızı_veya_telefon_numaranızı_doğru_girdiğinizden_emin_olunuz_mesajini_almaliyim() {
        movita.kullanici_hata_mesaji_username.isDisplayed();
        movita.telefon_textbox.clear();
    }

    @Then("Kullanici ve telefon veya her ikisini boş birak")
    public void kullanici_ve_telefon_veya_her_ikisini_boş_birak() throws InterruptedException {
        movita.username_textbox.sendKeys("");
        movita.telefon_textbox.sendKeys("");
        movita.sifre_degistir_button.click();
        Thread.sleep(2000);
    }


    @Then("kullanici Lütfen kullanıcı adınızı girdiğinizden emin olun!,Lütfen Filoya ait telefon numarasını girdiğinizden emin olun! mesajini görmeli")
    public void kullanici_lütfen_kullanıcı_adınızı_girdiğinizden_emin_olun_lütfen_filoya_ait_telefon_numarasını_girdiğinizden_emin_olun_mesajini_görmeli() {
        String mesaj1=movita.kullanici_hata_mesaji_username.getText();
        String mesaj2=movita.kullanici_hata_mesaji_telefon.getText();
        System.out.println(mesaj1);
        System.out.println(mesaj2);
    }

    @Then("kullanici movita anasayfada oldugunu dogrular")
    public void kullanici_movita_anasayfada_oldugunu_dogrular() {
        String expected = "GİRİŞ YAP";
        String actual = movita.giris.getText();
        Assert.assertEquals(expected, actual);
    }

}
