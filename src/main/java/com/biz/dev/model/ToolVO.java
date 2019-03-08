package com.biz.dev.model;

public class ToolVO {
	private String d_img;
	private String d_name;
	
	public ToolVO(String d_img, String d_name) {
		super();
		this.d_img = d_img;
		this.d_name = d_name;
	}
	public ToolVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getD_img() {
		return d_img;
	}
	public void setD_img(String d_img) {
		this.d_img = d_img;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	@Override
	public String toString() {
		return "ToolVO [d_img=" + d_img + ", d_name=" + d_name + "]";
	}
	
	
}
