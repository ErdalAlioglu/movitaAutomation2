package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
    public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public WebElement subKurumsalMenu;

    @FindBy(id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]")
    public WebElement dropdownMenubutton;

    @FindBy(xpath = "//a[@class=\"dropdown-item\"]")
    public WebElement logo_eng;

    @FindBy(xpath = "//a[@src=\"/app-assets/images/lang/turkFlag.png\"]")
    public WebElement logo_turk;

    @FindBy(xpath = "//div[@id=\"layer-126085703\"]")
    public WebElement mainTextEnglish;



    @FindBy(xpath = "//*[@href=\"/rota_optimizasyonu\"][1]")
    public WebElement rota_optimizasyon;

    @FindBy(xpath = "//*[@href=\"/uygulamalar\"]")
    public WebElement uygulamalar;

    @FindBy(xpath = "//*[@href=\"/guide\"]")
    public WebElement kilavuz;

    @FindBy(xpath = "//*[@href=\"/iletisim\"]")
    public WebElement iletisim;

    @FindBy(xpath = "//*[@href=\"/login\"]")
    public WebElement giris;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[5]/div/div[2]/h3")
    public WebElement arac_takip;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[6]/div/div[2]/h3")
    public WebElement one_cikan_ozellikler;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[7]/div/div[2]/h3")
    public WebElement kolay_erisim;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[8]/div/div[2]/h3")
    public WebElement teknik;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[9]/div/div[2]/h3")
    public WebElement sektore_yonelik_cozumler;




    @FindBy(xpath = "//i[@class=\"icon-wrench1\"]")
    public WebElement teknik_destek_icon;
    @FindBy(xpath = "//div[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"][1]")
    public WebElement tum_sektorler;

    @FindBy(xpath = "//div[text()=Provides Solutions for Different Areas\"]")
            public WebElement tum_sector_eng;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[4]/div/div[2]/h3")
    public WebElement yazilim_gelistime;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[3]/div/div[2]/h3")
    public WebElement ucretsiz_incele;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div/div[2]/h3")
    public WebElement tse_belgeli_cihaz;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/div/div[2]/h3")
    public WebElement takip;

    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrow;
    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrowD;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement hakkımızda_bilgi;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[1]/div/a")
    public WebElement hakımızda_devamoku;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[2]/div/h3")
    public WebElement misyonumuz;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[2]/div/a")
    public WebElement misyonumuz_devamoku;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[3]/div/h3")
    public WebElement ekibimiz;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[3]/div/a")
    public WebElement ekibimiz_devamoku;

    @FindBy (xpath = "//div[text()='GİRİŞ Yap']")
    public WebElement girisYap;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@alt='branding logo']")
    public WebElement logo;

    @FindBy (xpath = "//h6/span")
    public WebElement logoAltiYazi;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement girisyapYazisi;

    @FindBy (xpath = "//*[@class='card-link']")
    public WebElement forgetPassword;

    @FindBy (linkText = "//*[@class='card-link']")
    public WebElement forgetPasswordClick;

    @FindBy (xpath = "//*[@class='nav-link mr-2 nav-link-label']")
    public WebElement anasayfayaDon;

    @FindBy (xpath = "//*[@class='clearfix blue-grey lighten-2 text-sm-center mb-0 px-1']")
    public WebElement footer;

    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/fieldset[3]/div/a")
    public org.openqa.selenium.WebElement sifrenizi_unuttunuzmu;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[1]/div/img")
    public org.openqa.selenium.WebElement movita_logo;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[1]/h6/span")
    public org.openqa.selenium.WebElement SifreYenileme;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"username\"]")
    public org.openqa.selenium.WebElement kullanıcıAdı;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"telefon\"]")
    public org.openqa.selenium.WebElement telefon;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/fieldset[3]/div/a")
    public org.openqa.selenium.WebElement giris_ekranı;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/button")
    public org.openqa.selenium.WebElement sifre_degistir;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/footer[2]")
    public org.openqa.selenium.WebElement foother;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"navbar-mobile\"]/ul/li/a")
    public org.openqa.selenium.WebElement ana_sayfaya_dön;
    //mqa 32
    @FindBy(xpath = "//h5[text()=\"Satır Kod\"]")
    public WebElement satirKod900K;

    @FindBy(xpath = "//h5[text()=\"Memnun Müşteri\"]")
    public WebElement memnunMusteri1500;

    @FindBy(xpath = "//h5[text()=\"Çözümler\"]")
    public WebElement cozumler20;

    @FindBy(xpath = "//h5[text()=\"5 Yıllık Deneyim\"]")
    public WebElement yillikDeneyim5;

    @FindBy(xpath = "//h2[text()=\"movita mobil vasıta izleme takip sistemi\"]")
    public WebElement mobilMovitaText;


    @FindBy(xpath = "//div[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"]")
    public WebElement hitapedencozümler;

    //MQA-33
    @FindBy(xpath= "//*[@id=\"portfolio\"]/article[1]/div/div[1]/a")
    public WebElement taksi_ve_ozel_araclar;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[2]/div/div[1]/a")
    public WebElement minibus_ve_midibus;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[3]/div/div[1]/a")
    public WebElement sehirlerarasi_otobusler;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[4]/div/div[1]/a")
    public WebElement zirhli_tasima_araclari;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[5]/div/div[1]/a")
    public WebElement okul_servisleri;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[8]/div/div[1]/a")
    public WebElement belediye_ve_halkotobusu;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[7]/div/div[1]/a")
    public WebElement yuk_ve_esya_tasiyan_araclar;
    @FindBy(xpath = "//*[@id=\"portfolio\"]/article[6]/div/div[1]/a")
    public WebElement guvenlik_kuvvetleri_araclari;

    @FindBy(xpath = "//*[@id='content']/div/a")
    public WebElement cozumlerbutton;
    @FindBy(xpath = "//*[@id='content']/div/a")
    public WebElement cozumlerbutton_sonuc;


    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement kisi_bilgilendirme_tiklama;
    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement kisi_nesne_hayvan_takip_sistemi_tiklama;

    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement yediden_yetmise;
    @FindBy(xpath = "//*[@id=\"content\"]/div/a/div/strong")
    public WebElement yediden_yetmise_clk;
    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement yediden_yetmise_string;

    @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[1]/a/div")
    public WebElement anasayfa;
    //MQA-63
    @FindBy(xpath= "//*[@id=\"header-wrap\"]/div/div/a")
    public WebElement Giris_yap;
    @FindBy(linkText= "Şifrenizi mi unuttunuz?")
    public WebElement sifrenizi_mi_unuttunuz;
    @FindBy(id="username")
    public WebElement username_textbox;
    @FindBy(id="telefon")
    public WebElement telefon_textbox;
    @FindBy(xpath= "//ul[@role='alert']//li")
    public WebElement kullanici_hata_mesaji_username;
    @FindBy(xpath ="/html/body/div[2]/div/div[2]/div/form/button")
    public WebElement sifre_degistir_button;
    @FindBy(xpath = "//li[contains(text(),'Lütfen Filoya ait telefon numarasını girdiğinizden')]")
    public WebElement kullanici_hata_mesaji_telefon;

    //mqa-68
    @FindBy (xpath = "//*[@type='submit']")
    public WebElement kullaniciGiris;

    @FindBy (id = "main-menu-navigation")
    public WebElement menuler;

    @FindBy (xpath = "//*[@id='map']")
    public WebElement harita;

    @FindBy (xpath = "//*[@class='col-lg-2 col-md-2 text-xs-center']")
    public WebElement aracBilgileri;

    @FindBy (xpath = "//*[@id='anasayfa']")
    public WebElement anasayfaBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[1]")
    public WebElement raporlarBileseni;

    @FindBy (xpath = "//*[@id='harita_rota']")
    public WebElement aracRotaBileseni;

    @FindBy (xpath = "//*[@id='arac_video']")
    public WebElement videoFotoBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[2]")
    public WebElement guzergahBileseni;

    @FindBy (xpath = "//*[@id='alarm_listesi']")
    public WebElement alarmBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[3]")
    public WebElement rotaBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[4]")
    public WebElement personelBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[6]")
    public WebElement yonetimBileseni;

    @FindBy (xpath = "//*[text()='Müşteri İşlemleri']")
    public WebElement musteriIslemleri;

    @FindBy (xpath = "//*[text()='Personel İşlemleri']")
    public WebElement personelIslemleri;

    @FindBy (id = "main-menu-navigation")
    public WebElement tumBilesenler;

    @FindBy (xpath = "(//*[@class='menu-title'])[3]")
    public WebElement aracRotatextRengi;

    @FindBy (id = "ic-logo")
    public WebElement kullaniciSayfaLogo;

    @FindBy (xpath = "//*[@data-open='click']")
    public WebElement layout;

    @FindBy (xpath = "//*[@class='clearfix blue-grey lighten-2 text-sm-center mb-0 px-2']")
    public WebElement kullaniciSayfaFooter;

    //mqa-83

    @FindBy (xpath = "//*[text()='Şifrenizi mi unuttunuz?']")
    public WebElement sifreUnut;

    @FindBy (id = "username")
    public WebElement kullaniciAdi;

    @FindBy (id = "telefon")
    public WebElement telefonNo;

    @FindBy (xpath = "//*[text()=' Şifre Değiştir']")
    public WebElement sifreDegistir;
