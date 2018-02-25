package factorymethod;

public abstract class DocumentManager {
	private Parser parser;

	public DocumentManager() {
		this.parser = createParser();
	}
	
	public void read(Document doc) {
		parser.parse(doc);
	}

	// This is the Factory method
	protected abstract Parser createParser();
}
