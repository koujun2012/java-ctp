/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcVerifyFuturePasswordField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcVerifyFuturePasswordField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcVerifyFuturePasswordField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcVerifyFuturePasswordField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeCode_set(swigCPtr,
				this, value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeCode_get(
				swigCPtr, this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BankID_set(swigCPtr, this,
				value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BankID_get(swigCPtr,
				this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_set(swigCPtr,
				this, value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_get(
				swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BrokerID_get(
				swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeDate_set(swigCPtr,
				this, value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeDate_get(
				swigCPtr, this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeTime_set(swigCPtr,
				this, value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_TradeTime_get(
				swigCPtr, this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BankSerial_set(swigCPtr,
				this, value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BankSerial_get(
				swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_TradingDay_set(swigCPtr,
				this, value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_TradingDay_get(
				swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_set(swigCPtr,
				this, value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_get(
				swigCPtr, this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_LastFragment_set(swigCPtr,
				this, value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_LastFragment_get(
				swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_SessionID_set(swigCPtr,
				this, value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_SessionID_get(
				swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_AccountID_set(swigCPtr,
				this, value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_AccountID_get(
				swigCPtr, this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_Password_set(swigCPtr, this,
				value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_Password_get(
				swigCPtr, this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BankAccount_set(swigCPtr,
				this, value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BankAccount_get(
				swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_set(swigCPtr,
				this, value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_get(
				swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_InstallID_set(swigCPtr,
				this, value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_InstallID_get(
				swigCPtr, this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordField_TID_set(swigCPtr, this,
				value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcVerifyFuturePasswordField_TID_get(swigCPtr,
				this);
	}

	public CThostFtdcVerifyFuturePasswordField() {
		this(CtpJNI.new_CThostFtdcVerifyFuturePasswordField(), true);
	}

}