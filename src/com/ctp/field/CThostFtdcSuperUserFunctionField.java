/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcSuperUserFunctionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcSuperUserFunctionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcSuperUserFunctionField obj)
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
				ctpJNI.delete_CThostFtdcSuperUserFunctionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcSuperUserFunctionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcSuperUserFunctionField_UserID_get(swigCPtr, this);
	}

	public void setFunctionCode(char value)
	{
		ctpJNI.CThostFtdcSuperUserFunctionField_FunctionCode_set(swigCPtr, this, value);
	}

	public char getFunctionCode()
	{
		return ctpJNI.CThostFtdcSuperUserFunctionField_FunctionCode_get(swigCPtr, this);
	}

	public CThostFtdcSuperUserFunctionField()
	{
		this(ctpJNI.new_CThostFtdcSuperUserFunctionField(), true);
	}
}
