/**
 * 
 */
package StepDefinitions;

import PageFactory.NewBoardFactory;
import PageObject.NewBoardPO;
import Utiity.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class NewBoard {

	
	@Given("Directing to the {string}")
	public void directing_to_the(String URL) {
		
		WebDriverHelper.getWebDriverHelper().webdriverInitilizer();
		WebDriverHelper.getWebDriverHelper().getURL(URL);
		
		System.out.println("This completed");
	}
	
	@Given("user clicks on create new board")
	public void user_clicks_on_create_new_board() {
	   
		WebDriverHelper.getWebDriverHelper().waitPageLoad(NewBoardFactory.pf.createNewBoard);
		NewBoardPO.getnewboardPO().clicklonNewBoard();
		System.out.println("This worked");
		
	}

	@Given("user enters the board title as {string}")
	public void user_enters_the_board_title_as(String Title) {
	 
		NewBoardPO.getnewboardPO().entertheTitle(Title);
		System.out.println("Board Title Entered");
	}

	@When("user clicks on create board")
	public void user_clicks_on_create_board() {
	   
		NewBoardPO.getnewboardPO().clickOnCreateBoard();
		System.out.println("Create board button clicked");
	}

	@Then("validate the created board")
	public void validate_the_created_board() throws InterruptedException {
	  
		//WebDriverHelper.getWebDriverHelper().waitPageLoad(NewBoardFactory.pf.VerifyBoardName);
		Thread.sleep(2000);
		NewBoardPO.getnewboardPO().verifyBoardNameText();
		
		
	}

}
