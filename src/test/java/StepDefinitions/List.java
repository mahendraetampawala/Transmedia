package StepDefinitions;

import PageFactory.ListFactory;

import PageObject.ListPO;
import Utiity.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List {

	
/*	@Given("should be inside a board")
	public void should_be_inside_a_board() {
	   System.out.println("a");
	}
*/
	@Given("User clicks on Add a list")
	public void user_clicks_on_add_a_list() throws InterruptedException {
		
		
		WebDriverHelper.getWebDriverHelper().waitPageLoad(ListFactory.pf.CancelBtn);
		ListPO.getListPO().clickOnBody();
		
		Thread.sleep(2000);
	    ListPO.getListPO().clicklonAddaList();
	    
	    System.out.println("Passed");
	}

	@Given("User enters the list title as {string}")
	public void user_enters_the_list_title_as(String titlename) {
	 
		ListPO.getListPO().enterTitle(titlename);
		System.out.println("Title entered");
	}

	@When("User clicks on Add list")
	public void user_clicks_on_add_list() {
	  
		ListPO.getListPO().clickonAddListBtn();
		System.out.println("Add list button clicked");
	}

	@Then("Verifying the added list equals to {string}")
	public void verifying_the_added_list_equals_to(String Titlename) {
		
		WebDriverHelper.getWebDriverHelper().waitPageLoad(ListFactory.pf.CreatedTitleName);
	    ListPO.getListPO().Verifying_The_Title_Name(Titlename);
	  
	}

	/*------------------------------- Deleting a list--------------------------------------------*/
	
	
	@Given("user clicks on three dots")
	public void user_clicks_on_three_dots() {
	    ListPO.getListPO().click_on_list_options();
	}

	@When("user clicks on delete list")
	public void user_clicks_on_delete_list() throws InterruptedException {
		ListPO.getListPO().Delete_list();
		Thread.sleep(2000);
	}

	@Then("Verifying that the item deleted successfully")
	public void verifying_that_the_item_deleted_successfully() {
		
	    ListPO.getListPO().verifying_the_functionality_of_deletion();
	}


	
}
