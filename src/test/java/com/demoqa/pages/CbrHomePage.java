package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CbrHomePage {

    // Locators
    SelenideElement topHorizontalMenu = $(".home-header_top"),
            headerLogoRu = $(".home-header_top .header_logo"),
            headerLogoEn= $(".home-header_top .header_logo_eng"),
            headerLeftMenu = $(".home-header_top .header_menu"),
            activeSlide = $(".home-header_main .swiper-slide-active"),
            languageActive= $(".home-header_top .header_lang>._active"),
            languageNoActive = $(".home-header_top .header_lang_item>a");


    // Actions
    public CbrHomePage openPage() {
        open("/");
        return this;
    }


    public CbrHomePage checkHomeTitle(String  language) {

        if (language.equals("RU"))
        {
            assertEquals("Центральный банк Российской Федерации | Банк России", Selenide.title());
        }
        else
            assertEquals("The Central Bank of Russian Federation | Bank of Russia", Selenide.title());

        return this;

    }

    public CbrHomePage checkTopHorizontalMenuIsVisible() {

        topHorizontalMenu.should(visible);
        return this;
    }

    public CbrHomePage checkHeaderLogoIsVisible(String language) {

        if (language.equals("RU"))
        {
            headerLogoRu.should(visible);
        }
        else
            headerLogoEn.should(visible);

        return this;
    }


    public CbrHomePage  checkHeaderLeftMenuIsVisible() {
        headerLeftMenu.should(visible);
        return this;
    }
    public CbrHomePage  checkActiveSlideIsVisible() {
        activeSlide.should(visible);
        return this;
    }

    public CbrHomePage checkActiveLanguage(String language) {
        languageActive.shouldHave(text(language));
        return this;
    }

    public CbrHomePage switchToLanguage(String language) {
        languageNoActive.shouldHave(text(language)).click();
        return this;
    }

    public CbrHomePage  checkNoActiveLanguage(String language) {
        languageNoActive.shouldHave(text(language));
        return this;
    }

}