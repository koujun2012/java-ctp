/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryInstrumentField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryInstrumentField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryInstrumentField obj)
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
				ctpJNI.delete_CThostFtdcQryInstrumentField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcQryInstrumentField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcQryInstrumentField_InstrumentID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcQryInstrumentField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcQryInstrumentField_ExchangeID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value)
	{
		ctpJNI.CThostFtdcQryInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID()
	{
		return ctpJNI.CThostFtdcQryInstrumentField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setProductID(String value)
	{
		ctpJNI.CThostFtdcQryInstrumentField_ProductID_set(swigCPtr, this, value);
	}

	public String getProductID()
	{
		return ctpJNI.CThostFtdcQryInstrumentField_ProductID_get(swigCPtr, this);
	}

	public CThostFtdcQryInstrumentField()
	{
		this(ctpJNI.new_CThostFtdcQryInstrumentField(), true);
	}
}
