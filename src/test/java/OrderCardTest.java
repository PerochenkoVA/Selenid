import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;


public class OrderCardTest {


    @Test
    void testApplication() {
        open("http://localhost:9999");
        SelenideElement form = $("[data-test-id]");
        form.$("[data-test-id = 'name'] input").setValue("Владимир");

        form.$("[data-test-id = name] input").setValue("+79268889977");
        form.$("[data-test-id = agreement] input").click(); //чек бокс
        form.$("[button]").click(); // кнопка "продолжить"

        //$("").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    private WebDriver driver;
}
