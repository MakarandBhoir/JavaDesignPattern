package version1;

public class Movie extends Item {

	public Movie(){
		System.out.println("--- Movie ---");
	}
	private String runtime;

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
}
