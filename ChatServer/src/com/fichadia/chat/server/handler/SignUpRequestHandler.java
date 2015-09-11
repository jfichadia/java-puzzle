/**
 * 
 */
package com.fichadia.chat.server.handler;

import com.fichadia.chat.request.ChatServerRequest;
import com.fichadia.chat.request.SignUpRequest;
import com.fichadia.chat.response.ChatServerResponse;

/**
 * @author Jay Fichadia
 *
 */
public class SignUpRequestHandler extends AbstractChatServerRequestHandler
{

	/* (non-Javadoc)
	 * @see com.fichadia.chat.server.handler.AbstractChatServerRequestHandler#handleRequest(com.fichadia.chat.request.ChatServerRequest)
	 */
	@Override
	public ChatServerResponse handleRequest(ChatServerRequest chatServerRequest)
	{
		if (chatServerRequest instanceof SignUpRequest)
		{
			
		}
		return null;
	}

}
