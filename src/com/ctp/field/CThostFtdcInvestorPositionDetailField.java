/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcInvestorPositionDetailField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInvestorPositionDetailField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcInvestorPositionDetailField obj)
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
				ctpJNI.delete_CThostFtdcInvestorPositionDetailField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_InstrumentID_get(swigCPtr, this);
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_InvestorID_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_get(swigCPtr, this);
	}

	public void setDirection(char value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_Direction_get(swigCPtr, this);
	}

	public void setOpenDate(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_OpenDate_set(swigCPtr, this, value);
	}

	public String getOpenDate()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_OpenDate_get(swigCPtr, this);
	}

	public void setTradeID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_TradeID_set(swigCPtr, this, value);
	}

	public String getTradeID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_TradeID_get(swigCPtr, this);
	}

	public void setVolume(int value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_Volume_get(swigCPtr, this);
	}

	public void setOpenPrice(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_OpenPrice_set(swigCPtr, this, value);
	}

	public double getOpenPrice()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_OpenPrice_get(swigCPtr, this);
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_SettlementID_get(swigCPtr, this);
	}

	public void setTradeType(char value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_TradeType_set(swigCPtr, this, value);
	}

	public char getTradeType()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_TradeType_get(swigCPtr, this);
	}

	public void setCombInstrumentID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_set(swigCPtr, this, value);
	}

	public String getCombInstrumentID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_ExchangeID_get(swigCPtr, this);
	}

	public void setCloseProfitByDate(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_set(swigCPtr, this, value);
	}

	public double getCloseProfitByDate()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_get(swigCPtr, this);
	}

	public void setCloseProfitByTrade(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_set(swigCPtr, this, value);
	}

	public double getCloseProfitByTrade()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_get(swigCPtr, this);
	}

	public void setPositionProfitByDate(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_set(swigCPtr, this, value);
	}

	public double getPositionProfitByDate()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_get(swigCPtr, this);
	}

	public void setPositionProfitByTrade(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_set(swigCPtr, this, value);
	}

	public double getPositionProfitByTrade()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_get(swigCPtr, this);
	}

	public void setMargin(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_Margin_set(swigCPtr, this, value);
	}

	public double getMargin()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_Margin_get(swigCPtr, this);
	}

	public void setExchMargin(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_ExchMargin_set(swigCPtr, this, value);
	}

	public double getExchMargin()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_ExchMargin_get(swigCPtr, this);
	}

	public void setMarginRateByMoney(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_set(swigCPtr, this, value);
	}

	public double getMarginRateByMoney()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_get(swigCPtr, this);
	}

	public void setMarginRateByVolume(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_set(swigCPtr, this, value);
	}

	public double getMarginRateByVolume()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_get(swigCPtr, this);
	}

	public void setLastSettlementPrice(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_set(swigCPtr, this, value);
	}

	public double getLastSettlementPrice()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_get(swigCPtr, this);
	}

	public void setSettlementPrice(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_set(swigCPtr, this, value);
	}

	public double getSettlementPrice()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_get(swigCPtr, this);
	}

	public void setCloseVolume(int value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_CloseVolume_set(swigCPtr, this, value);
	}

	public int getCloseVolume()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_CloseVolume_get(swigCPtr, this);
	}

	public void setCloseAmount(double value)
	{
		ctpJNI.CThostFtdcInvestorPositionDetailField_CloseAmount_set(swigCPtr, this, value);
	}

	public double getCloseAmount()
	{
		return ctpJNI.CThostFtdcInvestorPositionDetailField_CloseAmount_get(swigCPtr, this);
	}

	public CThostFtdcInvestorPositionDetailField()
	{
		this(ctpJNI.new_CThostFtdcInvestorPositionDetailField(), true);
	}
}
