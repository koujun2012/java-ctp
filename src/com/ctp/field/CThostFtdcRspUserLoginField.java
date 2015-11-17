/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcRspUserLoginField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcRspUserLoginField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcRspUserLoginField obj)
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
				ctpJNI.delete_CThostFtdcRspUserLoginField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_TradingDay_get(swigCPtr, this);
	}

	public void setLoginTime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_LoginTime_set(swigCPtr, this, value);
	}

	public String getLoginTime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_LoginTime_get(swigCPtr, this);
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_UserID_get(swigCPtr, this);
	}

	public void setSystemName(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_SystemName_set(swigCPtr, this, value);
	}

	public String getSystemName()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_SystemName_get(swigCPtr, this);
	}

	public void setFrontID(int value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_SessionID_get(swigCPtr, this);
	}

	public void setMaxOrderRef(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_MaxOrderRef_set(swigCPtr, this, value);
	}

	public String getMaxOrderRef()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_MaxOrderRef_get(swigCPtr, this);
	}

	public void setSHFETime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_SHFETime_set(swigCPtr, this, value);
	}

	public String getSHFETime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_SHFETime_get(swigCPtr, this);
	}

	public void setDCETime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_DCETime_set(swigCPtr, this, value);
	}

	public String getDCETime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_DCETime_get(swigCPtr, this);
	}

	public void setCZCETime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_CZCETime_set(swigCPtr, this, value);
	}

	public String getCZCETime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_CZCETime_get(swigCPtr, this);
	}

	public void setFFEXTime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_FFEXTime_set(swigCPtr, this, value);
	}

	public String getFFEXTime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_FFEXTime_get(swigCPtr, this);
	}

	public void setINETime(String value)
	{
		ctpJNI.CThostFtdcRspUserLoginField_INETime_set(swigCPtr, this, value);
	}

	public String getINETime()
	{
		return ctpJNI.CThostFtdcRspUserLoginField_INETime_get(swigCPtr, this);
	}

	public CThostFtdcRspUserLoginField()
	{
		this(ctpJNI.new_CThostFtdcRspUserLoginField(), true);
	}
}
