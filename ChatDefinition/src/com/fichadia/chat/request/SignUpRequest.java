/**
 * 
 */
package com.fichadia.chat.request;

import com.fichadia.chat.model.UserBean;

/**
 * @author Jay Fichadia
 *
 */
public class SignUpRequest extends ChatServerRequest
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3302902278370621857L;
	private UserBean newUser;

	/**
	 * @return the newUser
	 */
	public UserBean getNewUser()
	{
		return newUser;
	}

	/**
	 * @param newUser the newUser to set
	 */
	public void setNewUser(UserBean newUser)
	{
		this.newUser = newUser;
	}
	
	
}
