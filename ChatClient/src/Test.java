import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.fichadia.chat.definition.ChatConnector;
import com.fichadia.chat.request.SignUpRequest;

/**
 * 
 */

/**
 * @author Jay Fichadia
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Registry reg=LocateRegistry.getRegistry(1099);
			ChatConnector chatConnector = (ChatConnector) reg.lookup(ChatConnector.class.getName());
			System.out.println(chatConnector.signUp(new SignUpRequest()).getClientId());
			System.out.println("jay");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
