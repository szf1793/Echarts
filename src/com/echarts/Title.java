package com.echarts;

/**
* @Title:Title 
* @Description: 
* @author sxt
* @date 2016-10-25上午10:05:10
 */
public class Title {
    private String text;
    private String subtext;
    private String title;
    private String left;   //格式，居中，左，右
    private String sublink;  //链接
   
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getSubtext() {
        return subtext;
    }
    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	public String getSublink() {
		return sublink;
	}
	public void setSublink(String sublink) {
		this.sublink = sublink;
	}
    
}
