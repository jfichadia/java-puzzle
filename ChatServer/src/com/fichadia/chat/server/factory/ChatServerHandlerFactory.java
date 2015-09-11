/**
 * 
 */
package com.fichadia.chat.server.factory;

import com.fichadia.chat.request.ChatServerRequest;
import com.fichadia.chat.request.GetNewMessageRequest;
import com.fichadia.chat.request.GetOnlineUsersRequest;
import com.fichadia.chat.request.GetStatusRequest;
import com.fichadia.chat.request.LogInRequest;
import com.fichadia.chat.request.SendMessageRequest;
import com.fichadia.chat.request.SignUpRequest;
import com.fichadia.chat.server.handler.AbstractChatServerRequestHandler;

/**
 * @author Jay Fichadia
 *
 */
public class ChatServerHandlerFactory
{
	public static AbstractChatServerRequestHandler getHandler(ChatServerRequest chatServerRequest)
	{
		if (chatServerRequest instanceof GetStatusRequest)
		{
			
		}
		if (chatServerRequest instanceof GetNewMessageRequest)
		{
			
		}
		if (chatServerRequest instanceof GetOnlineUsersRequest)
		{
			
		}
		if (chatServerRequest instanceof LogInRequest)
		{
			
		}
		if (chatServerRequest instanceof SendMessageRequest)
		{
			
		}
		if (chatServerRequest instanceof SignUpRequest)
		{
			
		}
		return null;
	}
}
