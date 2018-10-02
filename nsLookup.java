import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Scanner;

public class nsLookup {
	public static void main(String args[]) throws UnknownHostException {
		// Take input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a url: ");

		while(scanner.hasNextLine()) {
		String inputAddress = scanner.nextLine();

		// Convert the url to its public IP address
		InetAddress ip1 = Inet4Address.getByName(inputAddress);

		// Display the conversion
		System.out.println("The public IP address for " + inputAddress + " is " + ip1.getHostAddress() + ".");
		scanner.close();
		}
	}
}