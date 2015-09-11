/**
 * 
 */
package com.fichadia.chat.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			Connection dbConnection = null;
			try
			{
				dbConnection = DBConnection.getConnection();
				
				PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO user(name,email,password,dob) values (?,?,?,?)");
				preparedStatement.setString(1, userToCreate.getName());
				preparedStatement.setString(2, userToCreate.getEmail());
				preparedStatement.setString(3, userToCreate.getPassword());
				preparedStatement.setDate(4, userToCreate.getDob());
				preparedStatement.execute();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			finally {
				try
				{
					dbConnection.close();
				} catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
