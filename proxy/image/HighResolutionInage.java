package proxy.image;

import java.net.URL;

public class HighResolutionInage implements Image{
	
	private URL imageURL;
	private long startTime;
	
	public HighResolutionInage(URL imageURL) {
		this.imageURL = imageURL;
		startTime = System.currentTimeMillis();
	}
	
	public boolean isLoad() {
		long currTime = System.currentTimeMillis();
		return currTime - startTime > 3000;
	}
	
	@Override
	public void show() {
		System.out.println("Real ImageURL:" + imageURL);
	}
}
