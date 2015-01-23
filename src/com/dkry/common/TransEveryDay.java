package com.dkry.common;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dkry.bean.VideoInfo;
import com.dkry.service.VideoInfoService;

import sun.font.EAttribute;

public class TransEveryDay {
	public static void main(String[] args) {
		String flash_url = "";
		String end_url="http://player.youku.com/player.php/sid/flash_url/v.swf";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:beans.xml");
		VideoInfoService h = (VideoInfoService) context
				.getBean("videoInfoService");
		VideoInfo videoInfo = new VideoInfo();
		try {
			HttpClient client = new HttpClient();
			GetMethod get = new GetMethod(
					"http://i.youku.com/u/UMTgzMDgzMTI1Mg==/videos");
			client.executeMethod(get);
			Document doc = Jsoup.parse(get.getResponseBodyAsString());
			Elements rows = doc.getElementsByClass("yk-col4");
			int i = 0;
			for (Element e : rows) {
				if (e.hasAttr("c_time")) {
					flash_url = e.getElementsByClass("v-meta-title").first()
							.getElementsByTag("a").first().attr("href");
					flash_url=flash_url.substring(flash_url.indexOf("id_")+3,flash_url.indexOf(".html"));
					videoInfo.setFlash_url(end_url.replaceAll("flash_url", flash_url));
					videoInfo.setRelease_time(e.attr("c_time"));
					videoInfo.setPic_url(e.getElementsByTag("img").attr("src"));
					videoInfo.setVideo_name(e.getElementsByTag("img").attr("alt"));
					videoInfo.setTime_of_length(e.getElementsByClass("v-time").html());
				}
				if(h.selectVideoInfoByUrl(videoInfo.getFlash_url())==0){
					h.addVideoInfo(videoInfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
