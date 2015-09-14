package com.fichadia.chat.server.impl;
import java.rmi.RemoteException;

import com.fichadia.chat.definition.ChatConnector;
import com.fichadia.chat.request.GetNewMessageRequest;
import com.fichadia.chat.request.GetOnlineUsersRequest;
import com.fichadia.chat.request.GetStatusRequest;
import com.fichadia.chat.request.LogInRequest;
import com.fichadia.chat.request.SendMessageRequest;
import com.fichadia.chat.request.SignUpRequest;
import com.fichadia.chat.response.GetNewMessageResponse;
import com.fichadia.chat.response.GetOnlineUsersResponse;
import com.fichadia.chat.response.GetStatusResponse;
import com.fichadia.chat.response.LogInResponse;
import com.fichadia.chat.response.SendMessageReponse;
import com.fichadia.chat.response.SignUpReponse;
import com.fichadia.chat.server.factory.ChatServerHandlerFactory;

/**
 * 
 */

/**
 * @author Jay Fichadia
 *
 */
public class ChatConnectorImpl implements ChatConnector
{

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#logIn(com.fichadia.chat.request.LogInRequest)
	 */
	@Override
	public LogInResponse logIn(LogInRequest logInRequest) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#signUp(com.fichadia.chat.request.SignUpRequest)
	 */
	@Override
	public SignUpReponse signUp(SignUpRequest signUpRequest) throws RemoteException
	{
		return (SignUpReponse) ChatServerHandlerFactory.getHandler(signUpRequest).handleRequest(signUpRequest);
//		
//		
//		SignUpReponse response =new SignUpReponse();
//		response.setClientId("jay9dj");
//		response.setStatus(IErrorConstants.STATUS_OK);
//		try {
//			System.out.println(RemoteServer.getClientHost());
//		} catch (ServerNotActiveException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return response;
	}

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#sendMesage(com.fichadia.chat.request.SendMessageRequest)
	 */
	@Override
	public SendMessageReponse sendMesage(SendMessageRequest sendMessageRequest) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#getNewMessages(com.fichadia.chat.request.GetNewMessageRequest)
	 */
	@Override
	public GetNewMessageResponse getNewMessages(GetNewMessageRequest getNewMessageRequest) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#getOnlineUsers(com.fichadia.chat.request.GetOnlineUsersRequest)
	 */
	@Override
	public GetOnlineUsersResponse getOnlineUsers(GetOnlineUsersRequest getOnlineUsersRequest) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.fichadia.chat.definition.ChatConnector#getStatus(com.fichadia.chat.request.GetStatusRequest)
	 */
	@Override
	public GetStatusResponse getStatus(GetStatusRequest getStatusRequest) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
