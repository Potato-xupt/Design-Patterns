package facade;

import facade.movieSystem.MovieSystem;

public class Client {
	public static void main(String[] args) {
		MovieSystem movieSystem = new MovieSystem();
		Facade facade = new Facade(movieSystem);
		
		facade.watchMovie("变形金刚");
		System.out.println("Watching...");
		facade.overMovie("变形金刚");
	}
}
