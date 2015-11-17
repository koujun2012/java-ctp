/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcMarketDataStaticField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcMarketDataStaticField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcMarketDataStaticField obj)
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
				ctpJNI.delete_CThostFtdcMarketDataStaticField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setOpenPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_OpenPrice_set(swigCPtr, this, value);
	}

	public double getOpenPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_OpenPrice_get(swigCPtr, this);
	}

	public void setHighestPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_HighestPrice_set(swigCPtr, this, value);
	}

	public double getHighestPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_HighestPrice_get(swigCPtr, this);
	}

	public void setLowestPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_LowestPrice_set(swigCPtr, this, value);
	}

	public double getLowestPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_LowestPrice_get(swigCPtr, this);
	}

	public void setClosePrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_ClosePrice_set(swigCPtr, this, value);
	}

	public double getClosePrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_ClosePrice_get(swigCPtr, this);
	}

	public void setUpperLimitPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_set(swigCPtr, this, value);
	}

	public double getUpperLimitPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_get(swigCPtr, this);
	}

	public void setLowerLimitPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_set(swigCPtr, this, value);
	}

	public double getLowerLimitPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_get(swigCPtr, this);
	}

	public void setSettlementPrice(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_SettlementPrice_set(swigCPtr, this, value);
	}

	public double getSettlementPrice()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_SettlementPrice_get(swigCPtr, this);
	}

	public void setCurrDelta(double value)
	{
		ctpJNI.CThostFtdcMarketDataStaticField_CurrDelta_set(swigCPtr, this, value);
	}

	public double getCurrDelta()
	{
		return ctpJNI.CThostFtdcMarketDataStaticField_CurrDelta_get(swigCPtr, this);
	}

	public CThostFtdcMarketDataStaticField()
	{
		this(ctpJNI.new_CThostFtdcMarketDataStaticField(), true);
	}
}
