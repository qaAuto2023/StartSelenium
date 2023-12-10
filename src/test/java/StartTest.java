import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartTest {
    WebDriver webDriver;

    @BeforeTest
    public void precondition(){
        webDriver = new ChromeDriver();
        webDriver.get("https://telranedu.web.app/home");
    }

    @Test
    public void test(){

    }

    @AfterTest
    public void postcondition(){

    }
}
