/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryExchangeExecOrderActionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryExchangeExecOrderActionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryExchangeExecOrderActionField obj)
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
				ctpJNI.delete_CThostFtdcQryExchangeExecOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setParticipantID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderActionField_TraderID_get(swigCPtr, this);
	}

	public CThostFtdcQryExchangeExecOrderActionField()
	{
		this(ctpJNI.new_CThostFtdcQryExchangeExecOrderActionField(), true);
	}
}