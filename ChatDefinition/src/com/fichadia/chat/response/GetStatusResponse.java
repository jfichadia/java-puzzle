/**
 * 
 */
package com.fichadia.chat.response;

import java.util.Map;

import com.fichadia.chat.model.Status;

/**
 * @author Jay Fichadia
 *
 */
public class GetStatusResponse extends ChatServerResponse
{

	private Map<String, Status> clientIDtoStatusMap;

	/**
	 * @return the clientIDtoStatusMap
	 */
	public Map<String, Status> getClientIDtoStatusMap()
	{
		return clientIDtoStatusMap;
	}

	/**
	 * @param clientIDtoStatusMap the clientIDtoStatusMap to set
	 */
	public void setClientIDtoStatusMap(Map<String, Status> clientIDtoStatusMap)
	{
		this.clientIDtoStatusMap = clientIDtoStatusMap;
	}
}
