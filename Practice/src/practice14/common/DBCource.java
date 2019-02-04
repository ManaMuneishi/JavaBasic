package practice14.common;

public class DBCource{
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	public String getCourseName() {
		String courseName = "【Eラーニング】Java";
		return courseName;
	}

	String[] getCourseUnit = {"式と演算","制御構文","メソッド","配列",
								"オブジェクト指向","継承","高度な継承"};

}
