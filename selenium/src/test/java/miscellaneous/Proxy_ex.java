package miscellaneous;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Proxy_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		// Add the WebDriver proxy capability.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:3337");
		
		options.setCapability("proxy", proxy);

		// Add a ChromeDriver-specific capability.
		options.addExtensions(new File("/path/to/extension.crx"));
		WebDriver driver = new ChromeDriver(options);
		
	}

}
