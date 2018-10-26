package practice13.common;

public class Item {
	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

	String name;
	int additionalDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

	public void setName(int additionalDamage) {
		this.additionalDamage=additionalDamage;
	}


	//記入し損ねたため、itemの反映がされなかった

	public Item(String name,int additionalDamage){
		this.name=name;
		this.additionalDamage=additionalDamage;
	}
}

