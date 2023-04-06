package qa.test.configuration;

import org.springframework.boot.test.context.SpringBootTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
class ConfigurationApplicationTests {

	public static WebDriver driver;

	@BeforeTest
	public void setUp(){
	}

	@Test
	void testSelenium() {
	}

	@AfterTest
	public void cleanUp(){
	}

}
