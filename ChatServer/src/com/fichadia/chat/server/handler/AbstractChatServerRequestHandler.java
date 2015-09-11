/**
 * 
 */
package com.fichadia.chat.server.handler;

import com.fichadia.chat.request.ChatServerRequest;
import com.fichadia.chat.response.ChatServerResponse;

/**
 * @author Jay Fichadia
 *
 */
public abstract class AbstractChatServerRequestHandler
{

	public abstract ChatServerResponse handleRequest(ChatServerRequest chatServerRequest);
}
