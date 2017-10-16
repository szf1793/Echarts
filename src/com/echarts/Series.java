package com.echarts;

import java.util.List;

/**
* @Title:Series 
* @Description: 
* @author Shen Zhenfei
* @date 2016-10-25上午10:04:52
 */
public class Series {
    private String name;
    private String type;
    private String stack;
    private List data;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
}
