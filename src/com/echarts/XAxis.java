package com.echarts;

import java.util.List;

/**
* @Title:XAxis 
* @Description: 
* @author Shen Zhenfei
* @date 2016-10-25上午10:05:26
 */
public class XAxis {
	private String type;
	private Object boundaryGap;
	private String name;
	private List data;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getBoundaryGap() {
		return boundaryGap;
	}
	public void setBoundaryGap(Object boundaryGap) {
		this.boundaryGap = boundaryGap;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
