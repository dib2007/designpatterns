package prototype;

public class RussianHumanPrototype implements HumanPrototype {

	private static final float height = 7;
	private static final String complexion = "FAIR";

	@Override
	public Human getClone() {
		Human human = new Human();
		human.hieght = RussianHumanPrototype.height;
		human.complexion = RussianHumanPrototype.complexion;
		return human;
	}

}
