/**
 * 
 */
package com.fichadia.chat.response;

import java.io.Serializable;

import com.fichadia.chat.definition.IErrorConstants;

/**
 * @author Jay Fichadia
 *
 */
public class ChatServerResponse implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9219520882457969351L;

	private int status;
	
	private int error_code;
	
	private int error_message;
	
	

	public ChatServerResponse()
	{

	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public int getError_code()
	{
		return error_code;
	}

	public void setError_code(int error_code)
	{
		this.error_code = error_code;
	}

	public int getError_message()
	{
		return error_message;
	}

	public void setError_message(int error_message)
	{
		this.error_message = error_message;
	}
	
	public boolean isOk()
	{
		return status == IErrorConstants.STATUS_OK ? true : false;
	}

}
