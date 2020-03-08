package header;
public class CustomHeader implements HeaderInterface {

	@Override
	public void render() {
		System.out.println("Custom header");
	}
}