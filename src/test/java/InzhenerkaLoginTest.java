import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InzhenerkaLoginTest {
    @Test
    @Disabled("Тест временно отключен из-за проблемы X")
    void someTestThatFails() {
        System.out.println("Пример теста здесь");
    }
    @Test
    @DisplayName("Проверка логина")
    public void runLoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
        loginPage.logout();
    }

    @Test
    @DisplayName("Проверка логина и текста приветствия пользователя")
        public void userLoginAndCheckName(){
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("user");
        loginPage.setPassword("user123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
        loginPage.checkNameHeaderExists();
        loginPage.logout();
        }
    @ParameterizedTest
    @ValueSource(strings = {"admin"})
    public void loginWithDifferentUsers(String username) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername(username);
        loginPage.setPassword("admin123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
    }
}