package practice10;

import java.util.Scanner;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {


	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User [] users = new User[3]; //ここでは箱を作ってるだけ

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		Scanner scanner = new Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for(int i = 0; i < users.length; i++) {

			int count = i + 1;
			System.out.println(count + "人目の情報を入力します");/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String lines [] = line.split(",");

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです

			users[i] = new User();
			//ここ大事。
			users[i].userId = Integer.parseInt(lines[0]);
			users[i].userNm = lines[1];
			users[i].mail = lines[2];
			users[i].password = lines[3];
		}
		//----------- ループ end
		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

		for(int j = 0; j < users.length; j++) {
			System.out.println(users[j].userId);
			System.out.println(users[j].userNm);
			System.out.println(users[j].mail);
			System.out.println(users[j].password);
		}
		scanner.close();
	}

}
