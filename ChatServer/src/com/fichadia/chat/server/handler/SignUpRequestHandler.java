/**
 * 
 */
package com.fichadia.chat.server.handler;

import com.fichadia.chat.definition.IErrorConstants;
import com.fichadia.chat.request.ChatServerRequest;
import com.fichadia.chat.request.SignUpRequest;
import com.fichadia.chat.response.ChatServerResponse;
import com.fichadia.chat.response.SignUpReponse;
import com.fichadia.chat.server.dao.UserDAO;
import com.mysql.fabric.Response;

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
			SignUpRequest signUpRequest = (SignUpRequest) chatServerRequest;
			UserDAO userDAO = new UserDAO();
			userDAO.create(signUpRequest.getNewUser());
			
			SignUpReponse response = new SignUpReponse();
			response.setStatus(IErrorConstants.STATUS_OK);
		}
		return null;
	}

}
