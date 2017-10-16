package com.echarts;

/**
* @Title:RoamController
* @Description: 
* @author Shen Zhenfei
* @date 2016-10-25上午10:04:48
 */
public class RoamController {
	
	private boolean show;
	private String x;
	private MapTypeControl mapTypeControl;
	
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public MapTypeControl getMapTypeControl() {
		return mapTypeControl;
	}
	public void setMapTypeControl(MapTypeControl mapTypeControl) {
		this.mapTypeControl = mapTypeControl;
	}

}
