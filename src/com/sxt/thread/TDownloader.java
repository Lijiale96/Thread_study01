package com.sxt.thread;

public class TDownloader extends Thread {
 
	
	private String url; //远程路径
	private String name;//存储名字
	
 
	
	
	public TDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}


	@Override
	public void run() {
    WebDownloader wd = new WebDownloader();
    wd.download(url,name);
	}
	
	public static void main(String[] args) {
		TDownloader  td1 = new TDownloader("http://www.jirou.com/jirou/cx/20190103/12056.html","1.jpg");
		TDownloader  td2 = new TDownloader("http://fashion.people.com.cn/GB/n1/2017/0317/c1014-29150737.html","2.jpg");
		TDownloader  td3 = new TDownloader("http://sports.eastday.com/a/180321113551146000000.html","3.jpg");
		
		//启动三个线程
	    td1.start();
	    td2.start();
	    td3.start();
		
//		td1.run();
//	    td2.run();
//		td3.run();
		
	}
}
