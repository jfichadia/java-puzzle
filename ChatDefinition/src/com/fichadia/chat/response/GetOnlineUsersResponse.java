/**
 * 
 */
package com.fichadia.chat.response;

import java.util.List;

import com.fichadia.chat.model.UserBean;

/**
 * @author Jay Fichadia
 *
 */
public class GetOnlineUsersResponse extends ChatServerResponse
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1109103462335025632L;
	private List<UserBean> onlineUsersList;

	/**
	 * @return the onlineUsersList
	 */
	public List<UserBean> getOnlineUsersList()
	{
		return onlineUsersList;
	}

	/**
	 * @param onlineUsersList the onlineUsersList to set
	 */
	public void setOnlineUsersList(List<UserBean> onlineUsersList)
	{
		this.onlineUsersList = onlineUsersList;
	}
}
