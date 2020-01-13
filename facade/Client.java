package facade;

import facade.movieSystem.MovieSystem;

public class Client {
	public static void main(String[] args) {
		MovieSystem movieSystem = new MovieSystem();
		Facade facade = new Facade(movieSystem);
		
		facade.watchMovie("���ν��");
		System.out.println("Watching...");
		facade.overMovie("���ν��");
	}
}
