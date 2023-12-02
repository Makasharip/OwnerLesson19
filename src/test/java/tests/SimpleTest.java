package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest extends TestBase{

    @Test
    void simpleTest() {
        open(baseUrl);
        $(".layout__title").shouldHave(text("ДАННЫЕ О ПОЛЬЗОВАТЕЛЕ"));
    }
}
