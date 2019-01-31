package practice11;

import java.util.Scanner;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		//入力してもらう
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();


		//ファイルと入力結果を比較する。あればファイルを出力。
		for(int i = 0; i < books.length; i++) {

			if (books[i].title.contains(row)) {
					System.out.println(books[i].dispBookInfo());
			
			}
		}
		scanner.close();
	}
}
