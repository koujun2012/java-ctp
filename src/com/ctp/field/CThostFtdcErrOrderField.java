/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcErrOrderField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcErrOrderField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcErrOrderField obj)
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
				ctpJNI.delete_CThostFtdcErrOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcErrOrderField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcErrOrderField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcErrOrderField_InstrumentID_get(swigCPtr, this);
	}

	public void setOrderRef(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_OrderRef_set(swigCPtr, this, value);
	}

	public String getOrderRef()
	{
		return ctpJNI.CThostFtdcErrOrderField_OrderRef_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcErrOrderField_UserID_get(swigCPtr, this);
	}

	public void setOrderPriceType(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_OrderPriceType_set(swigCPtr, this, value);
	}

	public char getOrderPriceType()
	{
		return ctpJNI.CThostFtdcErrOrderField_OrderPriceType_get(swigCPtr, this);
	}

	public void setDirection(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection()
	{
		return ctpJNI.CThostFtdcErrOrderField_Direction_get(swigCPtr, this);
	}

	public void setCombOffsetFlag(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_CombOffsetFlag_set(swigCPtr, this, value);
	}

	public String getCombOffsetFlag()
	{
		return ctpJNI.CThostFtdcErrOrderField_CombOffsetFlag_get(swigCPtr, this);
	}

	public void setCombHedgeFlag(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_CombHedgeFlag_set(swigCPtr, this, value);
	}

	public String getCombHedgeFlag()
	{
		return ctpJNI.CThostFtdcErrOrderField_CombHedgeFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value)
	{
		ctpJNI.CThostFtdcErrOrderField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice()
	{
		return ctpJNI.CThostFtdcErrOrderField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeTotalOriginal(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
	}

	public int getVolumeTotalOriginal()
	{
		return ctpJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_get(swigCPtr, this);
	}

	public void setTimeCondition(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_TimeCondition_set(swigCPtr, this, value);
	}

	public char getTimeCondition()
	{
		return ctpJNI.CThostFtdcErrOrderField_TimeCondition_get(swigCPtr, this);
	}

	public void setGTDDate(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_GTDDate_set(swigCPtr, this, value);
	}

	public String getGTDDate()
	{
		return ctpJNI.CThostFtdcErrOrderField_GTDDate_get(swigCPtr, this);
	}

	public void setVolumeCondition(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_VolumeCondition_set(swigCPtr, this, value);
	}

	public char getVolumeCondition()
	{
		return ctpJNI.CThostFtdcErrOrderField_VolumeCondition_get(swigCPtr, this);
	}

	public void setMinVolume(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_MinVolume_set(swigCPtr, this, value);
	}

	public int getMinVolume()
	{
		return ctpJNI.CThostFtdcErrOrderField_MinVolume_get(swigCPtr, this);
	}

	public void setContingentCondition(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_ContingentCondition_set(swigCPtr, this, value);
	}

	public char getContingentCondition()
	{
		return ctpJNI.CThostFtdcErrOrderField_ContingentCondition_get(swigCPtr, this);
	}

	public void setStopPrice(double value)
	{
		ctpJNI.CThostFtdcErrOrderField_StopPrice_set(swigCPtr, this, value);
	}

	public double getStopPrice()
	{
		return ctpJNI.CThostFtdcErrOrderField_StopPrice_get(swigCPtr, this);
	}

	public void setForceCloseReason(char value)
	{
		ctpJNI.CThostFtdcErrOrderField_ForceCloseReason_set(swigCPtr, this, value);
	}

	public char getForceCloseReason()
	{
		return ctpJNI.CThostFtdcErrOrderField_ForceCloseReason_get(swigCPtr, this);
	}

	public void setIsAutoSuspend(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_IsAutoSuspend_set(swigCPtr, this, value);
	}

	public int getIsAutoSuspend()
	{
		return ctpJNI.CThostFtdcErrOrderField_IsAutoSuspend_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit()
	{
		return ctpJNI.CThostFtdcErrOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setRequestID(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID()
	{
		return ctpJNI.CThostFtdcErrOrderField_RequestID_get(swigCPtr, this);
	}

	public void setUserForceClose(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_UserForceClose_set(swigCPtr, this, value);
	}

	public int getUserForceClose()
	{
		return ctpJNI.CThostFtdcErrOrderField_UserForceClose_get(swigCPtr, this);
	}

	public void setErrorID(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID()
	{
		return ctpJNI.CThostFtdcErrOrderField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value)
	{
		ctpJNI.CThostFtdcErrOrderField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg()
	{
		return ctpJNI.CThostFtdcErrOrderField_ErrorMsg_get(swigCPtr, this);
	}

	public void setIsSwapOrder(int value)
	{
		ctpJNI.CThostFtdcErrOrderField_IsSwapOrder_set(swigCPtr, this, value);
	}

	public int getIsSwapOrder()
	{
		return ctpJNI.CThostFtdcErrOrderField_IsSwapOrder_get(swigCPtr, this);
	}

	public CThostFtdcErrOrderField()
	{
		this(ctpJNI.new_CThostFtdcErrOrderField(), true);
	}
}
