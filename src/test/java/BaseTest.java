import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
    }

    @AfterEach
    public void tearDownTest() {
        // Выход из системы после каждого теста
        LoginPage loginPage = new LoginPage();
        loginPage.logout();
    }
}