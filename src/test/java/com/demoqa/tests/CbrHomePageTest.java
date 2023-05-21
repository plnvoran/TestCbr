package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import static com.demoqa.data.FieldsForRegistrationTestResult.*;
import static com.demoqa.data.ValuesForRegistrationsTest.*;

public class CbrHomePageTest extends TestBaseCbr {

    @Test
    void successfulOpenHome() {
        cbrHomePage.openPage()
                .checkHomeTitle()
                .checkTopHorizontalMenuIsVisible()
                .checkHeaderLeftMenuIsVisible()
                .checkHeaderLogoIsVisible()
                .checkActiveSlideIsVisible();
    }
}
