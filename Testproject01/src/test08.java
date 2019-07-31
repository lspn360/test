
public class test08 {

	public static void main(String[] args) {
		// 8時間目以降
		int a = 50;
		if(a>10){
			if(a<30){
				System.out.println("A");
			}
		}

		int a1 = 15;
		if(a1>0){
			if(a1 == 2){
				System.out.println("A");
			}else if(a1 == 3){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
		}

		int number = 77;
		if(number<=100){
			if(number<20){
				System.out.println("未成年");
			}else if(number==77){
				System.out.println("喜寿");
			}else if(number==88){
				System.out.println("米寿");
			}else{
				System.out.println("成人");
			}

			// 9時間目
			int a2 = 0;
			switch(a2){
			case 0:
				System.out.println("a2は0に等しい");
				break;
			case 1:
				System.out.println("a2は1に等しい");
				break;
			}

			int a3 = 5;
			switch(a3){
			case 0:
				System.out.println("a3は0に等しい");
				break;
			case 1:
				System.out.println("a3は1に等しい");
				break;
				default:
					System.out.println("a3は0でも1でもない");
			}

			String b = "緑";
			switch(b){
			case "赤":
				System.out.println("赤組です");
				break;
			case "白":
				System.out.println("白組です");
				break;
				default:
					System.out.println("エラーです");
			}
		}
	}

}
