package tests;

import config.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.baseUrl = "https://yandex.ru/internet/";
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        Configuration.remote = config.remoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}
