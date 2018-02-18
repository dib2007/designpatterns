package builder;

public class BuilderTest {
	public static void main(String[] args) {
		Student s1 = new Student.Builder("Dibyendu", "007").clas("12").contact("9804020635").build();
		System.out.println(s1.toString());
	}
}
