package com.dkry.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dkry.bean.VideoInfo;
import com.dkry.mapper.VideoInfoMapper;

/**
 * 
 * @author Anderson
 * 
 */
public class VideoInfoService {
	@Autowired
	private VideoInfoMapper videoInfoMapper;

	public int addVideoInfo(VideoInfo videoInfo) {
		int count = videoInfoMapper.insertVideoInfo(videoInfo);
		return count;
	}

	public int selectVideoInfoByUrl(String url) {
		List<VideoInfo> list = videoInfoMapper.selectVideoInfoByUrl(url);
		return list.size();
	}
	public ArrayList<VideoInfo>  selectAllVideoInfo() {
		List<VideoInfo> list = videoInfoMapper.selectAllVideoInfo();
		return (ArrayList<VideoInfo>) (null==list?null:list);
	}
	public VideoInfo selectVideoInfoById( int id){
		VideoInfo videoInfo = videoInfoMapper.selectVideoInfoById(id);
		return null==videoInfo?null:videoInfo;
	}
}
