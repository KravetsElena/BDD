package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public final SelenideElement loginField = $("[data-test-id=login] input");
    public final SelenideElement passwordField = $("[data-test-id=password] input");
    public final SelenideElement loginButton = $("data-test-id=action-login");


    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}
