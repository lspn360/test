
public class Test06_ {

	public static void main(String[] args) {
		// 6時間目以降に使用
		int a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		int a1 = 10;
		System.out.println(a1++);
		System.out.println(a1++);
		// 7時間目
		int a3 = 30;
		if(a3 <= 20){
			System.out.println("ある数a3は20以下");
		}
		int b = 5;
		if(b >= 5 || b <= 0){
			System.out.println("B");
		}
		int a4 = 9;
		if(a4>8){
			System.out.println("A");
		}else if(a4<10){
				System.out.println("B");
		}
		int a5 = 3;
		if(a5>5){
			System.out.println("A");
		}else{
			System.out.println("Z");
		}
		int a6 = 25;
		if(a6<8){
			System.out.println("A");
		}else if(a6 == 8){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		int b1 = 25;
		if(b1>=20){
			System.out.println("成人");
		}else{
			System.out.println("未成年");
		}

		int age = 55;
		if(age<20){
			System.out.println("未成年");
		}else if(age>80){
			System.out.println("高齢者");
		}else{
			System.out.println("成人");
		}

		int c = 2;
		if(c%2 == 0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
	}
}
