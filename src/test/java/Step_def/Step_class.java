package Step_def;

import Base_insurance.Base_class;
import PAK.Pom_Class;
import Runner_Pak.Runner_Class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import static Base_insurance.Base_class.driver;

public class Step_class  extends Base_class {

WebDriver driver=Runner_Class.driver;
    Pom_Class po=new Pom_Class(driver);




    @Given("user launching the url")
    public void user_launching_the_url() throws InterruptedException {
        maximize(driver);


        url(driver,"https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");
         Thread.sleep(3000);
    }
    @Given("user Entering the first name")
    public void user_entering_the_first_name() {
        credentials(po.getFirstname(),"Manoj");


    }
    @Given("user Entering the last name")
    public void user_entering_the_last_name() {
        credentials(po.getLastname(),"Kaarthick");



    }
    @Given("user Entering the date of birth")
    public void user_entering_the_date_of_birth() {

        credentials(po.getDob(),"05/15/1994");

    }
    @Given("user entering the mobilenumber")
    public void user_entering_the_mobilenumber() {
        credentials(po.getMobilenumber(),"7654747599");

    }
    @Given("user Entering the email")
    public void user_entering_the_email() {
        credentials(po.getEmail(),"manojkaarthick2@gmail.com");

    }


    @Then("user clicking the next button")
    public void userClickingTheNextButton() throws InterruptedException {
        clk((po.getNextbtn()));
        Thread.sleep(10000);

    }


    @Given("user entering the address")


   public void user_entering_the_address() throws AWTException, InterruptedException {

        credentials(po.getSearchbox(),"BW");
        Thread.sleep(2000);
        robo(driver);
        Thread.sleep(2000);
        enter(driver);

    }
    @Given("user selecting the treatment")
    public void user_selecting_the_treatment() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        clk(po.getMedication());
        Thread.sleep(2000);
        enter(driver);
    }





    @Given("user selecting the insurance type")
    public void user_selecting_the_insurance_type() throws AWTException, InterruptedException {



        clk(po.getInsurancetype());

        Thread.sleep(2000);
        for(int i=1;i<=4;i++){
            robo(driver);

        }
        enter(driver);
        Thread.sleep(2000);


    }
    @Given("user selecting the relationhip")
    public void user_selecting_the_relationhip() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        clk(po.getRelationship());
        Thread.sleep(2000);
        robo(driver);
        Thread.sleep(2000);
        enter(driver);

    }
    @Given("user selecting the policy holder name")
    public void user_selecting_the_policy_holder_name() throws InterruptedException {

        Thread.sleep(2000);

        credentials(po.getPolicyholdername(),"dinesh");


    }
    @Given("user selecting the  Dob")
    public void user_selecting_the_dob() throws InterruptedException, AWTException {
        Thread.sleep(2000);

        credentials(po.getPolicyholderdob(),"09/07/2000");
        enter(driver);

    }
    @Given("user selecting the gender")
    public void user_selecting_the_gender() throws AWTException, InterruptedException {

        clk(po.getSelectinggender());

        Thread.sleep(2000);
        robo(driver);
        enter(driver);

    }
    @Given("user Entering the policynumber")
    public void user_entering_the_policynumber() throws InterruptedException {
        Thread.sleep(2000);

        credentials(po.getPolicynumber(),"1233444");

    }
    @Given("user Entering the groupid")
    public void user_entering_the_groupid() throws InterruptedException {

        Thread.sleep(2000);
        credentials(po.getNewgroupid(),"7655550");



    }


    @And("user uploading the frontphoto")
    public void userUploadingTheFrontphoto() throws AWTException, InterruptedException {

        clk(po.getUploadingfrontphoto());
        Thread.sleep(2000);
        StringSelection v=new StringSelection("Pictures");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(v,null);
         paste(driver);
         enter(driver);

        StringSelection v1=new StringSelection("Screenshots");
        Thread.sleep(2000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(v1,null);
        paste(driver);
        enter(driver);

        StringSelection v2=new StringSelection("ss");
        Thread.sleep(2000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(v2,null);
        paste(driver);
        enter(driver);
        Thread.sleep(6000);






    }

    @And("user uploading the backphoto")
    public void userUploadingTheBackphoto() throws InterruptedException, AWTException {

        clk(po.getUploadingbackphoto());
        Thread.sleep(2000);
        StringSelection x=new StringSelection("Pictures");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
        paste(driver);
        enter(driver);

        StringSelection x1=new StringSelection("Screenshots");
        Thread.sleep(2000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x1,null);
        paste(driver);
        enter(driver);

        StringSelection x2=new StringSelection("mm");
        Thread.sleep(2000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x2,null);
        paste(driver);
        enter(driver);





    }

    @And("user agreeing terms and conditions")
    public void userAgreeingTermsAndConditions() {
        clk(po.getAgreetermsandcondition());

    }

    @Then("clicking the next button")
    public void clickingTheNextButton() {
        clk(po.getNextnewbutton());


    }
}
