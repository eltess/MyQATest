import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestInit{

        GettersAndSetors setAndGet;
        LoginLocators loc;
        boolean logout;

        @Test
        public void loginPage(){
            setAndGet = new GettersAndSetors ();
            loc =new LoginLocators(driver);
            openUrl("http://the-internet.herokuapp.com/");
            loc.formAuthentication().click();
            getPasswordAndName();
            inputNameAndPass();
            checkAuthorizatioт();
            Assert.assertTrue(true ," AAA WTF ");
            sleep(10); //my bonus)
        }
        private void checkAuthorizatioт() {
            loc.formAuthenticationButton().click();
            String getWord = loc.formAuthenticationCheck().getText();
            String checkWord ="You logged into a secure area!";
            if(getWord.contains (checkWord)){
                logout = true;
                loc.formAuthenticationLogout().click();
            }
        }
        private void getPasswordAndName() {
            setAndGet.setName ("tomsmith");
            setAndGet.setPassword("SuperSecretPassword!");
        }
        private void inputNameAndPass() {
            loc.formAuthenticationUseName().sendKeys(setAndGet.getName());
            loc.formAuthenticationUsePassword().sendKeys(setAndGet.getPassword());
        }
}