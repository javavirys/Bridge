package page;

public class PageWithoutHeader extends BasePage {
	
	@Override
	public void render() {
		super.render();
		System.out.println("render PageWithoutHeader");
	}
}