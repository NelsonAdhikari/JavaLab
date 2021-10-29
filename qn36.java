package JavaLabPractical;

public class qn36 {
	//3.1 default access modifier
	//Addition.java

	package myPackage;
	public class Addition{
	int addTwoNumbers(int x, int y){
	return x+y;
	}
	}

	//TestDefault.java

	package hisPackage;
	import myPackage.*;
	public class TestDefault {
	public static void main(String[] args){
	Addition addObj = new Addition();
	addObj.addTwoNumbers(20,30);
	}
	}

	//3.2 private access modifier
	//privateABC.java

	class privateABC{
	private int num = 100;
	private int square(int a){
	return a*a;
	}
	}

	//TestPrivate.java

	public class TestPrivate{
	public static void main(String[] args){
	privateABC obj = new privateABT();
	System.out.println(obj.num);
	System.out.println(obj.square(10));
	}
	}

	//3.3 protected access modifier
	//Addition.java

	package myPackage;
	public class Addition{
	protected int addTwoNumbers(int a, int b){ return a+b;
	}
	}

	//TestProtected.java

	package hisPackage;
	import myPackage.*;
	class TestProtected extends Addition{
	public static void main(String[] args){
	TestProtected obj = new TestProtected();
	System.out.println(obj.addTwoNumber(12,15));
	}
	}

	//3.4 public access modifier
	//Addition.java

	package abcPackage;
	public class Addition {
	public int addTwoNumbers(int a, int b){
	return a+b;
	}
	}

	//Test.java

	package xyzPackage;
	import abcPackage;
	class Test{
	public static void main(String[] args){
	Addition obj = new Addition();
	System.out.println(obj.addTwoNumbers(10,20))
	}
}
