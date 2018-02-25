package factorymethod;

public class CSVParser implements Parser {

	public CSVParser() {
		System.out.println("CSV Parser created");
	}
	
	@Override
	public void parse(Document doc) {
		if(doc instanceof CSVDocument) {
			System.out.println("Parsing " + doc.getType() + " ....");
			return;
		}
		throw new IllegalArgumentException("Type of the document is illegal");
	}

}
