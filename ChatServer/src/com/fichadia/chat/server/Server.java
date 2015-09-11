package com.fichadia.chat.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.fichadia.chat.definition.ChatConnector;
import com.fichadia.chat.server.impl.ChatConnectorImpl;

/**
 * 
 */

/**
 * @author Jay Fichadia
 *
 */
public class Server
{
	public static void bindChatConnector()
	{
		try
		{
			if (System.getSecurityManager()==null) {
				System.setSecurityManager(new SecurityManager());
			}			
			
			ChatConnector chatConnector = new ChatConnectorImpl();
			ChatConnector stub = (ChatConnector) UnicastRemoteObject.exportObject(chatConnector, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind(ChatConnector.class.getName(), stub);
			
			System.out.println("server started");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
