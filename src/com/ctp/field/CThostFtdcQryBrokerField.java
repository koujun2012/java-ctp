/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryBrokerField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryBrokerField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryBrokerField obj)
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
				ctpJNI.delete_CThostFtdcQryBrokerField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcQryBrokerField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcQryBrokerField_BrokerID_get(swigCPtr, this);
	}

	public CThostFtdcQryBrokerField()
	{
		this(ctpJNI.new_CThostFtdcQryBrokerField(), true);
	}
}
