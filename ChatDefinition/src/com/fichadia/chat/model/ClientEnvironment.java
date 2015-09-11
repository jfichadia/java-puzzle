/**
 * 
 */
package com.fichadia.chat.model;

import java.net.InetAddress;

/**
 * @author Jay Fichadia
 *
 */
public class ClientEnvironment
{

	private InetAddress clientNetworkAddres;

	public InetAddress getClientNetworkAddres()
	{
		return clientNetworkAddres;
	}

	public void setClientNetworkAddres(InetAddress clientNetworkAddres)
	{
		this.clientNetworkAddres = clientNetworkAddres;
	}

	public ClientEnvironment(InetAddress clientNetworkAddres)
	{
		super();
		this.clientNetworkAddres = clientNetworkAddres;
	}
}
