/**
 * 
 */
package PageObject;

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
	
	public String verifyBoardNameText() {
		
		String boardname;
		
		boardname=NewBoardFactory.pf.VerifyBoardName.;
		
		
		System.out.println(boardname);
		System.out.println("All executed");
		
		return boardname;
	}
	
}
