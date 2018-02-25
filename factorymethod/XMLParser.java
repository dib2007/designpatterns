package factorymethod;

public class XMLParser implements Parser {

	public XMLParser() {
		System.out.println("XML Parser created");
	}
	
	@Override
	public void parse(Document doc) {
		if(doc instanceof XMLDocument) {
			System.out.println("Parsing " + doc.getType() + " ....");
			return;
		}
		throw new IllegalArgumentException("Type of the document is illegal");
	}

}
