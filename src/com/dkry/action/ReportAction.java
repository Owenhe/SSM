/**
 * 
 */
package com.dkry.action;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.dkry.bean.VideoInfo;
import com.dkry.service.VideoInfoService;

/**
 * 
 * @author Anderson
 * 
 */
@SuppressWarnings("serial")
public class ReportAction {

	private static Logger log = Logger.getLogger(ReportAction.class);
	@Autowired
	private VideoInfoService videoInfoService;
	private VideoInfo videoInfo;
	public VideoInfo getVideoInfo() {
		return videoInfo;
	}
	public void setVideoInfo(VideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	ArrayList<VideoInfo> list;
	public ArrayList<VideoInfo> getList() {
		return list;
	}
	public void setList(ArrayList<VideoInfo> list) {
		this.list = list;
	}
	public String init() {
		list=(ArrayList<VideoInfo>) videoInfoService.selectAllVideoInfo();
		return "success";
	}
	public String detail(){
		videoInfo=videoInfoService.selectVideoInfoById(id);
		return "success";
	}
}
