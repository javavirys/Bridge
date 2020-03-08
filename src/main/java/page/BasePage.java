package page;
import header.HeaderInterface;
import header.StandartHeader;

import content.ContentInterface;
import content.StubContent;

import footer.StandartFooter;
import footer.FooterInterface;

public abstract class BasePage {

	public HeaderInterface getHeaderInterface() {
		return new StandartHeader();
	}
	
	public ContentInterface getContentInterface() {
		return new StubContent();
	}
	
	
	public FooterInterface getFooterInterface() {
		return new StandartFooter();
	}
	
	public void render() {
		getHeaderInterface().render();
		getContentInterface().render();
		getFooterInterface().render();
	}
}