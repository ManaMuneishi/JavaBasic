package practice10;

public class Car {
	//フィールド
	int serialNo;
	String color;
	int gasoline;

	//メソッド
	int run() {
		int i = 1;
		this.gasoline --;
		if (this.gasoline > 0) {
			int d = new java.util.Random().nextInt(14);
			return d + 1;
		}else {
			return i;
		}
	}
}
