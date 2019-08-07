// コレクションフレームワーク List
import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[]args){
	List<String> list = new ArrayList<String>();

	//値の記憶は add メソッドを使用。

	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");

	//値の取得

	for(int i=0; i<list.size(); i++){
		//値の取得は get メソッドを使用
		//list.size=リストの要素の数（ここでは5）
		//list.get(i)でi番目の要素を出力している。
		//iはfor文での加算子によって1ずつ足される
		//即ちi<5の条件式でi=5になるまでfor文を繰り返している。
		//ここでは0から4番目までの要素（1,2,3,4,4）を出力
		System.out.println(list.get(i));
	}

	//拡張for文を使用するともっと簡単
	for(String s:list){
		System.out.println(s);
		//リスト全てを出力している。
	}

	}

}
