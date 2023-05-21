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
           headerLogo= $(".home-header_top .header_logo"),
            headerLeftMenu = $(".home-header_top .header_menu"),
            activeSlide = $(".home-header_main .swiper-slide-active"),
           homeTitle= $("head>title");


    // Actions
    public CbrHomePage openPage() {
        open("/");
        return this;
    }


    public CbrHomePage checkHomeTitle() {
        assertEquals("Центральный банк Российской Федерации | Банк России", Selenide.title());
        return this;

    }


    public CbrHomePage checkTopHorizontalMenuIsVisible() {

        topHorizontalMenu.should(visible);
        return this;
    }

    public CbrHomePage checkHeaderLogoIsVisible() {

        headerLogo.should(visible);
        return this;
    }

    public CbrHomePage  checkHeaderLeftMenuIsVisible() {
        headerLeftMenu.should(visible);
        return this;
    }

    public CbrHomePage  checkActiveSlideIsVisible() {
        headerLeftMenu.should(visible);
        return this;
    }


}