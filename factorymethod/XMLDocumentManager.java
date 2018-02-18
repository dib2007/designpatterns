package factorymethod;

public class XMLDocumentManager extends DocumentManager {

	@Override
	protected Parser createParser() {
		return new XMLParser();
	}

}
