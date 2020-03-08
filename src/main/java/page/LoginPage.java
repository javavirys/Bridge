package page;

import content.ContentInterface;
import content.LoginContent;

import footer.FooterInterface;
import footer.WithoutFooter;

public class LoginPage extends BasePage {

	@Override
	public ContentInterface getContentInterface() {
		// TODO Auto-generated method stub
		return new LoginContent();
	}
}
