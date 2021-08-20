package demo;

import entity.Member;
import service.MemberServiceImpl;

import java.util.ArrayList;

public class Main {
    /* 実行クラス */

    public static void main(String[] args) {
        /* 実行メソッド */
        MemberServiceImpl service = new MemberServiceImpl();  // MemberServiceImplを使ってserviceインスタンスを作成する
        System.out.println(service.greet(2)); // greetメソッドを実行して引数内の挨拶文を出力する

        System.out.println(service.getAll()); // getAllメソッドを実行してアドレスを出力する（toStringメソッドはオーバーライドしてない）
        ArrayList<Member> list = service.getAll();
        for (Member mem : list) {
            /* Memberの中のlistをforループで取り出す */
            System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail()); // ID、名前、Emailを出力する
        }

        System.out.println(service.sumOf(3, 5)); // 引数xからyまでの値を出力する
    }
}
