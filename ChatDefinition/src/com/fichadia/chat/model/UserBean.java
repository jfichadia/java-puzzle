/**
 * 
 */
package com.fichadia.chat.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Jay Fichadia
 *
 */
public class UserBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1139364481506025089L;
	public UserBean(String name, String email, int uid, String password, Date dob)
	{
		super();
		this.name = name;
		this.email = email;
		this.uid = uid;
		this.password = password;
		this.dob = dob;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * @return the uid
	 */
	public int getUid()
	{
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	/**
	 * @return the dob
	 */
	public Date getDob()
	{
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	private String name;
	private String email;
	private int uid;
	private String password;
	private Date dob;
}
