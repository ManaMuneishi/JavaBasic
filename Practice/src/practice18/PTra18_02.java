/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>(); //ArrayList作成
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {//情報一行ずつ格納
            while (scanner.hasNext()) { //イテレータ

                String line = scanner.nextLine();//一行読み込む
                String [] i = line.split(",");//lineという配列をカンマで区切った結果がiになる

                Player p = new Player(); //playerクラスのインスタンス作る
                p.setPosition(i[0]);//セッターに、配列となったリストの中身をおく。i[0]にはpositionが入ってる。
                p.setName(i[1]);
                p.setCountry(i[2]);
                p.setTeam(i[3]);
                array.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }
		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう
        for(Player file : array) {
        	System.out.println(file);
        }
	}
}
