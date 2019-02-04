package practice13.common;

public class Employee extends Person{

	//フィールド
	private String departmentNm; //部署名
	private int departmentCnt;//部署人数

	//アクセサ
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm= departmentNm;
	}
	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}


	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

}

