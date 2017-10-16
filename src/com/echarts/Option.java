package com.echarts;

import java.util.ArrayList;
import java.util.List;

/**
* @Title:Option 
* @Description: 
* @author Shen Zhenfei
* @date 2016-10-25上午10:04:38
 */
public class Option {
    private Title title;
    private Tooltip tooltip;
    private Toolbox toolbox;
    private Grid grid;
    private Legend legend = new Legend();
    private List<XAxis> xAxis = new ArrayList<XAxis>();
    private List<YAxis> yAxis = new ArrayList<YAxis>();
    private List<Series> series = new ArrayList<Series>();
    private Feature feature;
    
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Tooltip getTooltip() {
		return tooltip;
	}
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	public Toolbox getToolbox() {
		return toolbox;
	}
	public void setToolbox(Toolbox toolbox) {
		this.toolbox = toolbox;
	}
	public Grid getGrid() {
		return grid;
	}
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	public Legend getLegend() {
		return legend;
	}
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
	public List<XAxis> getxAxis() {
		return xAxis;
	}
	public void setxAxis(List<XAxis> xAxis) {
		this.xAxis = xAxis;
	}
	public List<YAxis> getyAxis() {
		return yAxis;
	}
	public void setyAxis(List<YAxis> yAxis) {
		this.yAxis = yAxis;
	}
	public List<Series> getSeries() {
		return series;
	}
	public void setSeries(List<Series> series) {
		this.series = series;
	}
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
    
   
}
