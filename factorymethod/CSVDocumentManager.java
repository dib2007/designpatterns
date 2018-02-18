package factorymethod;

public class CSVDocumentManager extends DocumentManager {

	@Override
	protected Parser createParser() {
		return new CSVParser();
	}

}
