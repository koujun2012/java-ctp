/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcUserIPField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcUserIPField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcUserIPField obj)
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
				ctpJNI.delete_CThostFtdcUserIPField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcUserIPField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcUserIPField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcUserIPField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcUserIPField_UserID_get(swigCPtr, this);
	}

	public void setIPAddress(String value)
	{
		ctpJNI.CThostFtdcUserIPField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress()
	{
		return ctpJNI.CThostFtdcUserIPField_IPAddress_get(swigCPtr, this);
	}

	public void setIPMask(String value)
	{
		ctpJNI.CThostFtdcUserIPField_IPMask_set(swigCPtr, this, value);
	}

	public String getIPMask()
	{
		return ctpJNI.CThostFtdcUserIPField_IPMask_get(swigCPtr, this);
	}

	public void setMacAddress(String value)
	{
		ctpJNI.CThostFtdcUserIPField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress()
	{
		return ctpJNI.CThostFtdcUserIPField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcUserIPField()
	{
		this(ctpJNI.new_CThostFtdcUserIPField(), true);
	}
}
