package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.CbrHomePage;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseCbr {
    CbrHomePage cbrHomePage = new  CbrHomePage();
  TextBoxPage textBoxPage= new TextBoxPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.cbr.ru";
        Configuration.browserSize = "1920x1080";
    }
}
