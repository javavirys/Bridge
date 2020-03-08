package page;

import content.ContentInterface;
import content.ForgotPasswordContent;
import footer.FooterInterface;
import footer.WithoutFooter;
import header.CustomHeader;
import header.HeaderInterface;
import header.StandartHeader;

public class ForgotPassword extends BasePage {
	
	@Override
	public ContentInterface getContentInterface() {
		return new ForgotPasswordContent();
	}
	
	@Override
	public HeaderInterface getHeaderInterface() {
		// TODO Auto-generated method stub
		return new CustomHeader();
	}
	
	@Override
	public FooterInterface getFooterInterface() {
		// TODO Auto-generated method stub
		return new WithoutFooter();
	}
}
