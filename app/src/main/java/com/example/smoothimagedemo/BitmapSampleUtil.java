package com.example.smoothimagedemo;

import java.util.Random;

public class BitmapSampleUtil {

	public static String[] IMAGES = new String[] {
			"http://images.china.cn/attachement/jpg/site1000/20121114/001aa0ba5c77120d2cd45d.jpg",
			"http://img7.9158.com/200709/01/11/53/200709018758949.jpg",
			"http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1209/10/c1/13758581_1347257278695.jpg",
			"http://imgt4.bdstatic.com/it/u=3458459038,2718284416&fm=23&gp=0.jpg",
			"http://a1.att.hudong.com/39/46/01200000012881116174646886639.jpg",
			"http://img3.redocn.com/tupian/20150806/weimeisheyingtupian_4779232.jpg",
			"http://h5.86.cc/walls/20150922/1024x768_0cce092c00c8dec.jpg",
			"http://www.176web.net/upload/picture/201209/s/04114912.jpg",
			"http://image72.360doc.com/DownloadImg/2014/05/0402/41292510_3.jpg", };


	/**
	 * 随机产生的一个图片Url
	 * 
	 * @return
	 */
	public static String getBmpUrl() {
		int index = new Random().nextInt(IMAGES.length);
		return IMAGES[index];
	}
}
