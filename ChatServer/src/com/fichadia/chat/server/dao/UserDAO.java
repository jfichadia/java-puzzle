/**
 * 
 */
package com.fichadia.chat.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.fichadia.chat.model.UserBean;
import com.fichadia.chat.server.util.DBConnection;


/**
 * @author Jay Fichadia
 *
 */
public class UserDAO
{

	public void create(UserBean userToCreate)
	{
		if (userToCreate!=null)
		{
			try
			{
				Connection dbConnection = DBConnection.getConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO user values (?,?,?,?,?)");
				preparedStatement.setString(1, userToCreate.getName());
			} catch (Exception e)
			{
				e.printStackTrace();
			}

		}
	}
}
