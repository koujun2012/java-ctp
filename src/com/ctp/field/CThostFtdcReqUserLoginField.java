/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcReqUserLoginField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcReqUserLoginField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcReqUserLoginField obj)
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
				ctpJNI.delete_CThostFtdcReqUserLoginField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_TradingDay_get(swigCPtr, this);
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_UserID_get(swigCPtr, this);
	}

	public void setPassword(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_Password_set(swigCPtr, this, value);
	}

	public String getPassword()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_Password_get(swigCPtr, this);
	}

	public void setUserProductInfo(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_UserProductInfo_set(swigCPtr, this, value);
	}

	public String getUserProductInfo()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_UserProductInfo_get(swigCPtr, this);
	}

	public void setInterfaceProductInfo(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_set(swigCPtr, this, value);
	}

	public String getInterfaceProductInfo()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_get(swigCPtr, this);
	}

	public void setProtocolInfo(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_ProtocolInfo_set(swigCPtr, this, value);
	}

	public String getProtocolInfo()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_ProtocolInfo_get(swigCPtr, this);
	}

	public void setMacAddress(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_MacAddress_get(swigCPtr, this);
	}

	public void setOneTimePassword(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_OneTimePassword_set(swigCPtr, this, value);
	}

	public String getOneTimePassword()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_OneTimePassword_get(swigCPtr, this);
	}

	public void setClientIPAddress(String value)
	{
		ctpJNI.CThostFtdcReqUserLoginField_ClientIPAddress_set(swigCPtr, this, value);
	}

	public String getClientIPAddress()
	{
		return ctpJNI.CThostFtdcReqUserLoginField_ClientIPAddress_get(swigCPtr, this);
	}

	public CThostFtdcReqUserLoginField()
	{
		this(ctpJNI.new_CThostFtdcReqUserLoginField(), true);
	}
}
