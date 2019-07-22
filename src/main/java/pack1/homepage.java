package pack1;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BasePage{
	
	@FindBy(xpath= "//div/ul/li[1]/a[text()='Women']")
	private WebElement Womenmenu;
	
	@FindBy(xpath= "//div/ul/li[2]/a[text()='Dresses']")
	private WebElement Dressesmenu;
	
	@FindBy(xpath= "//div/ul/li[3]/a[text()='T-shirts']")
	private WebElement Tshirtmenu;
	
	
	
	/*	@FindBy(id= "newsletter-input")
	private WebElement mailid;
	
	@FindBy(name= "submitNewsletter")
	private WebElement sendmail;
	
	@FindBy(xpath= "//*[@class='columns-container']//p[@class='alert alert-cuccess']")
	private WebElement newsletter;
*/	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomenmenu()
	{
		return Womenmenu;
	}
	
	public WebElement getDressesmenu()
	{
		return Dressesmenu;
	}
	
	public WebElement getTshirtmenu()
	{
		return Tshirtmenu;
	}
	
	public WebElement getWomennavigation()
	{
		 Womenmenu.click();
         return Womenmenu;
	}
	
	public WebElement getDressesnavigation()
	{
		Dressesmenu.click();
		return Dressesmenu;
	}
	
	public WebElement getTshirtnavigation()
	{
		Tshirtmenu.click();
		return Tshirtmenu;
	}
/*	
	public void getsubscription()
	{
		int random = new Random().nextInt(500000);
		System.out.println(random);
		setText(mailid, "Automation" + random + "@gmail.com");
		sendmail.click();
		
	}

	public String getSubcriptionMessage() {
		
		return newsletter.getText();
		}
*/
}
