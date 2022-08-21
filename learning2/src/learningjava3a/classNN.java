package learningjava3a;

class classA{
	String st = "Mr";
  void test() {
	  String str = "karthik";
	  System.out.println(str);
  }
  void test1() {
	  String str1 = "naresh";
	  System.out.println(str1);
	  System.out.println(st);
  }
}

public class classNN {

	public static void main(String[] args) {
	classA hh= new classA();
	 hh.test();
	 hh.test1();
	}
}
