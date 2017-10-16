package com.echarts;

import java.util.ArrayList;
import java.util.List;

/**
* @Title:DataRange
* @Description: 
* @author Shen Zhenfei
* @date 2016-10-25上午10:03:31
 */
public class DataRange {
	
	private Integer min;
	private Integer max;
	private String x;
	private String y;
	private boolean calculable;
	private List Text = new ArrayList();
	
	public List getText() {
		return Text;
	}
	public void setText(List text) {
		Text = text;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public boolean isCalculable() {
		return calculable;
	}
	public void setCalculable(boolean calculable) {
		this.calculable = calculable;
	}
	
	
}
