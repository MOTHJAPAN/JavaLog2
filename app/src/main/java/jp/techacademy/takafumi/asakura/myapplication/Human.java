package jp.techacademy.takafumi.asakura.myapplication;


import android.util.Log;

class Human extends Animal implements Thinkable {


        // コンストラクタ
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }


    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" );
    }

    public void think() {
        Log.d("javatest", "私は趣味について考える。" );
    }   //Thinkableを出力


}









