package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car [] cars = new Car [3];

		Car car1 = new Car();
		car1.serialNo = 18367;
		car1.color = "Pink";
		car1.gasoline = 21;

		Car car2 = new Car();
		car2.serialNo = 20234;
		car2.color = "Yellow";
		car2.gasoline = 80;

		Car car3 = new Car();
		car3.serialNo = 13084;
		car3.color = "Blue";
		car3.gasoline = 38;

		// 目的地までの距離
		final int distance = 300;

		//car達を配列にする

		for (int i = 0; i < cars.length; i++) {
			cars [i] = new Car();
			cars[i].serialNO = Integer.parseInt(car[0]);
			cars[i].color = car;
			cars[i].gasoline = Integer.parseInt(car[2]);


		int num = 0;
		int n = 0;
			while(true) {

				num += cars[i].run();//breakするまでは走った距離になる。
				n++;
				if (cars[i].gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}
				if(distance < num ){
					int x = cars[i].gasoline;//ガソリンは自然にへるのでこのまま
					System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
					break;
				}
			}
		}
	}
}
