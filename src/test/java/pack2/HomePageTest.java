package pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.BasePage;
import pack1.homepage;

public class HomePageTest {

           homepage HP;
           BasePage bp;
           
           public HomePageTest()
           {
        	   HP = new homepage();
        	   bp = new BasePage();
           }
           
           @Test(enabled=true)
           public void verifytabs()
           {
        	   Assert.assertTrue(bp.elementFound(HP.getWomenmenu()));
        	   Assert.assertTrue(bp.elementFound(HP.getDressesmenu()));
        	   Assert.assertTrue(bp.elementFound(HP.getTshirtmenu()));
           }
           
           public void navigatabs()
           {
        	   Assert.assertTrue(bp.elementFound(HP.getWomennavigation()));
        	   Assert.assertTrue(bp.elementFound(HP.getDressesnavigation()));
        	   Assert.assertTrue(bp.elementFound(HP.getTshirtnavigation()));
           }
           /*
           @Test(enabled=false)
           public void checkEmailSubscription()
           {
        	   HP.getsubscription();
        	   Assert.assertTrue(HP.getSubcriptionMessage().contains("successfully"));
           }*/
           
}
