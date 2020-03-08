package page;
import header.CustomHeader;
import header.HeaderInterface;

public class PageWithStandartHeader extends BasePage {
	
	@Override
	public void render() {
		super.render();
		System.out.println("render PageWithStandartHeader");
	}
	
	@Override
	public HeaderInterface getHeaderInterface() {
		return new CustomHeader();
	}
}