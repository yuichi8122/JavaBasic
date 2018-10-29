package practice14.common;

public class JavaCourse implements Course {
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	public String getCourseName() {
		return PREFIX+"Java";
	}



	public String [] getCourseUnit(){
		String[]getCourseUnit = new String[7];

		getCourseUnit[0]="式と演算";
		getCourseUnit[1]="制御構文";
		getCourseUnit[2]="メソッド";
		getCourseUnit[3]="配列";
		getCourseUnit[4]="オブジェクト指向";
		getCourseUnit[5]="継承";
		getCourseUnit[6]="高度な継承";

		return getCourseUnit();
	}



}
