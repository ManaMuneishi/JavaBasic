package practice14.common;

public class DBCource implements Course{
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
		String courseName = "【Eラーニング】DB基礎";
		return courseName;
	}

	public String[] getCourseUnit() {
	String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return courseUnit;
	}
}
