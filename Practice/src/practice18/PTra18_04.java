/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<Player>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] i = line.split(",");

                Player p = new Player();
                p.setPosition(i[0]);
                p.setName(i[1]);
                p.setCountry(i[2]);
                p.setTeam(i[3]);
                array.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください



        //GK1名を表示
        Player player = new Player();
        ArrayList<Player> gk = new ArrayList<Player>();
        ArrayList<Player> df = new ArrayList<Player>();
        ArrayList<Player> mf = new ArrayList<Player>();
        ArrayList<Player> fw = new ArrayList<Player>();

        }
	private static void add(Collection<E> collection) {
		collection.add(get)





        Collections.shuffle(array);
        System.out.println(array.get(0));


        }
	}
}
