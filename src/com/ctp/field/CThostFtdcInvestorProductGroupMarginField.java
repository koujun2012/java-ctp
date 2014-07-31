/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcInvestorProductGroupMarginField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcInvestorProductGroupMarginField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInvestorProductGroupMarginField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcInvestorProductGroupMarginField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setProductGroupID(String value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_set(
				swigCPtr, this, value);
	}

	public String getProductGroupID() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_get(
						swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_set(swigCPtr,
				this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_set(
				swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_get(
				swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_set(
				swigCPtr, this, value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_get(
				swigCPtr, this);
	}

	public void setSettlementID(int value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_set(
				swigCPtr, this, value);
	}

	public int getSettlementID() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_SettlementID_get(
						swigCPtr, this);
	}

	public void setFrozenMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_set(
				swigCPtr, this, value);
	}

	public double getFrozenMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_get(
						swigCPtr, this);
	}

	public void setLongFrozenMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_set(
				swigCPtr, this, value);
	}

	public double getLongFrozenMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_get(
						swigCPtr, this);
	}

	public void setShortFrozenMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_set(
				swigCPtr, this, value);
	}

	public double getShortFrozenMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_get(
						swigCPtr, this);
	}

	public void setUseMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_set(
				swigCPtr, this, value);
	}

	public double getUseMargin() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_get(
				swigCPtr, this);
	}

	public void setLongUseMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_set(
				swigCPtr, this, value);
	}

	public double getLongUseMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_get(
						swigCPtr, this);
	}

	public void setShortUseMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_set(
				swigCPtr, this, value);
	}

	public double getShortUseMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_get(
						swigCPtr, this);
	}

	public void setExchMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_set(
				swigCPtr, this, value);
	}

	public double getExchMargin() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_get(
				swigCPtr, this);
	}

	public void setLongExchMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_set(
				swigCPtr, this, value);
	}

	public double getLongExchMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_get(
						swigCPtr, this);
	}

	public void setShortExchMargin(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_set(
				swigCPtr, this, value);
	}

	public double getShortExchMargin() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_get(
						swigCPtr, this);
	}

	public void setCloseProfit(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_set(
				swigCPtr, this, value);
	}

	public double getCloseProfit() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_CloseProfit_get(
						swigCPtr, this);
	}

	public void setFrozenCommission(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_set(
				swigCPtr, this, value);
	}

	public double getFrozenCommission() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_get(
						swigCPtr, this);
	}

	public void setCommission(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_Commission_set(
				swigCPtr, this, value);
	}

	public double getCommission() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_Commission_get(
				swigCPtr, this);
	}

	public void setFrozenCash(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_set(
				swigCPtr, this, value);
	}

	public double getFrozenCash() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_get(
				swigCPtr, this);
	}

	public void setCashIn(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_set(swigCPtr,
				this, value);
	}

	public double getCashIn() {
		return CtpJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_get(
				swigCPtr, this);
	}

	public void setPositionProfit(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_set(
				swigCPtr, this, value);
	}

	public double getPositionProfit() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_PositionProfit_get(
						swigCPtr, this);
	}

	public void setOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_get(
						swigCPtr, this);
	}

	public void setLongOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getLongOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_get(
						swigCPtr, this);
	}

	public void setShortOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getShortOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_get(
						swigCPtr, this);
	}

	public void setExchOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getExchOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_get(
						swigCPtr, this);
	}

	public void setLongExchOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getLongExchOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_get(
						swigCPtr, this);
	}

	public void setShortExchOffsetAmount(double value) {
		CtpJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_set(
				swigCPtr, this, value);
	}

	public double getShortExchOffsetAmount() {
		return CtpJNI
				.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_get(
						swigCPtr, this);
	}

	public CThostFtdcInvestorProductGroupMarginField() {
		this(CtpJNI.new_CThostFtdcInvestorProductGroupMarginField(), true);
	}

}