/**
 * 
 */
package com.fichadia.chat.server.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Jay Fichadia
 *
 */
public class DBConnection
{
	private static Connection theConnection = null;

	// JDBC driver name and database URL
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/chatapp";

	// Database credentials
	private static final String USER = "jayf";
	private static final String PASS = "jayf";

	private DBConnection()
	{
	}

	public static Connection getConnection()
	{
		if (theConnection==null)
		{
			try
			{
				Class.forName(JDBC_DRIVER);
				theConnection = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return theConnection;
	}

}
