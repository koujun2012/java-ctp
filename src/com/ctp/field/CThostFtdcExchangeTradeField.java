/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcExchangeTradeField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExchangeTradeField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcExchangeTradeField obj)
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
				ctpJNI.delete_CThostFtdcExchangeTradeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_ExchangeID_get(swigCPtr, this);
	}

	public void setTradeID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradeID_set(swigCPtr, this, value);
	}

	public String getTradeID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradeID_get(swigCPtr, this);
	}

	public void setDirection(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_Direction_get(swigCPtr, this);
	}

	public void setOrderSysID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_OrderSysID_set(swigCPtr, this, value);
	}

	public String getOrderSysID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_OrderSysID_get(swigCPtr, this);
	}

	public void setParticipantID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_ClientID_get(swigCPtr, this);
	}

	public void setTradingRole(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradingRole_set(swigCPtr, this, value);
	}

	public char getTradingRole()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradingRole_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setOffsetFlag(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_OffsetFlag_set(swigCPtr, this, value);
	}

	public char getOffsetFlag()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_OffsetFlag_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_HedgeFlag_get(swigCPtr, this);
	}

	public void setPrice(double value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_Price_set(swigCPtr, this, value);
	}

	public double getPrice()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_Price_get(swigCPtr, this);
	}

	public void setVolume(int value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_Volume_get(swigCPtr, this);
	}

	public void setTradeDate(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradeTime_get(swigCPtr, this);
	}

	public void setTradeType(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradeType_set(swigCPtr, this, value);
	}

	public char getTradeType()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradeType_get(swigCPtr, this);
	}

	public void setPriceSource(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_PriceSource_set(swigCPtr, this, value);
	}

	public char getPriceSource()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_PriceSource_get(swigCPtr, this);
	}

	public void setTraderID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TraderID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_OrderLocalID_set(swigCPtr, this, value);
	}

	public String getOrderLocalID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_OrderLocalID_get(swigCPtr, this);
	}

	public void setClearingPartID(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_ClearingPartID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_BusinessUnit_get(swigCPtr, this);
	}

	public void setSequenceNo(int value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_SequenceNo_get(swigCPtr, this);
	}

	public void setTradeSource(char value)
	{
		ctpJNI.CThostFtdcExchangeTradeField_TradeSource_set(swigCPtr, this, value);
	}

	public char getTradeSource()
	{
		return ctpJNI.CThostFtdcExchangeTradeField_TradeSource_get(swigCPtr, this);
	}

	public CThostFtdcExchangeTradeField()
	{
		this(ctpJNI.new_CThostFtdcExchangeTradeField(), true);
	}
}
