package jp.techacademy.takafumi.asakura.myapplication;


import android.util.Log;

class Human extends Animal implements Thinkable {


        // コンストラクタ
        public Human(String name, int age, String hobby) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name +"です。" +  "年は" + this.age + "歳です。" );
    }

    private String hobby = "趣味";

    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える。" );
        Log.d("javatst", "私の名前は" + name + "です。年は" + age +"歳です。" );
    }   //Thinkableを出力

}









