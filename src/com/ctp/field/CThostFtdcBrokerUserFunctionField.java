/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcBrokerUserFunctionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcBrokerUserFunctionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcBrokerUserFunctionField obj)
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
				ctpJNI.delete_CThostFtdcBrokerUserFunctionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcBrokerUserFunctionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcBrokerUserFunctionField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcBrokerUserFunctionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcBrokerUserFunctionField_UserID_get(swigCPtr, this);
	}

	public void setBrokerFunctionCode(char value)
	{
		ctpJNI.CThostFtdcBrokerUserFunctionField_BrokerFunctionCode_set(swigCPtr, this, value);
	}

	public char getBrokerFunctionCode()
	{
		return ctpJNI.CThostFtdcBrokerUserFunctionField_BrokerFunctionCode_get(swigCPtr, this);
	}

	public CThostFtdcBrokerUserFunctionField()
	{
		this(ctpJNI.new_CThostFtdcBrokerUserFunctionField(), true);
	}
}
