package service;

import entity.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {
    /* 実装クラス */

    /* シングルトン */
    private static MemberServiceImpl singleton = new MemberServiceImpl(); // MemberServiceImplを使ってsingletonインスタンスを作成する（privateなのでsingleton呼び出し不可）
    private MemberServiceImpl() {} // 外部からのnewを禁止する
    public static MemberServiceImpl getInstance() {
        /* singletonインスタンスを呼び出す為のメソッド */
        return singleton; // singletonを返す
    }

    @Override
    public String greet(int i) {
        /* 挨拶のメソッド */
        String[] greetings = {"Good Morning", "Hello", "Good evening"}; // 挨拶文の入ったリストの作成
        return greetings[i]; // 0～2の値によってリストの中身を返す
    }

    @Override
    public ArrayList<Member> getAll() {
        /* メンバー情報のメソッド */
        ArrayList<Member> list = new ArrayList<>(); // nullのlistの作成
        Member mem1 = new Member(1, "Linda", "linda@example.com"); // メンバー情報のインスタンス化
        Member mem2 = new Member(2, "James", "james@example.com"); // メンバー情報のインスタンス化
        list.add(mem1); // listにmem1のユーザーデータを格納
        list.add(mem2); // listにmem2のユーザーデータを格納

        return list; // listを返す
    }

    @Override
    public int sumOf(int x, int y) {
        /* xからyまでの範囲でインクリメントしていくメソッド */
        int sum = 0; // ローカル変数sumの作成
        for (int i = x; i <= y; i++) {
            /* forループで初期値xをインクリメントしていきy以下の間は継続する。 */
            sum += i; // sumに値を格納していく
        }
        return sum; // sumを返す
    }
}
