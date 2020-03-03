package com.sxt.thread;


/*
 * lambda 推导+参数 + 返回值
 * 
 */
public class LambdaTest04 {
	
	
   public static void main(String[] args) {
	  new Thread(()->{
		  for (int i = 0; i <100; i++) {
			  System.out.println("一边学习lambda");
		}
	  }) .start();
	  
	  new Thread(()-> System.out.println("一边奔溃")) .start();
	  
	  
	}
}
