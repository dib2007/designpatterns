package factorymethod;

public class CSVDocument implements Document{

	@Override
	public String getType() {
		return "CSV";
	}

}
