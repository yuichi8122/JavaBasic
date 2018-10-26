/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee [] es = new Employee[3];

		Employee es1 = new Employee();
		Employee es2 = new Employee();
		Employee es3 = new Employee();

		es[0]= es1;
		es[1]= es2;
		es[2]= es3;


		for (int i = 0; i < es.length; i++) {
			es[i].setUserNm(NAMEDATA[i]);
			es[i].setMail(MAILDATA[i]);
			es[i].setPassword(PASSDATA[i]);
			es[i].setDepartmentNm(QUATERDATA[0][i]);
			es[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));

		}

	}

}
