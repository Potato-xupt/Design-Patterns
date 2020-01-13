package proxy;

import proxy.image.HighResolutionInage;
import proxy.image.Image;

public class ImageProxy implements Image{
	
	private HighResolutionInage highResolutionInage;
	
	public ImageProxy(HighResolutionInage highResolutionInage) {
		this.highResolutionInage = highResolutionInage;
	}

	@Override
	public void show() {
		while(!highResolutionInage.isLoad()) {
			try {
				System.out.println("Temp Image...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		highResolutionInage.show();
	}
}
