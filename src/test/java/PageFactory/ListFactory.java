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
public class ListFactory {

	public static ListFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), ListFactory.class);
	
	@FindBy(how =How.XPATH, using="//div[@data-cy='create-list']")
	public WebElement AddaList;
	
	
	@FindBy(how=How.XPATH,using="//*[name()='svg' and @data-cy='cancel']")
	public WebElement CancelBtn;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter list title...']")
	public WebElement titlefield;
	
	@FindBy(how=How.XPATH, using="//button[@class='inline-block py-1 px-3 mt-1 h-8 text-sm font-normal text-center text-white bg-green7 hover:bg-green6 rounded-sm focus:outline-none']")
	public WebElement AddListBtn;
	
	@FindBy(how=How.XPATH, using="//input[@data-cy='list-name']")
	public WebElement CreatedTitleName;
	
	@FindBy(how=How.XPATH, using="//button[@data-cy='list-options']")
	public WebElement listOptions;
	
	@FindBy(how=How.XPATH, using="//div[@data-cy='delete-list']")
	public WebElement DeleteButton;
	
	
	
}
