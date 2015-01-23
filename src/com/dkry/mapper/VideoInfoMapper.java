package com.dkry.mapper;


import java.util.List;

import com.dkry.bean.VideoInfo;

public interface VideoInfoMapper {
	public int insertVideoInfo(VideoInfo videoInfo);
	public List<VideoInfo> selectVideoInfoByUrl(String url);
	public List<VideoInfo> selectAllVideoInfo();
	public VideoInfo selectVideoInfoById(int id);
}
