package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("practice_form")
public class CbrHomeWithRemoteTests extends RemoteTestBase{

    @Test
    @Tag("smoke") @Tag("blocker")
    @DisplayName("Check main elements on Home")
    void successfulOpenHome() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });


        step("Check main elements on Home", () -> {
            cbrHomePage
                    .checkTopHorizontalMenuIsVisible()
                    .checkHeaderLeftMenuIsVisible()
                    .checkHeaderLogoIsVisible()
                    .checkActiveSlideIsVisible();

        });

    }
    @Test
    @Tag("smoke") @Tag("blocker")
    @DisplayName("Check that default language is RU")
    void checkDefaultLanguage() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });

        step("Check main elements on home page", () -> {
            cbrHomePage.checkActiveLanguage("RU");

        });

        step("Check RU Home title", () -> {
            cbrHomePage.checkHomeTitle("RU");

        });

    }

    @Test
    @Tag("smoke") @Tag("blocker")
    @DisplayName("Check available languages")
    void checkAvailableLanguages() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });

        step("Check available languages", () -> {
            cbrHomePage.checkNoActiveLanguage("EN");
            cbrHomePage.checkActiveLanguage("RU");
        });

    }

    @Test
    @Tag("smoke") @Tag("blocker")
    @DisplayName("Check EN Home title")
    void switchToEnglish() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });

        step("Switch to English", () -> {
            cbrHomePage.switchToLanguage("EN");

        });

        step("Check EN Home title", () -> {
            cbrHomePage.checkHomeTitle("EN");

        });
    }

    }








