/**
 * 
 */
package com.fichadia.chat.model;

/**
 * @author Jay Fichadia
 *
 */
public enum Status
{

	AVAILABLE(1), BUSY(2), OFFLINE(3), AWAY(4), MEETING(5);

	private Status(int code)
	{
		this.code = code;
	}

	private int code;

	/**
	 * @return the code
	 */
	public int getCode()
	{
		return code;
	}

	@Override
	public String toString()
	{
		String result = null;
		switch (this)
		{
		case AVAILABLE:
			result = "Available";
			break;
		case AWAY:
			result = "Away";
			break;
		case BUSY:
			result = "Busy";
			break;
		case MEETING:
			result = "Meeting";
			break;
		case OFFLINE:
			result="Offline";
			break;
		default:
			break;
		}
		return result;
	}
}
