package Runner_Pak;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Manoj\\IdeaProjects\\Insurance\\src\\test\\java\\Feature",
        glue = "Step_def",dryRun = false
     )

public class Runner_Class {

    public static WebDriver driver;

    @BeforeClass

    public static void browser(){
        driver=new ChromeDriver();
    }



}
