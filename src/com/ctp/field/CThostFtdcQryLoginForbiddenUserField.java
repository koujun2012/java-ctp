/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryLoginForbiddenUserField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryLoginForbiddenUserField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryLoginForbiddenUserField obj)
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
				ctpJNI.delete_CThostFtdcQryLoginForbiddenUserField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcQryLoginForbiddenUserField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcQryLoginForbiddenUserField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcQryLoginForbiddenUserField()
	{
		this(ctpJNI.new_CThostFtdcQryLoginForbiddenUserField(), true);
	}
}
