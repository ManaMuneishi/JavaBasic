package practice18.entity;

public class Player {
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
	//フィールド
	private String position;
	private String name;
	private String country;
	private String team;

	//アクセサ
	public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    //csvから区切った情報を取得(=文字の羅列)しているので、表示するときに見やすいよう、もう一度カンマを入れる。
    //toStringオーバーライド(return内容を返してくれるメソッドとしても使える)
    public String toString() {
		 return position + "," + name + ","  + country + ","  + team;
    }
  //オーバーライドすると、objectクラス内容のtoStringではなくなる=アドレス経由しないので出力楽。かつ他クラスの出力と表示内容揃う。










}
