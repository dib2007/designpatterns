package prototype;

public class IndianHumanPrototype implements HumanPrototype {

	private static final float height = 5.8f;
	private static final String complexion = "DARK";

	@Override
	public Human getClone() {
		Human human = new Human();
		human.hieght = IndianHumanPrototype.height;
		human.complexion = IndianHumanPrototype.complexion;
		return human;
	}

}
