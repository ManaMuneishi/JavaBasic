package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int w = 0; w < (5 - i); w++) {
				System.out.print("□");
			}
			System.out.println("");
		}

		for (int i = 0; i < 5; i++) {

			for (int w = 0; w < (5 - i); w++) {
				System.out.print("■");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("□");
			}

			System.out.println("");
		}







		/*for (int i = 0; i < 10; i++) {  // 模様違い


			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int w = 0; w < (10 - i); w++) {
				System.out.print("□");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("□");
			}
			for (int w = 0; w < (10 - i); w++) {
				System.out.print("■");
			}
			System.out.println("");
		}*/

		/*for (int i = 0; i < 10; i++) {    ///模様違い

			for (int j = 0; j < i/2; j++) {
				System.out.print("■");
			}
			for (int w = 0; w < (5 - i/2); w++) {
				System.out.print("□");
			}
			for (int j = 0; j < i/2; j++) {
				System.out.print("□");
			}
			for (int w = 0; w < (5 - i/2); w++) {
				System.out.print("■");
			}
			System.out.println("");
		}*/




		/*for (int i = 0; i < 10; i++) {    ///模様違い

			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int w = 0; w < (5 - i); w++) {
				System.out.print("□");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("□");
			}
			for (int w = 0; w < (5 - i); w++) {
				System.out.print("■");
			}
			System.out.println("");
		}*/




		/*for (int i = 0; i < 5; i++) {   ///模様違い。

			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int w = 0; w < (5 - i); w++) {
				System.out.print("□");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("□");
			}
			for (int w = 0; w < (5 - i); w++) {
				System.out.print("■");
			}
			System.out.println("");
		}*/
	}
}
