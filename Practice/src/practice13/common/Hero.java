package practice13.common;

public class Hero extends Character{
	//HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	public Hero (){
		//↑引数なしのコンストラクタが必要。（characterクラスには、デフォルトコンストラクタがないので、エラーになる。)
		//継承先のクラスのコンストラクタは、super()引数だけでOK.
		super(25, 10, 7);
	}
}