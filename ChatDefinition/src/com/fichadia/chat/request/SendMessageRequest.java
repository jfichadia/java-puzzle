/**
 * 
 */
package com.fichadia.chat.request;

import com.fichadia.chat.model.ChatMessage;

/**
 * @author Jay Fichadia
 *
 */
public class SendMessageRequest extends ChatServerRequest
{
	private ChatMessage chatMessage;
	
	public void setChatMessage(ChatMessage chatMessage)
	{
		this.chatMessage = chatMessage;
	}
	
	public ChatMessage getChatMessage()
	{
		return chatMessage;
	}
}
