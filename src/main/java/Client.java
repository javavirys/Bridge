import page.BasePage;
import page.ForgotPassword;
import page.LoginPage;
import page.PageWithStandartHeader;
import page.PageWithoutHeader;

public class Client {

	public static void main(String[] args) {
		BasePage page = new ForgotPassword();
		page.render();
	}
}
