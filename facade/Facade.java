package facade;

import facade.movieSystem.MovieSystem;

public class Facade {
	MovieSystem movieSystem;
	public Facade(MovieSystem movieSystem) {
		this.movieSystem = movieSystem;
	}
	
	public void watchMovie(String cd) {
		movieSystem.turnOnTV();
		movieSystem.setCD(cd);
		movieSystem.startWatching();
	}
	
	public void overMovie(String cd) {
		movieSystem.turnOffTV();
		movieSystem.outCD(cd);
		movieSystem.endtWatching();
	}
}
