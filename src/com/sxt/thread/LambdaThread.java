package com.sxt.thread;


/*
 *Lambda ���ʽ ���̣߳���һ�Σ���ʹ��
 */
public class LambdaThread {
	
	//��̬�ڲ���
     static class Test implements Runnable{
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("һ������");
			}
		}
     }
     
	public static void main(String[] args) {
		//new Thread(new Test()).start();
		
		//�ֲ��ڲ���
		class Test2 implements Runnable{
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("һ������");
				}
			}
	     }
		//�����ڲ���  ��������ӿڻ��߸���
		new Thread(new Test2()).start();
		
		//�����ڲ���  ��������ӿڻ��߸���
	  new Thread(new Runnable(){
			  public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("һ������");
			}
		}
     }).start();
	  
	  //jdk8  �� lambda���ʽ
	  new Thread(()->{
		for (int i = 0; i < 20; i++){
			System.out.println("һ������");
		}
 }).start();
	}
}
