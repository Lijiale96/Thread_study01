package com.sxt.thread;


/*
 * ��̬����
 * �ӿڣ�
 * 1����ʵ��ɫ
 * 2�������ɫ
 */
public class StaticProxy {
   public static void main(String[] args) {
	new WeddingCompany(new You()).happyMarry();
	
	//new Thread().start();
}
	
}
interface Marry{
	void happyMarry();
	
}
//��ʵ��ɫ
class You implements Marry{
	
	public void happyMarry() {
		System.out.println("you and �϶����ڱ����ˡ�����");
  
	}
	
	
}
//�����ɫ
class WeddingCompany implements Marry{
     //��ʵ��ɫ
	private Marry target;
	public WeddingCompany(Marry target) {
		this.target = target;
		
	}
	@Override
	public void happyMarry() {
		// TODO Auto-generated method stub
		ready();
		this.target.happyMarry();
		after();
	}
	private void ready() {
		System.out.println("��������");
	}
	
private void after() {
  System.out.println("������");		
	}
}
