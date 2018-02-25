package abstractfactory;

public class HumanFactory {

	public static Human getInstance(final int type) {
		if(type==0) {
			return new Male();
		}
		if(type==1) {
			return new Female();
		}
		throw new UnsupportedOperationException("Wrong selection");
	}
}
