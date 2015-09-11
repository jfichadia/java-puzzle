/**
 * 
 */
package com.fichadia.chat.definition;

import java.rmi.Remote;
import java.rmi.RemoteException;

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

/**
 * @author Jay Fichadia
 *
 */
public interface ChatConnector extends Remote
{
	public LogInResponse logIn(LogInRequest logInRequest) throws RemoteException;
	
	public SignUpReponse signUp(SignUpRequest signUpRequest) throws RemoteException;
	
	public SendMessageReponse sendMesage(SendMessageRequest sendMessageRequest) throws RemoteException;
	
	public GetNewMessageResponse getNewMessages(GetNewMessageRequest getNewMessageRequest) throws RemoteException;
	
	public GetOnlineUsersResponse getOnlineUsers(GetOnlineUsersRequest getOnlineUsersRequest) throws RemoteException;
	
	public GetStatusResponse getStatus(GetStatusRequest getStatusRequest) throws RemoteException;
	
}
