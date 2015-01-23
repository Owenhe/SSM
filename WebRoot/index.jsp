<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>多空如弈网</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
body {
	margin: 0 0 0 0;
	background: url("img/bg.gif") repeat-x scroll 0 0 rgba(0, 0, 0, 0)
}

#top {
	margin: 0 15% 0 15%;
	height: 46px;
	background-image: url('img/logo.png');
	background-repeat: no-repeat;
	background-color: #b30000;
	width: 100%;
}

#navicat {
	margin-top: 10px;
	margin-left: 15%;
}

#content {
	margin: 10 0 0 0;
	padding: 0px;
}

#right {
	margin: 1px;
	padding-left: 0px;
	padding-right: 200px;
}

#left {
	margin: 1px;
	padding: 0px;
	padding-left: 15%;
	float: left;
	height: 500px;
	width: 100px;
}

#view { /* //margin-left: 1px; */
	padding-left: 10px;
	float: left;
}

#na {
	padding: 20 0 0 20%;
	font: 
}

#na a {
	color: #ffffff;
}

.nav_top {
	background: url("img/nav_top_bg.jpg") repeat-x scroll 0 0
		rgba(0, 0, 0, 0);
	height: 33px;
	position: relative;
	z-index: 11;
}

.login {
	margin-left: 1000px;
	padding-top: 20px;
}

a.imgs:hover span {
	background: url("img/v-newly-dlh-bg.png") no-repeat scroll left top
		rgba(0, 0, 0, 0);
	cursor: pointer;
	height: 108px;
	position: absolute;
	width: 155px;
	z-index: 2;
}
/*   a.imgs span {
      background: url("http://cimg.178.com/dota/zt/v/v-newly-dl-bg.png") no-repeat scroll left top rgba(0, 0, 0, 0); 
    cursor: pointer;
    height: 108px;
    position: absolute;
    width: 155px;
    z-index: 2;
}  */
</style>
</head>


<body>
	<div class="nav_top">
		<span class="login">登录</span>
	</div>
	<div id="top">
		<div id="na">
			<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</div>
	<!-- <div id="navicat">
		<a href="#">视频</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
			href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
			href="#">导航菜单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">导航菜单</a>
	</div> -->
	<div id="content">
		<div id="left">
			<li><a href="#">菜单导航</a></li>
			<li><a href="#">菜单导航</a></li>
			<li><a href="#">菜单导航</a></li>
			<li><a href="#">菜单导航</a></li>
			<li><a href="#">菜单导航</a></li>
		</div>
		<div id="right">
			<s:iterator value="list" status="statu" id="item">
				<div id="view">
					<div>
						<a class="imgs" href="detail.action?id=<s:property value='id' />"><img
							src="<s:property value='pic_url'/>  " width="120" height="100" />
							<span></span> </a>
					</div>
					<div>
						<s:property value='video_name' />
					</div>
				</div>
			</s:iterator>
		</div>
	</div>

	<!-- JiaThis Button BEGIN -->
	<script type="text/javascript">
		var jiathis_config = {
			data_track_clickback : 'true'
		};
	</script>
	<script type="text/javascript"
		src="http://v3.jiathis.com/code/jiathis_r.js?btn=r4.gif&amp;uid=2004666"
		charset="utf-8"></script>
	<!-- JiaThis Button END -->
	<!-- UJian Button BEGIN -->
	<script type="text/javascript"
		src="http://v1.ujian.cc/code/ujian.js?type=slide"></script>
	<!-- UJian Button END -->

	<!-- cnzz -->
	<script type="text/javascript">
		var cnzz_protocol = (("https:" == document.location.protocol) ? " https://"
				: " http://");
		document
				.write(unescape("%3Cspan id='cnzz_stat_icon_1254132127'%3E%3C/span%3E%3Cscript src='"
						+ cnzz_protocol
						+ "s95.cnzz.com/z_stat.php%3Fid%3D1254132127%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
	</script>
</body>
</html>
