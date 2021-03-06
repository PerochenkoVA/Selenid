import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderCardTest {


    @Test
    void testApplication() {
        open("http://localhost:9999");
        //  SelenideElement form = $("[data-test-id]");

        $("[data-test-id = 'name'] input").setValue("Владимир");
        $("[data-test-id  = 'phone'] input").setValue("+79268889977");
        $("span.checkbox__box").click();
        $("span.button__text").click();

        $(withText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.")).shouldBe();

    }
}

