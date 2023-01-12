package com.marat.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class GitTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1366x768";
    }

    @Test
    public void testForGit() {
        Selenide.open("https://www.avito.ru/");
        sleep(4000);
        $(".tooltip-target-wrapper-mu94t").click();
        $("[data-marker = 'top-rubricator/root-category-26195']").hover();
        $(byText("Рации")).click();
        $(".input-input-Zpzc1").setValue("Motorolla");
        sleep(2000);

    }
}
