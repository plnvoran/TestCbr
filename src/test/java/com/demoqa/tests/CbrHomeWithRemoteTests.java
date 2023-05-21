package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.data.FieldsForRegistrationTestResult.*;
import static com.demoqa.data.ValuesForRegistrationsTest.*;
import static io.qameta.allure.Allure.step;

@Tag("practice_form")
public class CbrHomeWithRemoteTests extends RemoteTestBase{

    @Test
    @Tag("smoke") @Tag("blocker")
    @DisplayName("Successful registration")
    void successfulRegistrationTest() {
        step("Open the page with the form", () -> {
            cbrHomePage.openPage();
        });




    }

}








