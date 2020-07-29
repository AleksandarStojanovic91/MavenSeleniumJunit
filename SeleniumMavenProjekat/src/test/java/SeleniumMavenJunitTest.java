import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMavenJunitTest {
    public static WebDriver driver;
    String URL = "http://www.google.com";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchGoogle() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("QAitive");
        Thread.sleep(5000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}