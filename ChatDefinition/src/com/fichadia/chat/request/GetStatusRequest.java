/**
 * 
 */
package com.fichadia.chat.request;

import java.util.List;

/**
 * @author Jay Fichadia
 *
 */
public class GetStatusRequest extends ChatServerRequest
{

	private List<String> clientList;

	/**
	 * @return the clientList
	 */
	public List<String> getClientList()
	{
		return clientList;
	}

	/**
	 * @param clientList the clientList to set
	 */
	public void setClientList(java.util.List<String> clientList)
	{
		this.clientList = clientList;
	}
	
}
