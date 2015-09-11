/**
 * 
 */
package com.fichadia.chat.response;

/**
 * @author Jay Fichadia
 *
 */
public class SignUpReponse extends ChatServerResponse
{

	private String clientId;

	/**
	 * @return the clientId
	 */
	public String getClientId()
	{
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId)
	{
		this.clientId = clientId;
	}
}
