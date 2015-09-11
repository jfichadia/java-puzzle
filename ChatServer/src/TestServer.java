import com.fichadia.chat.server.util.DBConnection;

/**
 * 
 */

/**
 * @author Jay Fichadia
 *
 */
public class TestServer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("trying to connect");
		System.out.println(DBConnection.getConnection());
	}

}
