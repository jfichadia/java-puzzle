/**
 * 
 */
package com.fichadia.chat.model;

/**
 * @author Jay Fichadia
 *
 */
public class TextMessage extends ChatMessage
{
	private StringBuffer message;

	/**
	 * @return the message
	 */
	public StringBuffer getMessage()
	{
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(StringBuffer message)
	{
		this.message = message;
	}
}
