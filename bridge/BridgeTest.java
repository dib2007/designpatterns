package bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Service bookingRestService = new BookingService(new RESTServiceImplementor());
		Service userSoapService = new UserService(new SOAPServiceImplementor());
	}
}
