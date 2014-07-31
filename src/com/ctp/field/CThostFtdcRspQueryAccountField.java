/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcRspQueryAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcRspQueryAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcRspQueryAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcRspQueryAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcRspQueryAccountField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcRspQueryAccountField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcRspQueryAccountField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcRspQueryAccountField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcRspQueryAccountField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcRspQueryAccountField_LastFragment_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_SessionID_get(swigCPtr,
				this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcRspQueryAccountField_CustomerName_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcRspQueryAccountField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcRspQueryAccountField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_CustType_set(swigCPtr, this,
				value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcRspQueryAccountField_CustType_get(swigCPtr,
				this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankPassWord_set(swigCPtr, this,
				value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankPassWord_get(swigCPtr,
				this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_AccountID_get(swigCPtr,
				this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_Password_set(swigCPtr, this,
				value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcRspQueryAccountField_Password_get(swigCPtr,
				this);
	}

	public void setFutureSerial(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_FutureSerial_set(swigCPtr, this,
				value);
	}

	public int getFutureSerial() {
		return CtpJNI.CThostFtdcRspQueryAccountField_FutureSerial_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_InstallID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_UserID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_VerifyCertNoFlag_set(swigCPtr,
				this, value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcRspQueryAccountField_VerifyCertNoFlag_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcRspQueryAccountField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankAccType_get(swigCPtr,
				this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_DeviceID_set(swigCPtr, this,
				value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_DeviceID_get(swigCPtr,
				this);
	}

	public void setBankSecuAccType(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankSecuAccType_set(swigCPtr,
				this, value);
	}

	public char getBankSecuAccType() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankSecuAccType_get(
				swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BrokerIDByBank_set(swigCPtr,
				this, value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setBankSecuAcc(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankSecuAcc_set(swigCPtr, this,
				value);
	}

	public String getBankSecuAcc() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankSecuAcc_get(swigCPtr,
				this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankPwdFlag_get(swigCPtr,
				this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcRspQueryAccountField_SecuPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcRspQueryAccountField_SecuPwdFlag_get(swigCPtr,
				this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcRspQueryAccountField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcRspQueryAccountField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_RequestID_set(swigCPtr, this,
				value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_RequestID_get(swigCPtr,
				this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcRspQueryAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcRspQueryAccountField_TID_get(swigCPtr, this);
	}

	public void setBankUseAmount(double value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankUseAmount_set(swigCPtr, this,
				value);
	}

	public double getBankUseAmount() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankUseAmount_get(
				swigCPtr, this);
	}

	public void setBankFetchAmount(double value) {
		CtpJNI.CThostFtdcRspQueryAccountField_BankFetchAmount_set(swigCPtr,
				this, value);
	}

	public double getBankFetchAmount() {
		return CtpJNI.CThostFtdcRspQueryAccountField_BankFetchAmount_get(
				swigCPtr, this);
	}

	public CThostFtdcRspQueryAccountField() {
		this(CtpJNI.new_CThostFtdcRspQueryAccountField(), true);
	}

}