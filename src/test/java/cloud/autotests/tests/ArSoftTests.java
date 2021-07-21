package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;



public class ArSoftTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка что есть надпись на главное странице")
    void titleTest() {
        step("Open url 'https://vr-arsoft.com/ru_RU/'", () ->
                open("https://vr-arsoft.com/ru_RU/"));

        step("Проверить что есть надпись `Сотрудники ООО «АР СОФТ» имеют колоссальный опыт в разработке  программного обеспечения`", () -> {
            $x("//div[@class='tb-line1-6 tb-f16-lg tb-description']").shouldHave(text("Сотрудники ООО «АР СОФТ» имеют колоссальный опыт в разработке  программного обеспечения"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка, что кнопка `отправить` формы обратной связи не кликабельна если НЕ выбран чекбокс 'Согласен на обработку персональных данных' ")
    void sendButtonIsNotClickableTest() {
        step("Open url 'https://vr-arsoft.com/ru_RU/'", () ->
                open("https://vr-arsoft.com/ru_RU/"));

        step("Проверить что кнопка 'Отправить' не кликабельна если НЕ выбран чекбокс `Согласен на обработку персональных данных`", () -> {
            $("input[value='отправить']").shouldBe(disabled);
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка, что кнопка `отправить` формы обратной связи кликабельна если выбран чекбокс 'Согласен на обработку персональных данных' ")
    void sendButtonIsClickableTest() {
        step("Open url 'https://vr-arsoft.com/ru_RU/'", () ->
                open("https://vr-arsoft.com/ru_RU/"));

        step("Выбрать чекбокс `Согласен на обработку персональных данных`", () -> {
            $("input[name='acceptance-288']").click();
        });

        step("Проверить что кнопка 'Отправить' кликабельна если выбран чекбокс `Согласен на обработку персональных данных`", () -> {
            $("input[value='отправить']").shouldBe(enabled);
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка что на странице `Контакты` указан телефон")
    void phoneNumberIsVisibleTest() {
        step("Open url 'https://vr-arsoft.com/ru_RU/contact/'", () ->
                open("https://vr-arsoft.com/ru_RU/contact/"));

        step("Проверить что есть надпись `8 (800) 234-55-25`", () -> {
            $x("//div[@class='tb-line1-6 tb-f16-lg tb-description']").shouldHave(text("8 (800) 234-55-25"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка что переход с главной страницу в группу в ВК осуществляется успешно")
    void openVkGroupTest() {
        step("Open url 'https://vr-arsoft.com/ru_RU/'", () ->
                open("https://vr-arsoft.com/ru_RU/"));

        step("Кликнуть значек `VK` в подвале сайта", () -> {

            $("html").sendKeys(Keys.END);
            $x("//i[@class='fab fa-vk']").click();
        });

        step("Проверить, что открылась группа в ВК", () -> {

            switchTo().window(1);
            $x("//div[@class='page_top']").shouldHave(text("АР СОФТ / Дополненная и виртуальная реальность /"));
        });

    }

}