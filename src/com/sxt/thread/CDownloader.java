package com.sxt.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*
 * �˽ⴴ���̵߳ķ�ʽ����
 * 1��ʵ��callable�ӿ�
 * 2����дrun
 * 
 * 
 */
public class CDownloader implements Callable<Boolean>{
 
	
	private String url; //Զ��·��
	private String name;//�洢����
	
 
	
	
	public CDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}


	@Override
	public Boolean call() throws Exception{
    WebDownloader wd = new WebDownloader();
    wd.download(url,name);
    System.out.println(name);
    return true;
    
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CDownloader  cd1 = new CDownloader("http://www.jirou.com/jirou/cx/20190103/12056.html","1.jpg");
		CDownloader  cd2 = new CDownloader("http://fashion.people.com.cn/GB/n1/2017/0317/c1014-29150737.html","2.jpg");
		CDownloader  cd3 = new CDownloader("http://sports.eastday.com/a/180321113551146000000.html","3.jpg");
		
		//����ִ�з���
		ExecutorService ser = Executors.newFixedThreadPool(3);
	   //�ύִ�У�
		Future<Boolean> result1 = ser.submit(cd1);
		Future<Boolean> result2 = ser.submit(cd2);
		Future<Boolean> result3 = ser.submit(cd3);
		//��ȡ�����
		boolean r1 = result1.get();
		boolean r2 = result2.get();
		boolean r3 = result3.get();
		System.out.println(r3);
		//�رշ���
		ser.shutdownNow();
		
	}
}
