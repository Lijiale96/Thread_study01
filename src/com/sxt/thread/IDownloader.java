package com.sxt.thread;

public class IDownloader implements Runnable{
 
	
	private String url; //远程路径
	private String name;//存储名字
	
 
	
	
	public IDownloader(String url, String name) {
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
		IDownloader  td1 = new IDownloader("http://www.jirou.com/jirou/cx/20190103/12056.html","1.jpg");
		IDownloader  td2 = new IDownloader("http://fashion.people.com.cn/GB/n1/2017/0317/c1014-29150737.html","2.jpg");
		IDownloader  td3 = new IDownloader("http://sports.eastday.com/a/180321113551146000000.html","3.jpg");
		
		//启动三个线程
	   new Thread(td1).start();
	   new Thread(td2).start();
	   new Thread(td3).start();
		
//		td1.run();
//	    td2.run();
//		td3.run();
		
	}
}
