package factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		XMLDocumentManager xmlDocManager = new XMLDocumentManager();
		xmlDocManager.read(new XMLDocument());
		
		CSVDocumentManager csvDocManager = new CSVDocumentManager();
		csvDocManager.read(new CSVDocument());
	}

}
