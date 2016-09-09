package jp.techacademy.takafumi.asakura.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("剛史", 37,"趣味");     // 名前をTakafumi、年齢37歳で、Humanのインスタンスを作る

        human.say();
        human.think();          //thinkを実装
    }

}