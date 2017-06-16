package version1;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("This is an example ").
		append("of the builder pattern. ").
		append("It has method to append ").
		append("almost anything we want to a String. ").
		append(16);
		
		System.out.println(sb.toString());

	}

}
