/**
 * 
 */
package PageObject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageFactory.ListFactory;
import Utiity.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class ListPO {

	public static ListPO Listpage;
	public static ListPO getListPO() {
		if(Listpage==null) {
			Listpage=new ListPO();
		}
		return Listpage;
	}
	
	
	public void clicklonAddaList() {
		ListFactory.pf.AddaList.click();
	}
	
	public void clickOnBody() {
		ListFactory.pf.CancelBtn.click();
	}
	
	public void enterTitle(String titlename) {
		ListFactory.pf.titlefield.sendKeys(titlename);
		
	}
	
	public void clickonAddListBtn() {
		ListFactory.pf.AddListBtn.click();
	}
	
	public void Verifying_The_Title_Name(String titlename) {
		String actual;
		actual=ListFactory.pf.CreatedTitleName.getAttribute("value");
		Assert.assertEquals(actual,titlename);
		
	}

	public void click_on_list_options() {
		ListFactory.pf.listOptions.click();
	}
	
	public void Delete_list() {
		ListFactory.pf.DeleteButton.click();
		
	}

	public void verifying_the_functionality_of_deletion() {
		
		String xpath="//input[@data-cy='list-name']";
		
		List<WebElement> elements = WebDriverHelper.getWebDriverHelper().getDriver().findElements(By.xpath(xpath));
        if (elements.size() == 0) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Deletion failed");
        }
		
	}
	
	
}
