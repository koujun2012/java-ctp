/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcBrokerUserPasswordField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcBrokerUserPasswordField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
	}

	public void setPassword(String value)
	{
		ctpJNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
	}

	public String getPassword()
	{
		return ctpJNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
	}

	public CThostFtdcBrokerUserPasswordField()
	{
		this(ctpJNI.new_CThostFtdcBrokerUserPasswordField(), true);
	}
}
