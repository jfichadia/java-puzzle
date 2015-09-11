/**
 * 
 */
package com.fichadia.chat.model;

import java.util.Date;

/**
 * @author Jay Fichadia
 *
 */
public abstract class ChatMessage
{

	private Date messageSentDate;
	
	private String senderID;
	
	/**
	 * @return the messageSentDate
	 */
	public Date getMessageSentDate()
	{
		return messageSentDate;
	}

	/**
	 * @param messageSentDate the messageSentDate to set
	 */
	public void setMessageSentDate(Date messageSentDate)
	{
		this.messageSentDate = messageSentDate;
	}

	/**
	 * @return the senderID
	 */
	public String getSenderID()
	{
		return senderID;
	}

	/**
	 * @param senderID the senderID to set
	 */
	public void setSenderID(String senderID)
	{
		this.senderID = senderID;
	}

	/**
	 * @return the receiverID
	 */
	public String getReceiverID()
	{
		return receiverID;
	}

	/**
	 * @param receiverID the receiverID to set
	 */
	public void setReceiverID(String receiverID)
	{
		this.receiverID = receiverID;
	}

	private String receiverID;
}
