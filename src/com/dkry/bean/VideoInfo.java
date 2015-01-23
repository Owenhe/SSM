package com.dkry.bean;

public class VideoInfo {
	private int id;
	private String video_name;
	private String time_of_length;
	private String pic_url;
	private String release_time;
	private String flash_url;
	private String classification;
	private String insert_time;

	public String getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVideo_name() {
		return video_name;
	}

	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}

	public String getTime_of_length() {
		return time_of_length;
	}

	public void setTime_of_length(String time_of_length) {
		this.time_of_length = time_of_length;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public String getRelease_time() {
		return release_time;
	}

	public void setRelease_time(String release_time) {
		this.release_time = release_time;
	}

	public String getFlash_url() {
		return flash_url;
	}

	public void setFlash_url(String flash_url) {
		this.flash_url = flash_url;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

}
