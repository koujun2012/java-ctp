/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryProductField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryProductField obj)
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
				ctpJNI.delete_CThostFtdcQryProductField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setProductID(String value)
	{
		ctpJNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
	}

	public String getProductID()
	{
		return ctpJNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
	}

	public void setProductClass(char value)
	{
		ctpJNI.CThostFtdcQryProductField_ProductClass_set(swigCPtr, this, value);
	}

	public char getProductClass()
	{
		return ctpJNI.CThostFtdcQryProductField_ProductClass_get(swigCPtr, this);
	}

	public CThostFtdcQryProductField()
	{
		this(ctpJNI.new_CThostFtdcQryProductField(), true);
	}
}
