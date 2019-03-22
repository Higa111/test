package javaobject;

public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name="山田 太郎";
		taro.age=20;
		taro.phoneNumber="0120-000-1234";
		taro.address="東京都";
		
		
		Person jiro = new Person();
		jiro.name="木村 次郎";
		jiro.age=18;
		jiro.phoneNumber="0120-000-5678";
		jiro.address="神奈川県";
		
		Person hanako = new Person();
		hanako.name="鈴木 花子";
		hanako.age=16;
		hanako.phoneNumber="0120-000-9012";
		hanako.address="埼玉県";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println("");
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println("");
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println("");
		
		
		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println("");
		
		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println("");
		
		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
		System.out.println("");
		
		

	}

}
