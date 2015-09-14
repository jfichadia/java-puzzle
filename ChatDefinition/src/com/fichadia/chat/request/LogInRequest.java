/**
 * 
 */
package com.fichadia.chat.request;

/**
 * @author Jay Fichadia
 *
 */
public class LogInRequest extends ChatServerRequest
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3009692005019185462L;

	private String username;
	
	private String password;
	
	

	public String getUsername()
	{
		return username;
	}


	public void setUsername(String username)
	{
		this.username = username;
	}


	public String getPassword()
	{
		return password;
	}


	public void setPassword(String password)
	{
		this.password = password;
	}





	public LogInRequest(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;

	}
	
	
}
