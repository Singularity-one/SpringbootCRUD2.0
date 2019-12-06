package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerResponseBody {
	
	private String returnCode;

	private List<Customer> dataList;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public List<Customer> getDataList() {
		return dataList;
	}

	public void setDataList(List<Customer> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "CustomerResponseBody [returnCode=" + returnCode + ", dataList=" + dataList + "]";
	}

}
