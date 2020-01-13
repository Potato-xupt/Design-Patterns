package proxy;

import java.net.MalformedURLException;
import java.net.URL;

import proxy.image.HighResolutionInage;

public class Client {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://image.jpg");
		HighResolutionInage highResolutionInage = new HighResolutionInage(url);
		ImageProxy imageProxy = new ImageProxy(highResolutionInage);
		imageProxy.show();
	}
}
