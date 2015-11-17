/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcChangeAccountField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcChangeAccountField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcChangeAccountField obj)
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
				ctpJNI.delete_CThostFtdcChangeAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode()
	{
		return ctpJNI.CThostFtdcChangeAccountField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate()
	{
		return ctpJNI.CThostFtdcChangeAccountField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime()
	{
		return ctpJNI.CThostFtdcChangeAccountField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcChangeAccountField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value)
	{
		ctpJNI.CThostFtdcChangeAccountField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial()
	{
		return ctpJNI.CThostFtdcChangeAccountField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment()
	{
		return ctpJNI.CThostFtdcChangeAccountField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcChangeAccountField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_SessionID_get(swigCPtr, this);
	}

	public void setCustomerName(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName()
	{
		return ctpJNI.CThostFtdcChangeAccountField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType()
	{
		return ctpJNI.CThostFtdcChangeAccountField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
	}

	public String getIdentifiedCardNo()
	{
		return ctpJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
	}

	public void setGender(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_CountryCode_set(swigCPtr, this, value);
	}

	public String getCountryCode()
	{
		return ctpJNI.CThostFtdcChangeAccountField_CountryCode_get(swigCPtr, this);
	}

	public void setCustType(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType()
	{
		return ctpJNI.CThostFtdcChangeAccountField_CustType_get(swigCPtr, this);
	}

	public void setAddress(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Address_set(swigCPtr, this, value);
	}

	public String getAddress()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Address_get(swigCPtr, this);
	}

	public void setZipCode(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_ZipCode_set(swigCPtr, this, value);
	}

	public String getZipCode()
	{
		return ctpJNI.CThostFtdcChangeAccountField_ZipCode_get(swigCPtr, this);
	}

	public void setTelephone(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Telephone_set(swigCPtr, this, value);
	}

	public String getTelephone()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Telephone_get(swigCPtr, this);
	}

	public void setMobilePhone(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_MobilePhone_set(swigCPtr, this, value);
	}

	public String getMobilePhone()
	{
		return ctpJNI.CThostFtdcChangeAccountField_MobilePhone_get(swigCPtr, this);
	}

	public void setFax(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail()
	{
		return ctpJNI.CThostFtdcChangeAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
	}

	public char getMoneyAccountStatus()
	{
		return ctpJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
	}

	public void setBankAccount(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankPassWord_get(swigCPtr, this);
	}

	public void setNewBankAccount(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
	}

	public String getNewBankAccount()
	{
		return ctpJNI.CThostFtdcChangeAccountField_NewBankAccount_get(swigCPtr, this);
	}

	public void setNewBankPassWord(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
	}

	public String getNewBankPassWord()
	{
		return ctpJNI.CThostFtdcChangeAccountField_NewBankPassWord_get(swigCPtr, this);
	}

	public void setAccountID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Password_set(swigCPtr, this, value);
	}

	public String getPassword()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Password_get(swigCPtr, this);
	}

	public void setBankAccType(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankAccType_set(swigCPtr, this, value);
	}

	public char getBankAccType()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankAccType_get(swigCPtr, this);
	}

	public void setInstallID(int value)
	{
		ctpJNI.CThostFtdcChangeAccountField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_InstallID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
	}

	public char getVerifyCertNoFlag()
	{
		return ctpJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
	}

	public void setCurrencyID(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_CurrencyID_get(swigCPtr, this);
	}

	public void setBrokerIDByBank(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
	}

	public String getBrokerIDByBank()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
	}

	public void setBankPwdFlag(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
	}

	public char getBankPwdFlag()
	{
		return ctpJNI.CThostFtdcChangeAccountField_BankPwdFlag_get(swigCPtr, this);
	}

	public void setSecuPwdFlag(char value)
	{
		ctpJNI.CThostFtdcChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
	}

	public char getSecuPwdFlag()
	{
		return ctpJNI.CThostFtdcChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
	}

	public void setTID(int value)
	{
		ctpJNI.CThostFtdcChangeAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_TID_get(swigCPtr, this);
	}

	public void setDigest(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest()
	{
		return ctpJNI.CThostFtdcChangeAccountField_Digest_get(swigCPtr, this);
	}

	public void setErrorID(int value)
	{
		ctpJNI.CThostFtdcChangeAccountField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID()
	{
		return ctpJNI.CThostFtdcChangeAccountField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value)
	{
		ctpJNI.CThostFtdcChangeAccountField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg()
	{
		return ctpJNI.CThostFtdcChangeAccountField_ErrorMsg_get(swigCPtr, this);
	}

	public CThostFtdcChangeAccountField()
	{
		this(ctpJNI.new_CThostFtdcChangeAccountField(), true);
	}
}
