package jp.co.internous.action;

public class Human {
	
	public static void main(String[]args){
		
		
		HumanName abc=new HumanName();
		HumanAge efg=new HumanAge();
		HumanAddress hij=new HumanAddress();
		System.out.println(abc.getName()+"さん");
		System.out.println(efg.getAge()+"歳");
		System.out.println(hij.getAddress());
	}
}
