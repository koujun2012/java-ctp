/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryBrokerUserField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryBrokerUserField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryBrokerUserField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryBrokerUserField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryBrokerUserField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryBrokerUserField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcQryBrokerUserField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcQryBrokerUserField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcQryBrokerUserField() {
		this(CtpJNI.new_CThostFtdcQryBrokerUserField(), true);
	}

}