//MQA-98-99

    @FindBy(id ="username")
    public WebElement username_texbox_giris;
    @FindBy(id ="password")
    public WebElement password_texbox_giris;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/button")
    public WebElement ilk_giris_yap;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]/a/span")
    public WebElement raporlar;
    @FindBy(css = "a[href='/arac_rapor']")
    public WebElement arac_bazli_raporlar;
    @FindBy(xpath = "/html/body/div[3]/div/div/section/div/div[1]/div/div")
    public WebElement blog_1;
    @FindBy(xpath = "/html/body/div[3]/div/div/section/div/div[1]/div/div/div/div[4]/div/a/div")
    public WebElement rapor_al;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/div[1]/div/a[1]/i")
    public WebElement Excel_;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/div[1]/div/a[2]/i")
    public WebElement pdf_;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/div[1]/div/a[3]/i")
    public WebElement print;
    @FindBy(xpath = "/html/body/div[3]/div/div/section/div/div[2]/div/div[1]/div/ul/li/a/span")
    public WebElement detayli_filtre;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_previous\"]")
    public WebElement onceki;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_next\"]")
    public WebElement sonraki;
    @FindBy(xpath = "//*[@id=\"select2-aracSelect-container\"]")
    public WebElement secilen_arac;
    @FindBy(id= "tarih1")
    public WebElement tarih_1;
    @FindBy(id= "tarih2")
    public WebElement tarih_2;
    @FindBy(xpath= "//div[@id='navbar-mobile']//ul[1]//li[1]//a[1]//i[1]")
    public WebElement cizgi;
    @FindBy(xpath= "/html/body/div[3]/div/div/section/div/div[1]/div/div/div/div[1]/fieldset/span/span[1]/span/span[2]")
    public WebElement arac_arrow;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_paginate\"]/ul")
    public WebElement bos;
    @FindBy(xpath = "/html/body/div[3]/div/div/section/div/div[1]/div/div")
    public WebElement blog11;
    @FindBy(xpath = "/html/body/div[3]/div/div/section/div/div[2]/div/div[2]/div")
    public WebElement blog12;




}

