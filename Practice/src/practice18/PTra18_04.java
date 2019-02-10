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
import java.util.Collections;
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

        //それぞれグループにする

        ArrayList<Player> gk = new ArrayList<Player>();
        ArrayList<Player> df = new ArrayList<Player>();
        ArrayList<Player> mf = new ArrayList<Player>();
        ArrayList<Player> fw = new ArrayList<Player>();

        for(int j = 0; j <array.size(); j++) {

        	if (array.get(j).getPosition().contains("GK")) { //(contains はboolean)
        	gk.add(array.get(j));
        	}

        	if (array.get(j).getPosition().contains("DF")) {
               df.add(array.get(j));
             }
        	if (array.get(j).getPosition().contains("MF")) {
                mf.add(array.get(j));
              }
        	if (array.get(j).getPosition().contains("FW")) {
                fw.add(array.get(j));
              }
        }
            Collections.shuffle(gk); //それぞれのグループをシャッフルする
            Collections.shuffle(df);
            Collections.shuffle(mf);
            Collections.shuffle(fw);

            System.out.println(gk.get(0)); //gk出力1人

            for (int k = 0; k < 4; k++) {  //df・mfともに出力4人。0を含むから4だ！
            	 System.out.println(df.get(k));
            }
            for (int l = 0; l < 4; l++) {  //df・mfともに出力4人
            System.out.println(mf.get(l));
            }
            for (int n = 0; n < 2; n++) {//fw出力2人
                 System.out.println(fw.get(n));
            }
	}
}
