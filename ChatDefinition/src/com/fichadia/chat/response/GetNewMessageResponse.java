/**
 * 
 */
package com.fichadia.chat.response;

import java.util.List;

import com.fichadia.chat.model.ChatMessage;

/**
 * @author Jay Fichadia
 *
 */
public class GetNewMessageResponse extends ChatServerResponse
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1461920825347137L;
	private List<ChatMessage> newMessagesList;

	/**
	 * @return the newMessagesList
	 */
	public List<ChatMessage> getNewMessagesList()
	{
		return newMessagesList;
	}

	/**
	 * @param newMessagesList the newMessagesList to set
	 */
	public void setNewMessagesList(List<ChatMessage> newMessagesList)
	{
		this.newMessagesList = newMessagesList;
	}
}
