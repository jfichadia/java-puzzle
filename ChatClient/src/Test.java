import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.Calendar;

import com.fichadia.chat.definition.ChatConnector;
import com.fichadia.chat.model.UserBean;
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
			
			UserBean bean = new UserBean("Jay Fichadia", "fichadia.jay@gmail.com", 0, "jfichadia", Date.valueOf("1991-02-12"));
			SignUpRequest request = new SignUpRequest();
			request.setNewUser(bean);
			chatConnector.signUp(request);
			System.out.println("jay");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
