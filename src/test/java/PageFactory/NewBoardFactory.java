/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiity.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class NewBoardFactory {

	
	public static NewBoardFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), NewBoardFactory.class);
	
	@FindBy(how =How.XPATH, using="//h1[text()=' Create new board ']")
	public WebElement createNewBoard;
	
	@FindBy(how=How.XPATH, using="//input[@class='new-board-input']")
	public WebElement boardTitle;
	
	@FindBy(how =How.XPATH, using="//button[@class='inline-block py-1 px-3 mt-1 h-8 text-sm font-normal text-center text-white bg-green7 hover:bg-green6 rounded-sm focus:outline-none']")
	public WebElement CreateBoardButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='board-title']")
	public WebElement VerifyBoardName;
	
	
	
}
