/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcContractBankField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcContractBankField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcContractBankField obj)
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
				ctpJNI.delete_CThostFtdcContractBankField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcContractBankField_BrokerID_get(swigCPtr, this);
	}

	public void setBankID(String value)
	{
		ctpJNI.CThostFtdcContractBankField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID()
	{
		return ctpJNI.CThostFtdcContractBankField_BankID_get(swigCPtr, this);
	}

	public void setBankBrchID(String value)
	{
		ctpJNI.CThostFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
	}

	public String getBankBrchID()
	{
		return ctpJNI.CThostFtdcContractBankField_BankBrchID_get(swigCPtr, this);
	}

	public void setBankName(String value)
	{
		ctpJNI.CThostFtdcContractBankField_BankName_set(swigCPtr, this, value);
	}

	public String getBankName()
	{
		return ctpJNI.CThostFtdcContractBankField_BankName_get(swigCPtr, this);
	}

	public CThostFtdcContractBankField()
	{
		this(ctpJNI.new_CThostFtdcContractBankField(), true);
	}
}
