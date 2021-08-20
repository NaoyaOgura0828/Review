package entity;

/* Entityクラス */
public class Member {
    /* フィールド */
    private int id;
    private String name;
    private String email;


    public Member() {} // デフォルトコンストラクタ

    public Member(int id, String name, String email) {
        /* コンストラクタ */
        this.id = id;
        this.name = name;
        this.email = email;
    }


    /* getterとsetter */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
