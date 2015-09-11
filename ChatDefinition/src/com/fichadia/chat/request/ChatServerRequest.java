/**
 * 
 */
package com.fichadia.chat.request;

import java.io.Serializable;

import com.fichadia.chat.model.ClientEnvironment;

/**
 * @author Jay Fichadia
 *
 */
public class ChatServerRequest implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7553898654305846781L;

	private ClientEnvironment clientEnvironment;
	
	private String clientID;

	/**
	 * @return the clientEnvironment
	 */
	public ClientEnvironment getClientEnvironment()
	{
		return clientEnvironment;
	}

	/**
	 * @param clientEnvironment the clientEnvironment to set
	 */
	public void setClientEnvironment(ClientEnvironment clientEnvironment)
	{
		this.clientEnvironment = clientEnvironment;
	}

	/**
	 * @return the clientID
	 */
	public String getClientID()
	{
		return clientID;
	}

	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(String clientID)
	{
		this.clientID = clientID;
	}

}
