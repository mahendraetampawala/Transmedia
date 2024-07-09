/**
 * 
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageFactory.NewBoardFactory;
import Utiity.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class NewBoardPO {

	public static NewBoardPO NewBoardpage;
	public static NewBoardPO getnewboardPO() {
		if(NewBoardpage==null) {
			NewBoardpage=new NewBoardPO();
		}
		return NewBoardpage;
	}
	
	public void clicklonNewBoard() {
		NewBoardFactory.pf.createNewBoard.click();
	}
	public void entertheTitle(String boardTitle) {
		NewBoardFactory.pf.boardTitle.sendKeys(boardTitle);
	}
	
	public void clickOnCreateBoard() {
		NewBoardFactory.pf.CreateBoardButton.click();
	}
	
	public void verifyBoardNameText(String titlename) {
		
		String Actualboardname;
		
		Actualboardname=NewBoardFactory.pf.VerifyBoardName.getAttribute("value");
		
		Assert.assertEquals(Actualboardname,titlename);

		
		System.out.println(Actualboardname);
		System.out.println("All executed");
		
	}
	
}
