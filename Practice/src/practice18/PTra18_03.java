/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>(); //arrayには一行ごとの情報が入ってる
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {//情報一行ずつ格納
            while (scanner.hasNext()) { //次にデータがあるか確認する
                String line = scanner.nextLine();//参照先を次に移動する
                String [] i = line.split(",");//lineを分けたやつをiとする

                Player p = new Player(); //playerクラスのインスタンス作る
                p.setPosition(i[0]);//フィールドごとの情報が入ってて取り出しやすい
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

        //(イテレータで、指定したものを削除)//removeAll もしくは removeをfor文に入れて実行してもできる。
        Iterator<Player> f = array.iterator();
        while(f.hasNext()){
        	Player Remove = f.next();
        	if (Remove.getTeam().equals("レアル・マドリード")||Remove.getTeam().equals("バルセロナ")) {
        		f.remove(); //Remove = 全部の要素。teamのところからでないと、取得できない。
        	}
        }
        	// ★ 削除後のArrayListの中身を全件出力してください
        for(Player file : array) {
            System.out.println(file);
        }
	}
}


