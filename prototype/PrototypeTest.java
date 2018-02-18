package prototype;

public class PrototypeTest {
	public static void main(String[] args) {
		HumanPrototype humProto = new IndianHumanPrototype();
		Human hm = humProto.getClone();
		System.out.println(hm);
	}
}
