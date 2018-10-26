/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero h = new Hero();
		Slime meta = new Slime();

		h.setName("勇者");
		meta.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while (true) {

			if (meta.damage(h.attack())) {
				System.out.println(h.getName() + "は戦闘に勝利した");
				break;
			}

			if (h.damage(meta.attack())) {
				System.out.println(meta.getName() + "は戦闘に勝利した");
				break;
			}

			// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		}
	}
}
/*public boolean damage(int attack) {
	// ダメージ計算
	int calc = attack - this.endurance;
	if (calc <= 0) {
		// 必ず1ダメージは入るようにする
		calc = 1;
	}

	// ダメージ分体力を減らす
	this.hp -= calc;

	// 体力がなくなったかどうかの判定
	if (this.hp <= 0) {
		this.hp = 0;
		return true;
	}

	return false;
}*/